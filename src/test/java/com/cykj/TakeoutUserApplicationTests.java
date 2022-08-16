package com.cykj;

import com.cykj.bean.*;
import com.cykj.service.TblcommentService;
import com.cykj.service.TblgoodsService;
import com.cykj.service.TblredpacketService;
import com.cykj.service.TblshoppingcarService;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class TakeoutUserApplicationTests {
    @Autowired
    TblgoodsService tblgoodsService;
    @Autowired
    TblredpacketService tblredpacketMapper;
    @Autowired
    TblcommentService tblcommentService;
    @Autowired
    TblshoppingcarService tblshoppingcarService;

    @Test
    void contextLoads() {
        // 前端传来的数据


        // 测试
        for (Tblshop tblshop : tblgoodsService.findAllShopGoods("","",0)) {
            long shopid = tblshop.getShopid();
            List<Double> scoreList = tblgoodsService.findScore(shopid);
            Double scoreAvg = 5.0;
            if (!scoreList.isEmpty()) {
                scoreAvg = scoreList.stream().collect(Collectors.averagingDouble(Double::doubleValue));
            }
            boolean flag1 = tblgoodsService.updateScore(scoreAvg,shopid);
            long salesSum = tblgoodsService.findSales(shopid);
            boolean flag2 = tblgoodsService.updateSales(salesSum,shopid);
        }
        List<Tblshop> shopsList = tblgoodsService.findAllShopGoods("","",0);

        // 打印
        System.out.println("-------------------------------------------------------------");
        System.out.println("商家列表："+shopsList);
        System.out.println("-------------------------------------------------------------");

    }

}
