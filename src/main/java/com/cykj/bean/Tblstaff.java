package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("工作人员类")
public class Tblstaff {
  @ApiModelProperty(value = "工作人员id")
  private long staffid;
  @ApiModelProperty(value = "角色id")
  private long roleid;
  @ApiModelProperty(value = "工作人员帐号")
  private String staffacc;
  @ApiModelProperty(value = "工作人员密码")
  private String staffpwd;
  @ApiModelProperty(value = "工作人员联系电话")
  private String stafftel;
  @ApiModelProperty(value = "员工身份证正面")
  private String idcardfront;
  @ApiModelProperty(value = "员工身份证背面")
  private String idcardback;
  @ApiModelProperty(value = "员工状态（启用 / 禁用）")
  private String staffstate;


  public long getStaffid() {
    return staffid;
  }

  public void setStaffid(long staffid) {
    this.staffid = staffid;
  }


  public long getRoleid() {
    return roleid;
  }

  public void setRoleid(long roleid) {
    this.roleid = roleid;
  }


  public String getStaffacc() {
    return staffacc;
  }

  public void setStaffacc(String staffacc) {
    this.staffacc = staffacc;
  }


  public String getStaffpwd() {
    return staffpwd;
  }

  public void setStaffpwd(String staffpwd) {
    this.staffpwd = staffpwd;
  }


  public String getStafftel() {
    return stafftel;
  }

  public void setStafftel(String stafftel) {
    this.stafftel = stafftel;
  }


  public String getIdcardfront() {
    return idcardfront;
  }

  public void setIdcardfront(String idcardfront) {
    this.idcardfront = idcardfront;
  }


  public String getIdcardback() {
    return idcardback;
  }

  public void setIdcardback(String idcardback) {
    this.idcardback = idcardback;
  }


  public String getStaffstate() {
    return staffstate;
  }

  public void setStaffstate(String staffstate) {
    this.staffstate = staffstate;
  }

}
