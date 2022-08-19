package com.cykj.mapper;

import com.cykj.bean.Tblnotice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TblnoticeMapper {
    //  查询系统消息
    List<Tblnotice> findNotice(@Param("receiverid") long receiverid,@Param("roleid") long roleid);
    //  清除未读消息
    int clearNotice(@Param("receiverid") long receiverid,@Param("roleid") long roleid);
    // 删除通知消息
    int delNotice(@Param("noticeid")long noticeid);
}
