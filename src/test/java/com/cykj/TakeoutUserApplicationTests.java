package com.cykj;

import com.cykj.bean.Tblgoods;
import com.cykj.bean.Tblredpacket;
import com.cykj.bean.Tblshop;
import com.cykj.service.TblgoodsService;
import com.cykj.service.TblredpacketService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TakeoutUserApplicationTests {
    @Autowired
    TblgoodsService tblgoodsService;
    @Autowired
    TblredpacketService tblredpacketMapper;

    @Test
    void contextLoads() {
        // 前端传来的数据
        long userid = 2;

        // 测试
        List<Tblredpacket> redpacketList = tblredpacketMapper.findUserRedPacket(userid);

        System.out.println("我的红包："+redpacketList);
    }

}
