package com.cykj.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TblcommentMapper {
    // 用户评论
    int sendComment(@Param("orderid")long orderid,
                    @Param("userid")long userid,
                    @Param("roleid")long roleid,
                    @Param("commentcontent")String commentcontent,
                    @Param("commentscore")long commentscore);
}
