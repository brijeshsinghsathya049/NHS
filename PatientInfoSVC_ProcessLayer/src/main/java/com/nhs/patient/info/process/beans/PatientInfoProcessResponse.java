package com.nhs.patient.info.process.beans;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PatientInfoProcessResponse {
	private String id;
	private String fname;
	private String lname;
	private Date dob;
	private String gender;
	private String postalCode;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private String nhsNumber;
	private String respCode;
	private String respMsg;
	private String nationalPatientId;
	private String nationalIdentifierType;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getNhsNumber() {
		return nhsNumber;
	}

	public void setNhsNumber(String nhsNumber) {
		this.nhsNumber = nhsNumber;
	}

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

	public String getNationalPatientId() {
		return nationalPatientId;
	}

	public void setNationalPatientId(String nationalPatientId) {
		this.nationalPatientId = nationalPatientId;
	}

	public String getNationalIdentifierType() {
		return nationalIdentifierType;
	}

	public void setNationalIdentifierType(String nationalIdentifierType) {
		this.nationalIdentifierType = nationalIdentifierType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientInfoProcessResponse [id=");
		builder.append(id);
		builder.append(", fname=");
		builder.append(fname);
		builder.append(", lname=");
		builder.append(lname);
		builder.append(", dob=");
		builder.append(dob);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", postalCode=");
		builder.append(postalCode);
		builder.append(", createdDate=");
		builder.append(createdDate);
		builder.append(", createdBy=");
		builder.append(createdBy);
		builder.append(", updatedDate=");
		builder.append(updatedDate);
		builder.append(", updatedBy=");
		builder.append(updatedBy);
		builder.append(", nhsNumber=");
		builder.append(nhsNumber);
		builder.append(", respCode=");
		builder.append(respCode);
		builder.append(", respMsg=");
		builder.append(respMsg);
		builder.append(", nationalPatientId=");
		builder.append(nationalPatientId);
		builder.append(", nationalIdentifierType=");
		builder.append(nationalIdentifierType);
		builder.append("]");
		return builder.toString();
	}

}
