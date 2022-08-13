package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("购物车类")
public class Tblshoppingcard {
  @ApiModelProperty(value = "购物车id")
  private long shoppingcardid;
  @ApiModelProperty(value = "商品id")
  private long goodsid;
  @ApiModelProperty(value = "用户id")
  private long userid;
  @ApiModelProperty(value = "商品数量")
  private long bugnum;

  public Tblshoppingcard() {
  }

  public long getShoppingcardid() {
    return shoppingcardid;
  }

  public void setShoppingcardid(long shoppingcardid) {
    this.shoppingcardid = shoppingcardid;
  }


  public long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(long goodsid) {
    this.goodsid = goodsid;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public long getBugnum() {
    return bugnum;
  }

  public void setBugnum(long bugnum) {
    this.bugnum = bugnum;
  }

}
