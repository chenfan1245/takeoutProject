package com.cykj.service;

import com.cykj.bean.Tblcomment;
import com.cykj.bean.Tblgoods;
import com.cykj.bean.Tblorder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblorderService {
    // 查询所有订单
    List<Tblorder> findAll(long orderid);
    //  查询订单内得所有商品
    List<Tblgoods> findGoods(long orderid);
    // 查询订单是否已经评论
    boolean selComment(@Param("orderid") long orderid);
}
