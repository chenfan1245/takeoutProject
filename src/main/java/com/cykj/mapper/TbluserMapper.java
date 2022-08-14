package com.cykj.mapper;

import com.cykj.bean.Tbluser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TbluserMapper {
    //  登录
    Tbluser login(@Param("usertel")String usertel,@Param("userpwd")String userpwd);
    //  注册
    int enroll(@Param("usertel")String usertel,@Param("userpwd")String userpwd);
    //  验证电话是否重复
    Tbluser checkTel(@Param("usertel")String usertel);
    //  修改密码
    int setPwd(@Param("usertel")String usertel,@Param("userpwd")String userpwd);
}
