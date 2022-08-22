package com.cykj.web;

import com.alibaba.fastjson.JSON;
import com.cykj.bean.*;
import com.cykj.service.*;
import com.cykj.utils.SMSUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class UserController {
    @Autowired
    HttpSession session;
    @Autowired
    private TbluserService tbluserSeriver;
    @Autowired
    private TblorderService tblorderService;
    @Autowired
    private TblcommentService tblcommentService;
    @Autowired
    private TblnoticeService tblnoticeService;
    @Autowired
    private TblrecaddressService tblrecaddressService;
    /*登录*/
    @Autowired
    private TblgoodsService tblgoodsService;
    @Autowired
    private TblredpacketService tblredpacketService;
    @Autowired
    private TblcommentService tblcommentService;
    @Autowired
    private TblshoppingcarService tblshoppingcarService;

    /* 查询购物车显示的内容 */
    @ApiOperation(value = "findShoppingcar",notes = "查询购物车显示的内容，传回店铺名称列表、规格内容列表、商品列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userid",value = "登录的用户的id"),
            @ApiImplicitParam(name = "specidList",value = "加入购物车时所选择的那些规格id")
    })
    @RequestMapping(value="/findShoppingcar",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String findShoppingcar(long userid){
        System.out.println("------显示购物车信息------");
        List<Tblshoppingcard> carsList = tblshoppingcarService.findCarShopName(userid);  // 店铺列表
        for(Tblshoppingcard tblshoppingcard : carsList) {
            String shopname = tblshoppingcard.getShopname();
            List<Tblshoppingcard> shopList = tblshoppingcarService.findCarShop(shopname);
            for (Tblshoppingcard shop : shopList) {
                tblshoppingcard.setShopid(shop.getShopid());
                tblshoppingcard.setRoleid(shop.getRoleid());
                tblshoppingcard.setOpentime(shop.getOpentime());
                tblshoppingcard.setEndtime(shop.getEndtime());
                tblshoppingcard.setShopaddress(shop.getShopaddress());
                tblshoppingcard.setShopstate(shop.getShopstate());
                tblshoppingcard.setAuditstate(shop.getAuditstate());
            }
            long shopid = tblshoppingcard.getShopid();
            List<Tblshoppingcard> goodsList = tblshoppingcarService.findCarGoods(userid,shopid);
            tblshoppingcard.setCart(goodsList);
        }

        String json = JSON.toJSONString(carsList);
        return json;
    }

    /* 点击加号或减号或输入数值，修改购物车商品数量 */
    @ApiOperation(value = "updateShoppingcarNum",notes = "更新购物车内商品的购买数量，传回1成功 2失败 0购物车购买数量>商品库存")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "bugnum",value = "加入到购物车的商品的购买数量"),
            @ApiImplicitParam(name = "goodsid",value = "购物车中具体某个商品的商品id"),
            @ApiImplicitParam(name = "userid",value = "该购物车是用户id的")
    })
    @RequestMapping("/updateShoppingcarNum")
    public String updateShoppingcarNum(long bugnum, long goodsid, long userid){
        int goodsnum = tblshoppingcarService.findGoodsNum(goodsid);
        if (bugnum <= goodsnum) {
            boolean flag = tblshoppingcarService.updateShoppingcarNum(bugnum, goodsid, userid);
            if (flag) {
                return "1";     // 购物车内商品数量更新成功
            } else {
                return "2";     // 购物车内商品数量更新失败
            }
        } else {
            return "0";         // 购物车添加的购买数量大于商品的库存，应不可再点击添加按钮或弹提示
        }
    }

    /* 点击加入购物车，将商家id、商品id和用户id加入到购物车中（默认购买数量为1） */
    @ApiOperation(value = "addShoppingcar",notes = "将商品添加到购物车的新增方法，传回1成功 2失败")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "shopid",value = "加入到购物车的店铺的商家id"),
            @ApiImplicitParam(name = "goodsid",value = "加入到购物车的商品的商品id"),
            @ApiImplicitParam(name = "userid",value = "该购物车是用户id的")
    })
    @RequestMapping("/addShoppingcar")
    public String addShoppingcar(long shopid, long goodsid, long userid){
        boolean flag = tblshoppingcarService.addShoppingcar(shopid,goodsid,userid);
        if (flag) {
            return "1";     // 加入购物车成功
        } else {
            return "2";     // 加入购物车失败
        }
    }

    /* 查询已评价的订单信息和评价内容 */
    @ApiOperation(value = "findComment",notes = "查询待评价的订单信息，传回已评价订单信息和所有评价内容的列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userid",value = "登录的用户的id")
    })
    @RequestMapping(value="/findComment",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String findComment(long userid){
        System.out.println("------显示已评价的订单信息------");
        List<Tblcomment> userCommentList = tblcommentService.findComment(userid,1); // 已评价的订单信息和用户评价内容
        List<Tblcomment> shopCommentList = tblcommentService.findComment(userid,3); // 商家评价内容
        for (Tblcomment user : userCommentList) {
            for (Tblcomment shop : shopCommentList) {
                String shopComment = shop.getCommentcontent();
                if (user.getOrderid() == shop.getOrderid()) {
                    user.setShopcomment(shopComment);
                }
            }
        }

        String json = JSON.toJSONString(userCommentList);
        return json;
    }

    /* 查询待评价的订单信息 */
    @ApiOperation(value = "findNoComment",notes = "查询待评价的订单信息，传回待评价的订单和其商家信息列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userid",value = "登录的用户的id")
    })
    @RequestMapping(value="/findNoComment",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String findNoComment(long userid){
        System.out.println("------显示待评价的订单信息------");
        List<Tblcomment> noCommentList = tblcommentService.findNoCommentShop(userid);   // 待评价的订单的商家信息
        for (Tblcomment tblcomment : noCommentList) {
            long orderid = tblcomment.getOrderid();     // 获取待评价的订单的订单id
            List<Tblcomment> list = tblcommentService.findNoCommentGoods(userid,orderid);   // 该订单的商品信息
            tblcomment.setGoodsList(list);
        }
        String json = JSON.toJSONString(noCommentList);
        return json;
    }

    /* 查询【我的红包】 */
    @ApiOperation(value = "findUserRedPacket",notes = "查询【我的红包】，传回用户拥有的红包的列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userid",value = "登录的用户的id")
    })
    @RequestMapping(value="/findUserRedPacket",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String findUserRedPacket(long userid){
        System.out.println("------显示我的红包------");
        List<Tblredpacket> redpacketList = tblredpacketService.findUserRedPacket(userid);
        for(Tblredpacket tblredpacket : redpacketList) {
            String invalidDate = tblredpacket.getInvaliddate();
            SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date(System.currentTimeMillis());
            String nowTime = formatter.format(date);    // 系统当前日期
            // 失效日期 = 系统当前日期，且红包未使用，则修改其状态为“已失效”
            if (invalidDate.equals(nowTime)) {
                boolean flag = tblredpacketService.updateDate(nowTime);
                if (!flag) {
                    return "0";
                }
            }
        }
        List<Tblredpacket> redsList = tblredpacketService.findUserRedPacket(userid);
        String json = JSON.toJSONString(redsList);
        return json;
    }

    /* 点击商品，查看商品详细信息 */
    @ApiOperation(value = "findGoods",notes = "点击商品，查看商品详细信息，传回商品详细信息列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "goodsid",value = "被点击的商品的商品id")
    })
    @RequestMapping(value="/findGoods",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String findGoods(long goodsid){
        System.out.println("------显示商品详细信息------");
        Tblgoods tblgoods = tblgoodsService.findGoods(goodsid);
        String json = JSON.toJSONString(tblgoods);
        return json;
    }

    /* 点餐界面搜索框搜索商品名，点击按钮时执行的查询方法 */
    @ApiOperation(value = "findSearchGoods",notes = "点餐界面搜索框搜索商品名，点击按钮时执行的查询方法，传回对应的商品信息的列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "shopid",value = "点击店铺进入点餐界面，该店铺的id"),
            @ApiImplicitParam(name = "goodsname",value = "搜索框输入的要搜索的商品名")
    })
    @RequestMapping(value="/findSearchGoods",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String findSearchGoods(long shopid, String goodsname){
        System.out.println("------显示根据商品名查询出的商品的信息------");
        List<Tblgoods> searchGoodsList = tblgoodsService.findSearchGoods(shopid,goodsname);     // 搜索框搜索商品名找到对应的商品信息
        String json = JSON.toJSONString(searchGoodsList);
        return json;
    }

    /* 点击商铺查询该店的商品 */
    @ApiOperation(value = "findAllShopGoods",notes = "点击店铺进入点餐界面，显示有关的内容的信息，传回店铺信息类、招牌菜列表、左侧菜单栏内容列表、所有商品列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "shopid",value = "点击店铺进入点餐界面，该店铺的id"),
            @ApiImplicitParam(name = "shopgoodstypeidid",value = "点击店左侧菜单栏，获得shopgoodstypeidid")
    })
    @RequestMapping(value="/findAllShopGoods",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String findAllShopGoods(long shopid){
        System.out.println("------点击商铺查询该店的商品------");
        Tblshop tblshop = tblgoodsService.findShop(shopid);     // 店铺信息
        List<Tblshop> specialityList = tblgoodsService.findSpeciality(shopid);  // 该店铺的招牌菜
        List<Tblshop> shopGoodsTypeList = tblgoodsService.findShopGoodsType(shopid); // 左侧菜单栏的内容
        List<Tblgoods> goodsList = tblgoodsService.findAllGoods(shopid);         // 该店铺的所有商品

        Map<String, Object> map = new HashMap<>();
        String json = JSON.toJSONString(map);
        map.put("tblshop",tblshop);                         // 店铺信息
        map.put("specialityList", specialityList);          // 招牌菜
        map.put("shopGoodsTypeList", shopGoodsTypeList);    // 左侧菜单栏
        map.put("goodsList", goodsList);                    // 所有商品
        return json;
    }

    /* 首页显示所有店铺（根据【店铺名】和【商品名】和【商品类型】模糊查询） */
    @ApiOperation(value = "findAllShop",notes = "首页显示所有店铺（根据【店铺名】和【商品名】和【商品类型】模糊查询），传回所有店铺列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "shopname",value = "店铺名"),
            @ApiImplicitParam(name = "goodsname",value = "商品名"),
            @ApiImplicitParam(name = "typeid",value = "商品类型id")
    })
    @RequestMapping(value="/findAllShop",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String findAllShop(String shopname,String goodsname,long typeid){
        System.out.println("------首页显示所有店铺------");
        for (Tblshop tblshop : tblgoodsService.findAllShopGoods(shopname,goodsname,typeid)) {
            long shopid = tblshop.getShopid();
            List<Double> scoreList = tblgoodsService.findScore(shopid);
            Double scoreAvg = 5.0;
            if (!scoreList.isEmpty()) {
                scoreAvg = scoreList.stream().collect(Collectors.averagingDouble(Double::doubleValue));
            }
            boolean flag1 = tblgoodsService.updateScore(scoreAvg,shopid);
            long salesSum = tblgoodsService.findSales(shopid);
            boolean flag2 = tblgoodsService.updateSales(salesSum,shopid);
        }
        List<Tblshop> shopsList = tblgoodsService.findAllShopGoods(shopname,goodsname,typeid);
        String json = JSON.toJSONString(shopsList);
        return json;
    }

    /* 登录 */
    @ApiOperation(value = "login",notes = "登录方法")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "usertel",value = "登录用户电话"),
            @ApiImplicitParam(name = "userpwd",value = "登录用户密码")
    })
    @RequestMapping("/login")
    public String login(String usertel,String userpwd){
        Tbluser tbluser = tbluserSeriver.login(usertel, userpwd);
        String json = JSON.toJSONString(tbluser);
        return json;
    }

    // 点击发送验证码
    @RequestMapping("/sendMs")
    public String sendMs (HttpServletRequest request, String usertel){
        if(usertel!=null&&!usertel.equals("")){
            String s = SMSUtil.sendSMS(request,usertel);
            JSONObject json = (JSONObject)request.getSession().getAttribute("MsCode");
            System.out.println(json.getString("Code"));
            return json.getString("Code");
        }else{
            return "error";
        }
    }

    // 点击注册
    @RequestMapping("/enroll")
    public String register( String usertel, String userpwd) {
        /* 判断账号是否重复 */
        if (tbluserSeriver.checkTel(usertel)){
            return "3";
        }else {
            // 将用户信息存入数据库、这里省略
            int num = tbluserSeriver.enroll(usertel,userpwd);
            if (num > 0){
                return "1";
            }else {
                return "2";
            }
        }
    }
    /* 忘记密码 */
    @RequestMapping("/setPwd")
    public String setPwd( String usertel, String userpwd){
        System.out.println(usertel);
        /* 判断账号是否重复 */
        if (!tbluserSeriver.checkTel(usertel)){
            return "3";
        }else {
            // 将用户信息存入数据库、这里省略
            int num = tbluserSeriver.setPwd(usertel,userpwd);
            if (num > 0){
                return "1";
            }else {
                return "2";
            }
        }
    }

    /*查询所有订单*/
    @RequestMapping(value = "/findOrder",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String findOrder(){

        DecimalFormat df = new DecimalFormat("#.00");
        List<Tblorder> orderList = tblorderService.findAll(0);
        for (Tblorder tblorder : orderList){
            Double allprice = 0.0;
            int allNum = 0;
            /*查询商品列表*/
            List<Tblgoods> goodsList = tblorderService.findGoods(tblorder.getOrderid());
            for (Tblgoods tblgoods : goodsList){
                allprice += tblgoods.getGoodsprice();
                allNum++;
            }
            /*查询是否已评论*/
            boolean isComment = tblorderService.selComment(tblorder.getOrderid());
            if (isComment){
                tblorder.setIsComment("true");
            }else {
                tblorder.setIsComment("false");
            }
            tblorder.setGoodsList(goodsList);
            tblorder.setGoodsNum(allNum);
            tblorder.setGoodsAllprice(Double.parseDouble(df.format(allprice)));
            System.out.println(tblorder);
        }
        String json = JSON.toJSONString(orderList);
        return json;
    }

    /*查询订单 根据订单id*/
    @RequestMapping(value = "/findOrderbyid",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String findOrderbyid(String orderid){
        DecimalFormat df = new DecimalFormat("#.00");
        List<Tblorder> orderList = tblorderService.findAll(Long.parseLong(orderid));
        for (Tblorder tblorder : orderList){
            Double allprice = 0.0;
            int allNum = 0;
            /*查询商品列表*/
            List<Tblgoods> goodsList = tblorderService.findGoods(tblorder.getOrderid());
            for (Tblgoods tblgoods : goodsList){
                allprice += tblgoods.getGoodsprice();
                allNum++;
            }
            /*查询是否已评论*/
            boolean isComment = tblorderService.selComment(tblorder.getOrderid());

            if (isComment){
                tblorder.setIsComment("true");
            }else {
                tblorder.setIsComment("false");
            }
            tblorder.setGoodsList(goodsList);
            tblorder.setGoodsNum(allNum);
            tblorder.setGoodsAllprice(Double.parseDouble(df.format(allprice)));
            System.out.println(tblorder);
        }
        String json = JSON.toJSONString(orderList);
        return json;
    }

    /*用户评论*/
    @RequestMapping("/sendComment")
    public String sendComment(String orderid,String roleid,String userid,String comment,String score){
        System.out.println(orderid);
        if (tblcommentService.sendComment(Long.parseLong(orderid),Long.parseLong(roleid),Long.parseLong(userid),comment,Long.parseLong(score))){
            return "1";
        }else {
            return "2";
        }
    }

    /*系统信息查询*/
    @RequestMapping(value = "/findNotice",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String findNotice(String receiverid,String roleid){
        List<Tblnotice> list = tblnoticeService.findNotice(Long.parseLong(receiverid),Long.parseLong(roleid));
        String json = JSON.toJSONString(list);
        return json;
    }

    /*清除未读消息*/
    @RequestMapping(value = "/clearNotice",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String clearNotice(String receiverid,String roleid){
        if (tblnoticeService.clearNotice(Long.parseLong(receiverid),Long.parseLong(roleid))){
            return "1";
        }else {
            return "2";
        }
    }

    /*删除通知*/
    @RequestMapping(value = "/delNotice",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String delNotice(String noticeid){
        if (tblnoticeService.delNotice(Long.parseLong(noticeid))){
            return "1";
        }else {
            return "2";
        }
    }

    /*查询用户收货地址*/
    @RequestMapping(value = "/findAddress",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String findAddress(String userid){
        System.out.println(userid);
        List<Tblrecaddress> list = tblrecaddressService.findAddress(Long.parseLong(userid));
        String json = JSON.toJSONString(list);
        return json;
    }

    /*修改用户收货地址*/
    @RequestMapping(value = "/updAddress",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String updAddress(@RequestBody Tblrecaddress address){
        System.out.println(address);
        /*判断是否是默认地址*/
        if (address.getIsdefault().equals("是")){
            //  清除之前的默认地址
            tblrecaddressService.clearDefault(address.getUserid());
        }
        if (tblrecaddressService.updAddress(address)){
            return "1";
        }else {
            return "2";
        }
    }

    /*新增用户地址*/
    @RequestMapping(value = "/addAddress",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String addAddress(@RequestBody Tblrecaddress address){
        /*判断是否是默认地址*/
        if (address.getIsdefault().equals("true")){
            //  清除之前的默认地址
            tblrecaddressService.clearDefault(address.getUserid());
            address.setIsdefault("是");
        }
        /*添加新的数据*/
        if (tblrecaddressService.addAddress(address)){
            return "1";
        }else {
            return "2";
        }
    }

    /*删除用户地址*/
    @RequestMapping(value = "/delAddress",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String delAddress(String addressid){
        if (tblrecaddressService.delAddress(Long.parseLong(addressid))){
            return "1";
        }else {
            return "2";
        }
    }

    /*保存用户昵称*/
    @RequestMapping(value = "/saveName",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String saveName(String userid,String username){
        if (tbluserSeriver.saveName(Long.parseLong(userid),username)){
            return "1";
        }else {
            return "2";
        }
    }

    /*查询用户信息*/
    @RequestMapping(value = "/findUser",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String findUser(String userid){
        Tbluser tbluser = tbluserSeriver.findUser(Long.parseLong(userid));
        String json = JSON.toJSONString(tbluser);
        return json;
    }

    /*验证用户密码*/
    @RequestMapping(value = "/checkPwd",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String checkPwd(String usertel,String oldPwd){
        Tbluser tbluser = tbluserSeriver.login(usertel,oldPwd);
        if (tbluser != null){
            return "1";
        }else {
            return "2";
        }
    }

    /*修改用户密码*/
    @RequestMapping(value = "/updPwd",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String updPwd(String usertel,String newPwd){
        int num = tbluserSeriver.setPwd(usertel,newPwd);
        if (num > 0){
            return "1";
        }else {
            return "2";
        }
    }

}
