package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("状态类")
public class Tblstate {
  @ApiModelProperty(value = "状态id")
  private long stateid;
  @ApiModelProperty(value = "状态名称")
  private String statename;
  @ApiModelProperty(value = "父级id（例：1用户状态0，2启用1；表示 启用归属于用户状态）")
  private long parentid;

  public Tblstate() {
  }

  public long getStateid() {
    return stateid;
  }

  public void setStateid(long stateid) {
    this.stateid = stateid;
  }


  public String getStatename() {
    return statename;
  }

  public void setStatename(String statename) {
    this.statename = statename;
  }


  public long getParentid() {
    return parentid;
  }

  public void setParentid(long parentid) {
    this.parentid = parentid;
  }

}
