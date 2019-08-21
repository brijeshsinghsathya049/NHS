package com.nhs.patient.info.process.builder;

import com.nhs.patient.info.dao.beans.PatientInfoDaoRequest;
import com.nhs.patient.info.process.beans.PatientInfoProcessRequest;

public class PatientInfoProcessRequestBuilder {
	public PatientInfoDaoRequest buildDaoReq(PatientInfoProcessRequest processRequest) {
		PatientInfoDaoRequest patientInfoDaoRequest = null;
		patientInfoDaoRequest = new PatientInfoDaoRequest();
		// get processRequest and build daoRequest
		patientInfoDaoRequest.setCratedBy(processRequest.getCreatedBy());
		patientInfoDaoRequest.setCreatedDate(processRequest.getCreatedDate());
		patientInfoDaoRequest.setDob(processRequest.getCreatedDate());
		patientInfoDaoRequest.setFname(processRequest.getFname());
		patientInfoDaoRequest.setLname(processRequest.getLname());
		patientInfoDaoRequest.setId(processRequest.getPatientId());
		patientInfoDaoRequest.setNhsNumber(processRequest.getNhsNumber());
		patientInfoDaoRequest.setPostalCode(processRequest.getPostalCode());
		patientInfoDaoRequest.setUpdateBy(processRequest.getUpdatedBy());
		patientInfoDaoRequest.setUpdateDate(processRequest.getUpdatedDate());
		return patientInfoDaoRequest;

	}

}
