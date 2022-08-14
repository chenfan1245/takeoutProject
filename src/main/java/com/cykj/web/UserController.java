package com.cykj.web;

import com.cykj.bean.Tbluser;
import com.cykj.mapper.TbluserMapper;
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

@RestController
@RequestMapping("/admin")
public class UserController {
    @Autowired
    TbluserSeriver tbluserSeriver;
    @Autowired
    HttpSession session;
    /*登录*/
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

}
