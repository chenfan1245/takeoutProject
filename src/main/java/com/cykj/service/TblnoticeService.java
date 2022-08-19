package com.cykj.service;

import com.cykj.bean.Tblnotice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblnoticeService {
    //  查询系统消息
    List<Tblnotice> findNotice(long receiverid,long roleid);
    //  清除未读消息
    boolean clearNotice(long receiverid,long roleid);
    // 删除通知消息
    boolean delNotice(long noticeid);
}
