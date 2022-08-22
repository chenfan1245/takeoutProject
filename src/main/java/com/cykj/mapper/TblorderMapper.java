package com.cykj.mapper;

import com.cykj.bean.Tblcomment;
import com.cykj.bean.Tblgoods;
import com.cykj.bean.Tblorder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TblorderMapper {
    // 查询所有订单
    List<Tblorder> findAll(@Param("orderid") long orderid);
    //  查询订单内得所有商品
    List<Tblgoods> findGoods(@Param("orderid") long orderid);
    // 查询订单是否已经评论
    List<Tblcomment> selComment(@Param("orderid") long orderid);

}
