package com.cykj.mapper;

import com.cykj.bean.Tblrecaddress;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TblrecaddressMapper {
    //  查询用户的收货地址
    List<Tblrecaddress> findAddress(@Param("userid") long userid);
    //  修改收货地址
    int updAddress(Tblrecaddress tblrecaddress);
    //  增加收货地址
    int addAddress(Tblrecaddress tblrecaddress);
    //  删除收货地址
    int delAddress(@Param("addressid")long addressid);
    //  清除之前的默认地址
    int clearDefault(@Param("userid") long userid);
}
