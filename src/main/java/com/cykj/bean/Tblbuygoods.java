package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("订单中所购买的商品信息")
public class Tblbuygoods {
  @ApiModelProperty(value = "id")
  private long id;
  @ApiModelProperty(value = "订单id")
  private long orderid;
  @ApiModelProperty(value = "商品id")
  private long goodsid;
  @ApiModelProperty(value = "购买的商品数量")
  private long bugnum;

  public Tblbuygoods() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getOrderid() {
    return orderid;
  }

  public void setOrderid(long orderid) {
    this.orderid = orderid;
  }

  public long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(long goodsid) {
    this.goodsid = goodsid;
  }

  public long getBugnum() {
    return bugnum;
  }

  public void setBugnum(long bugnum) {
    this.bugnum = bugnum;
  }

}
