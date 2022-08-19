package com.cykj.service;
import com.cykj.bean.Tblcomment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TblcommentService {
    // 用户评论
    boolean sendComment(long orderid,long userid,long roleid,String commentcontent,long commentscore);
    // 查询待评价的订单的店铺信息
    List<Tblcomment> findNoCommentShop(long userid);
    // 查询待评价的订单的商品信息
    List<Tblcomment> findNoCommentGoods(long userid, long orderid);
    // 已评价的订单信息和评价内容
    List<Tblcomment> findComment(long userid);
}
