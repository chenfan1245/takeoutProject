package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商家图片类")
public class Tblshopimg {
  @ApiModelProperty(value = "商家图片类的id")
  private long id;
  @ApiModelProperty(value = "商家id")
  private long shopid;
  @ApiModelProperty(value = "与店铺有关的图片")
  private String img;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getShopid() {
    return shopid;
  }

  public void setShopid(long shopid) {
    this.shopid = shopid;
  }


  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

}
