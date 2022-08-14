package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商品规格表")
public class Tblgoodsspec {
  @ApiModelProperty(value = "商品规格id")
  private long id;
  @ApiModelProperty(value = "商品id")
  private long goodsid;
  @ApiModelProperty(value = "规格id")
  private long specid;

  public Tblgoodsspec() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(long goodsid) {
    this.goodsid = goodsid;
  }


  public long getSpecid() {
    return specid;
  }

  public void setSpecid(long specid) {
    this.specid = specid;
  }

}
