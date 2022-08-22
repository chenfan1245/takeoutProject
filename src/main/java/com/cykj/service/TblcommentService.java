package com.cykj.service;

import com.cykj.bean.Tblcomment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblcommentService {
    // 查询待评价的订单的店铺信息
    List<Tblcomment> findNoCommentShop(long userid);
    // 查询待评价的订单的商品信息
    List<Tblcomment> findNoCommentGoods(long userid, long orderid);
    // 已评价的订单信息和评价内容
    List<Tblcomment> findComment(long userid,long roleid);
}
