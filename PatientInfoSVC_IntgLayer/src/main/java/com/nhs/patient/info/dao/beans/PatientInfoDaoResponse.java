package com.nhs.patient.info.dao.beans;

import java.util.Date;

public class PatientInfoDaoResponse {
	private String respCode;
	private String respMsg;
	private String id;
	private String fname;
	private String lname;
	private Date dob;
	private String postalCode;
	private String gender;
	private Date createdDate;
	private String cratedBy;
	private Date updateDate;
	private String updateBy;
	private String nhsNumber;
	private String nationalIdentifierType;
	private String nationalPatientId;

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespMsg() {
		return respMsg;
	}

	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCratedBy() {
		return cratedBy;
	}

	public void setCratedBy(String cratedBy) {
		this.cratedBy = cratedBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getNhsNumber() {
		return nhsNumber;
	}

	public void setNhsNumber(String nhsNumber) {
		this.nhsNumber = nhsNumber;
	}

	public String getNationalIdentifierType() {
		return nationalIdentifierType;
	}

	public void setNationalIdentifierType(String nationalIdentifierType) {
		this.nationalIdentifierType = nationalIdentifierType;
	}

	public String getNationalPatientId() {
		return nationalPatientId;
	}

	public void setNationalPatientId(String nationalPatientId) {
		this.nationalPatientId = nationalPatientId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientInfoDaoResponse [respCode=");
		builder.append(respCode);
		builder.append(", respMsg=");
		builder.append(respMsg);
		builder.append(", id=");
		builder.append(id);
		builder.append(", fname=");
		builder.append(fname);
		builder.append(", lname=");
		builder.append(lname);
		builder.append(", dob=");
		builder.append(dob);
		builder.append(", postalCode=");
		builder.append(postalCode);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", createdDate=");
		builder.append(createdDate);
		builder.append(", cratedBy=");
		builder.append(cratedBy);
		builder.append(", updateDate=");
		builder.append(updateDate);
		builder.append(", updateBy=");
		builder.append(updateBy);
		builder.append(", nhsNumber=");
		builder.append(nhsNumber);
		builder.append(", nationalIdentifierType=");
		builder.append(nationalIdentifierType);
		builder.append(", nationalPatientId=");
		builder.append(nationalPatientId);
		builder.append("]");
		return builder.toString();
	}

}
