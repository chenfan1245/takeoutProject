package com.cykj.service.impl;

import com.cykj.bean.Tbluser;
import com.cykj.mapper.TbluserMapper;
import com.cykj.service.TbluserSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbluserSeriverImpl implements TbluserSeriver {
    @Autowired
    TbluserMapper tbluserMapper;
    /*登录*/
    @Override
    public Tbluser login(String usertel, String userpwd) {
        return tbluserMapper.login(usertel, userpwd);
    }
    /*注册*/
    @Override
    public int enroll(String usertel, String userpwd) {

        int num = tbluserMapper.enroll(usertel, userpwd);
        if (num > 0){
            return 1;
        }
        return 0;

    }

    @Override
    public boolean checkTel(String usertel) {
        Tbluser tbluser = tbluserMapper.checkTel(usertel);
        if (tbluser != null){
            return true;
        }
        return false;
    }

    @Override
    public int setPwd(String usertel, String userpwd) {
        int num = tbluserMapper.setPwd(usertel, userpwd);
        if (num > 0){
            return 1;
        }
        return 2;
    }
}
