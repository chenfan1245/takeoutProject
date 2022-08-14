package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;

@ApiModel("订单类")
public class Tblorder {
  @ApiModelProperty(value = "订单id")
  private long orderid;
  @ApiModelProperty(value = "收获地址id")
  private long addressid;
  @ApiModelProperty(value = "使用的用户红包id")
  private long redpacketid;
  @ApiModelProperty(value = "商家id")
  private long shopid;
  @ApiModelProperty(value = "骑手id")
  private long riderid;
  @ApiModelProperty(value = "订单编号（随机）")
  private String orderno;
  @ApiModelProperty(value = "订单备注")
  private String orderinfo;
  @ApiModelProperty(value = "下单时间")
  private java.sql.Timestamp ordertime;
  @ApiModelProperty(value = "送达时间")
  private java.sql.Timestamp deliverytime;
  @ApiModelProperty(value = "实付款（商品总价格 - 红包金额）")
  private double actualmoney;
  @ApiModelProperty(value = "支付状态（支付中 / 已支付）")
  private String paystate;
  @ApiModelProperty(value = "订单状态（待商家接单 / 待骑手抢单 / 商家备货中 / 待骑手取货 / 待送达 / 已完成 / 已取消 / 退单中 / 已退单）")
  private String orderstate;

  public Tblorder() {
  }

  public long getOrderid() {
    return orderid;
  }

  public void setOrderid(long orderid) {
    this.orderid = orderid;
  }

  public long getAddressid() {
    return addressid;
  }

  public void setAddressid(long addressid) {
    this.addressid = addressid;
  }

  public long getRedpacketid() {
    return redpacketid;
  }

  public void setRedpacketid(long redpacketid) {
    this.redpacketid = redpacketid;
  }

  public long getShopid() {
    return shopid;
  }

  public void setShopid(long shopid) {
    this.shopid = shopid;
  }

  public long getRiderid() {
    return riderid;
  }

  public void setRiderid(long riderid) {
    this.riderid = riderid;
  }

  public String getOrderno() {
    return orderno;
  }

  public void setOrderno(String orderno) {
    this.orderno = orderno;
  }

  public String getOrderinfo() {
    return orderinfo;
  }

  public void setOrderinfo(String orderinfo) {
    this.orderinfo = orderinfo;
  }

  public Timestamp getOrdertime() {
    return ordertime;
  }

  public void setOrdertime(Timestamp ordertime) {
    this.ordertime = ordertime;
  }

  public Timestamp getDeliverytime() {
    return deliverytime;
  }

  public void setDeliverytime(Timestamp deliverytime) {
    this.deliverytime = deliverytime;
  }

  public double getActualmoney() {
    return actualmoney;
  }

  public void setActualmoney(double actualmoney) {
    this.actualmoney = actualmoney;
  }

  public String getPaystate() {
    return paystate;
  }

  public void setPaystate(String paystate) {
    this.paystate = paystate;
  }

  public String getOrderstate() {
    return orderstate;
  }

  public void setOrderstate(String orderstate) {
    this.orderstate = orderstate;
  }
}
