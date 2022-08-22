package com.cykj.service.impl;

import com.cykj.bean.Tblcomment;
import com.cykj.bean.Tblgoods;
import com.cykj.bean.Tblorder;
import com.cykj.mapper.TblorderMapper;
import com.cykj.service.TblorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TblorderServiceImpl implements TblorderService {
    @Autowired
    private TblorderMapper tblorderMapper;
    @Override
    public List<Tblorder> findAll(long orderid) {
        return tblorderMapper.findAll(orderid);
    }

    @Override
    public List<Tblgoods> findGoods(long orderid) {
        return tblorderMapper.findGoods(orderid);
    }

    @Override
    public boolean selComment(long orderid) {
        List<Tblcomment> list = tblorderMapper.selComment(orderid);
        if (list.size() > 0){
            return true;
        }
        return false;
    }
}
