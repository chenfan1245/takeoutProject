package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("招牌菜类")
public class Tblspeciality {
  @ApiModelProperty(value = "招牌菜id")
  private long specialityid;
  @ApiModelProperty(value = "商品id")
  private long goodsid;
  @ApiModelProperty(value = "商家id")
  private long shopid;


  public long getSpecialityid() {
    return specialityid;
  }

  public void setSpecialityid(long specialityid) {
    this.specialityid = specialityid;
  }

  public long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(long goodsid) {
    this.goodsid = goodsid;
  }

  public long getShopid() {
    return shopid;
  }

  public void setShopid(long shopid) {
    this.shopid = shopid;
  }

}
