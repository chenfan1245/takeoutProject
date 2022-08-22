package com.cykj.service.impl;

import com.cykj.bean.Tblrecaddress;
import com.cykj.mapper.TblrecaddressMapper;
import com.cykj.service.TblrecaddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TblrecaddressServiceImpl implements TblrecaddressService {
    @Autowired
    private TblrecaddressMapper tblrecaddressMapper;
    @Override
    public List<Tblrecaddress> findAddress(long userid) {
        return tblrecaddressMapper.findAddress(userid);
    }

    @Override
    public boolean updAddress(Tblrecaddress tblrecaddress) {
        int num = tblrecaddressMapper.updAddress(tblrecaddress);
        if (num > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean addAddress(Tblrecaddress tblrecaddress) {
        int num = tblrecaddressMapper.addAddress(tblrecaddress);
        if (num > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delAddress(long addressid) {
        int num = tblrecaddressMapper.delAddress(addressid);
        if (num > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean clearDefault(long userid) {
        int num = tblrecaddressMapper.clearDefault(userid);
        if (num > 0){
            return true;
        }
        return false;
    }
}
