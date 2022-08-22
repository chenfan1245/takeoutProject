package com.cykj.service.Impl;

import com.cykj.bean.Tblredpacket;
import com.cykj.mapper.TblredpacketMapper;
import com.cykj.service.TblredpacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TblredpacketServiceImpl implements TblredpacketService {
    @Autowired
    private TblredpacketMapper redpacketMapper;

    // 查询用户拥有的未使用的红包
    @Override
    public List<Tblredpacket> findUserRedPacket(long userid) {
        return redpacketMapper.findUserRedPacket(userid);
    }

    // 根据系统日期去修改“我的红包状态”
    @Override
    public boolean updateDate(String nowTime) {
        return redpacketMapper.updateDate(nowTime);
    }
}
