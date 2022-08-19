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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class UserController {
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

    //点击发送验证码
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

    //点击注册
    @RequestMapping("/enroll")
    public String register( String usertel, String userpwd) {
        /*判断账号是否重复*/
        if (tbluserSeriver.checkTel(usertel)){
            return "3";
        }else {
            //将用户信息存入数据库、这里省略
            int num = tbluserSeriver.enroll(usertel,userpwd);
            if (num > 0){
                return "1";
            }else {
                return "2";
            }
        }
    }
    /*忘记密码*/
    @RequestMapping("/setPwd")
    public String setPwd( String usertel, String userpwd){
        System.out.println(usertel);
        /*判断账号是否重复*/
        if (!tbluserSeriver.checkTel(usertel)){
            return "3";
        }else {
            //将用户信息存入数据库、这里省略
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
