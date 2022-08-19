package com.cykj;

import com.cykj.bean.Tblgoods;
import com.cykj.bean.Tblorder;
import com.cykj.service.TblorderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TakeoutUserApplicationTests {
    @Autowired
    TblorderService tblorderService;

    @Test
    void contextLoads() {
        List<Tblorder> orderList = tblorderService.findAll(0);
        for (Tblorder tblorder : orderList){
            long orderid = tblorder.getOrderid();
            List<Tblgoods> goodsList = tblorderService.findGoods(orderid);
            tblorder.setGoodsList(goodsList);
        }
        for (Tblorder tblorder : orderList){
            System.out.println(tblorder);
            System.out.println();
        }
    }

}
