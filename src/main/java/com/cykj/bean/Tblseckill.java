package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商品秒杀类")
public class Tblseckill {
  @ApiModelProperty(value = "秒杀id")
  private long seckill;
  @ApiModelProperty(value = "商品id")
  private long goodsid;
  @ApiModelProperty(value = "开始时间")
  private java.sql.Time opentime;
  @ApiModelProperty(value = "结束时间")
  private java.sql.Time endtime;
  @ApiModelProperty(value = "秒杀价格")
  private double seckillprice;
  @ApiModelProperty(value = "秒杀数量")
  private long seckillnum;
  @ApiModelProperty(value = "秒杀状态")
  private String seckillstate;

  public Tblseckill() {
  }

  public long getSeckill() {
    return seckill;
  }

  public void setSeckill(long seckill) {
    this.seckill = seckill;
  }


  public long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(long goodsid) {
    this.goodsid = goodsid;
  }


  public java.sql.Time getOpentime() {
    return opentime;
  }

  public void setOpentime(java.sql.Time opentime) {
    this.opentime = opentime;
  }


  public java.sql.Time getEndtime() {
    return endtime;
  }

  public void setEndtime(java.sql.Time endtime) {
    this.endtime = endtime;
  }


  public double getSeckillprice() {
    return seckillprice;
  }

  public void setSeckillprice(double seckillprice) {
    this.seckillprice = seckillprice;
  }


  public long getSeckillnum() {
    return seckillnum;
  }

  public void setSeckillnum(long seckillnum) {
    this.seckillnum = seckillnum;
  }

  public String getSeckillstate() {
    return seckillstate;
  }

  public void setSeckillstate(String seckillstate) {
    this.seckillstate = seckillstate;
  }
}
