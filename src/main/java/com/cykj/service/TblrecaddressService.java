package com.cykj.service;

import com.cykj.bean.Tblrecaddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblrecaddressService {
    //  查询用户的收货地址
    List<Tblrecaddress> findAddress(long userid);
    //  修改收货地址
    boolean updAddress(Tblrecaddress tblrecaddress);
    //  增加收货地址
    boolean addAddress(Tblrecaddress tblrecaddress);
    //  删除收货地址
    boolean delAddress(long addressid);
    //  清除之前的默认地址
    boolean clearDefault(long userid);
}
