package com.cykj.service.impl;

import com.cykj.bean.Tblnotice;
import com.cykj.mapper.TblnoticeMapper;
import com.cykj.service.TblnoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TblnoticeServiceImpl implements TblnoticeService {
    @Autowired
    private TblnoticeMapper tblnoticeMapper;

    @Override
    public List<Tblnotice> findNotice(long receiverid, long roleid) {
        return tblnoticeMapper.findNotice(receiverid, roleid);
    }

    @Override
    public boolean clearNotice(long receiverid, long roleid) {
        int num = tblnoticeMapper.clearNotice(receiverid, roleid);
        if (num > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delNotice(long noticeid) {
        int num = tblnoticeMapper.delNotice(noticeid);
        if (num > 0){
            return true;
        }
        return false;
    }
}
