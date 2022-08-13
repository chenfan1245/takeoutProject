package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("规格类")
public class Tblspec {
  @ApiModelProperty(value = "规格id")
  private long specid;
  @ApiModelProperty(value = "规格名称")
  private String specname;
  @ApiModelProperty(value = "父级id（将子规格归属于父规格，如规格名为“正常冰“归属于规格名为“温度”）")
  private long parentid;


  public long getSpecid() {
    return specid;
  }

  public void setSpecid(long specid) {
    this.specid = specid;
  }


  public String getSpecname() {
    return specname;
  }

  public void setSpecname(String specname) {
    this.specname = specname;
  }


  public long getParentid() {
    return parentid;
  }

  public void setParentid(long parentid) {
    this.parentid = parentid;
  }

}
