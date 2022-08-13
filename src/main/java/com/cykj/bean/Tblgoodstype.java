package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商品类型类")
public class Tblgoodstype {
  @ApiModelProperty(value = "类型id")
  private long typeid;
  @ApiModelProperty(value = "类型名称（目前共20种）")
  private String typename;
  @ApiModelProperty(value = "类型图标")
  private String typeimg;

  public Tblgoodstype() {
  }

  public long getTypeid() {
    return typeid;
  }

  public void setTypeid(long typeid) {
    this.typeid = typeid;
  }


  public String getTypename() {
    return typename;
  }

  public void setTypename(String typename) {
    this.typename = typename;
  }


  public String getTypeimg() {
    return typeimg;
  }

  public void setTypeimg(String typeimg) {
    this.typeimg = typeimg;
  }

}
