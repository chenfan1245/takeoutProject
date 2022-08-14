package com.cykj.web;

import com.alibaba.fastjson.JSON;
import com.cykj.bean.Tblgoods;
import com.cykj.bean.Tblredpacket;
import com.cykj.bean.Tblshop;
import com.cykj.bean.Tbluser;
import com.cykj.mapper.TblredpacketMapper;
import com.cykj.mapper.TbluserMapper;
import com.cykj.service.TblgoodsService;
import com.cykj.service.TbluserSeriver;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class UserController {
    @Autowired
    HttpSession session;
    @Autowired
    TbluserSeriver tbluserSeriver;
    @Autowired
    TblgoodsService tblgoodsService;
    @Autowired
    TblredpacketMapper tblredpacketMapper;

    /* 查询【我的红包】 */
    @ApiOperation(value = "findUserRedPacket",notes = "查询【我的红包】")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userid",value = "登录的用户的id")
    })
    @RequestMapping(value="/findUserRedPacket",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String findUserRedPacket(long userid){
        System.out.println("------显示我的红包------");
        List<Tblredpacket> redpacketList = tblredpacketMapper.findUserRedPacket(userid);
        String json = JSON.toJSONString(redpacketList);
        return json;
    }

    /* 点击商品，查看商品详细信息 */
    @ApiOperation(value = "findGoods",notes = "点击商品，查看商品详细信息")
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
    @ApiOperation(value = "findSearchGoods",notes = "点餐界面搜索框搜索商品名，点击按钮时执行的查询方法")
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
    @ApiOperation(value = "findAllShopGoods",notes = "点击店铺进入点餐界面，显示有关的内容的信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "shopid",value = "点击店铺进入点餐界面，该店铺的id"),
            @ApiImplicitParam(name = "shopgoodstypeidid",value = "点击店左侧菜单栏，获得shopgoodstypeidid")
    })
    @RequestMapping(value="/findAllShopGoods",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String findAllShopGoods(long shopid,long shopgoodstypeidid){
        System.out.println("------点击商铺查询该店的商品------");
        Tblshop tblshop = tblgoodsService.findShop(shopid);     // 店铺信息
        List<Tblshop> specialityList = tblgoodsService.findSpeciality(shopid);  // 该店铺的招牌菜
        String shopName = tblshop.getShopname();    // 店铺名称
        Tblshop shopgoodstype = tblgoodsService.findShopgoodstypeid(shopName);  // 查询找到shopgoodstypeid
        long shopgoodstypeidID = shopgoodstype.getShopgoodstypeid();
        List<Tblshop> shopGoodsTypeList = tblgoodsService.findShopGoodsType(shopgoodstypeidID); // 左侧菜单栏的内容
        List<Tblgoods> goodsList = tblgoodsService.findAllGoods(shopid,shopgoodstypeidid);         // 该店铺的所有商品

        Map<String, Object> map = new HashMap<>();
        String json = JSON.toJSONString(map);
        map.put("tblshop",tblshop);                         // 店铺信息
        map.put("specialityList", specialityList);          // 招牌菜
        map.put("shopGoodsTypeList", shopGoodsTypeList);    // 左侧菜单栏
        map.put("goodsList", goodsList);                    // 所有商品
        return json;
    }

    /* 首页显示所有店铺（根据【店铺名】和【商品名】和【商品类型】模糊查询） */
    @ApiOperation(value = "findAllShop",notes = "首页显示所有店铺（根据【店铺名】和【商品名】和【商品类型】模糊查询）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "shopname",value = "店铺名"),
            @ApiImplicitParam(name = "goodsname",value = "商品名"),
            @ApiImplicitParam(name = "typeid",value = "商品类型id")
    })
    @RequestMapping(value="/findAllShop",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String findAllShop(String shopname,String goodsname,long typeid){
        System.out.println("------首页显示所有店铺------");
        List<Tblshop> shopList = tblgoodsService.findAllShopGoods(shopname,goodsname,typeid);
        String json = JSON.toJSONString(shopList);
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
        if (tbluser != null){
            return "1";
        }else {
            return "2";
        }
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

}
