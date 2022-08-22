package com.cykj.service;

import com.cykj.bean.Tbluser;
import org.apache.ibatis.annotations.Param;

public interface TbluserService {
    /*登录*/
    Tbluser login(String usertel, String userpwd);
    /*注册*/
    int enroll(String usertel,String userpwd);
    //   验证电话是否重复
    boolean checkTel(String usertel);
    //  修改密码
    int setPwd(String usertel,String userpwd);
    //  保存昵称
    boolean saveName(long userid,String username);
    //  查询用户信息
    Tbluser findUser(long userid);
}
