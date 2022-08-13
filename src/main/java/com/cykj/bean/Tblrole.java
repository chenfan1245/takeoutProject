package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("角色类")
public class Tblrole {
  @ApiModelProperty(value = "角色id")
  private long roleid;
  @ApiModelProperty(value = "角色名称（用户 / 骑手 / 商家 / 系统管理员）")
  private String rolename;
  @ApiModelProperty(value = "角色描述")
  private String roledescribe;

  public Tblrole() {
  }

  public long getRoleid() {
    return roleid;
  }

  public void setRoleid(long roleid) {
    this.roleid = roleid;
  }


  public String getRolename() {
    return rolename;
  }

  public void setRolename(String rolename) {
    this.rolename = rolename;
  }


  public String getRoledescribe() {
    return roledescribe;
  }

  public void setRoledescribe(String roledescribe) {
    this.roledescribe = roledescribe;
  }

}
