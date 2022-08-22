package com.cykj.service.impl;

import com.cykj.bean.Tbluser;
import com.cykj.mapper.TbluserMapper;
import com.cykj.service.TbluserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbluserServiceImpl implements TbluserService {
    @Autowired
    private TbluserMapper tbluserMapper;
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

    @Override
    public boolean saveName(long userid, String username) {
        int num = tbluserMapper.saveName(userid, username);
        if (num > 0){
            return true;
        }
        return false;
    }

    @Override
    public Tbluser findUser(long userid) {
        return tbluserMapper.findUser(userid);
    }
}
