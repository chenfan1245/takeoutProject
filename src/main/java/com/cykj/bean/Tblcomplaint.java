package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("投诉表")
public class Tblcomplaint {
  @ApiModelProperty(value = "投诉id")
  private long complaintid;
  @ApiModelProperty(value = "处理该投诉信息的员工id")
  private long staffid;
  @ApiModelProperty(value = "投诉者帐号")
  private String complaintel;
  @ApiModelProperty(value = "被投诉者帐号")
  private String respondenttel;
  @ApiModelProperty(value = "投诉内容")
  private String complaintcontent;
  @ApiModelProperty(value = "投诉凭证（图片）")
  private String complaintimg;
  @ApiModelProperty(value = "投诉状态")
  private String complaintstate;

  public Tblcomplaint() {
  }

  public long getComplaintid() {
    return complaintid;
  }

  public void setComplaintid(long complaintid) {
    this.complaintid = complaintid;
  }


  public long getStaffid() {
    return staffid;
  }

  public void setStaffid(long staffid) {
    this.staffid = staffid;
  }


  public String getComplaintel() {
    return complaintel;
  }

  public void setComplaintel(String complaintel) {
    this.complaintel = complaintel;
  }


  public String getRespondenttel() {
    return respondenttel;
  }

  public void setRespondenttel(String respondenttel) {
    this.respondenttel = respondenttel;
  }


  public String getComplaintcontent() {
    return complaintcontent;
  }

  public void setComplaintcontent(String complaintcontent) {
    this.complaintcontent = complaintcontent;
  }


  public String getComplaintimg() {
    return complaintimg;
  }

  public void setComplaintimg(String complaintimg) {
    this.complaintimg = complaintimg;
  }

  public String getComplaintstate() {
    return complaintstate;
  }

  public void setComplaintstate(String complaintstate) {
    this.complaintstate = complaintstate;
  }
}
