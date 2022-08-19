package com.cykj.service;

import org.apache.ibatis.annotations.Param;

public interface TblcommentService {
    // 用户评论
    boolean sendComment(long orderid,long userid,long roleid,String commentcontent,long commentscore);
}
