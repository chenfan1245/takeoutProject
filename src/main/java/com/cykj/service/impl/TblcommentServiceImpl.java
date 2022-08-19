package com.cykj.service.impl;

import com.cykj.mapper.TblcommentMapper;
import com.cykj.service.TblcommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TblcommentServiceImpl implements TblcommentService {
    @Autowired
    private TblcommentMapper tblcommentMapper;
    @Override
    public boolean sendComment(long orderid, long userid, long roleid, String commentcontent, long commentscore) {
        int num = tblcommentMapper.sendComment(orderid, userid, roleid, commentcontent, commentscore);
        if (num > 0){
            return true;
        }
        return false;
    }
}
