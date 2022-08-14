package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商家商品类型分类bean")
public class Tblshopgoodstype {
  @ApiModelProperty(value = "店铺商品界面左侧导航栏的id")
  private long shopgoodstypeid;
  @ApiModelProperty(value = "店铺商品界面左侧导航栏的名称 或 店铺名称")
  private String name;
  @ApiModelProperty(value = "父级id（用于将导航栏名称归属于哪个店铺）")
  private long parentid;

  public Tblshopgoodstype() {
  }

  public long getShopgoodstypeid() {
    return shopgoodstypeid;
  }

  public void setShopgoodstypeid(long shopgoodstypeid) {
    this.shopgoodstypeid = shopgoodstypeid;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getParentid() {
    return parentid;
  }

  public void setParentid(long parentid) {
    this.parentid = parentid;
  }

}
