package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户收藏类")
public class Tblusercollect {
  @ApiModelProperty(value = "用户收藏id")
  private long id;
  @ApiModelProperty(value = "用户id")
  private long userid;
  @ApiModelProperty(value = "商家id")
  private long shopid;

  public Tblusercollect() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public long getShopid() {
    return shopid;
  }

  public void setShopid(long shopid) {
    this.shopid = shopid;
  }

}
