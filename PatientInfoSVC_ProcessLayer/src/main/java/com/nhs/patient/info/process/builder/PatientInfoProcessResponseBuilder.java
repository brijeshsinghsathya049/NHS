package com.nhs.patient.info.process.builder;

import java.util.ArrayList;
import java.util.List;

import com.nhs.patient.info.dao.beans.PatientInfoDaoResponse;
import com.nhs.patient.info.process.beans.PatientInfoProcessRequest;
import com.nhs.patient.info.process.beans.PatientInfoProcessResponse;

public class PatientInfoProcessResponseBuilder {
	public PatientInfoProcessResponse buildProcessResp(PatientInfoDaoResponse patientInfoDaoResponse) {
		PatientInfoProcessResponse patientInfoProcessResponse = null;

		// get the DAO Response and build Process Response
		patientInfoProcessResponse = new PatientInfoProcessResponse();
		patientInfoProcessResponse.setCreatedBy(patientInfoDaoResponse.getCratedBy());
		patientInfoProcessResponse.setCreatedDate(patientInfoDaoResponse.getCreatedDate());
		patientInfoDaoResponse.setDob(patientInfoDaoResponse.getDob());
		patientInfoProcessResponse.setFname(patientInfoDaoResponse.getFname());
		patientInfoProcessResponse.setLname(patientInfoDaoResponse.getLname());
		patientInfoProcessResponse.setId(patientInfoDaoResponse.getId());
		patientInfoProcessResponse.setGender(patientInfoDaoResponse.getGender());
		patientInfoProcessResponse.setNationalIdentifierType(patientInfoDaoResponse.getNationalIdentifierType());
		patientInfoProcessResponse.setNationalPatientId(patientInfoDaoResponse.getNationalPatientId());
		patientInfoProcessResponse.setPostalCode(patientInfoDaoResponse.getPostalCode());
		patientInfoProcessResponse.setRespCode(patientInfoDaoResponse.getRespCode());
		patientInfoProcessResponse.setRespMsg(patientInfoDaoResponse.getRespMsg());
		patientInfoProcessResponse.setNhsNumber(patientInfoDaoResponse.getNhsNumber());
		patientInfoProcessResponse.setUpdatedBy(patientInfoDaoResponse.getUpdateBy());
		patientInfoProcessResponse.setUpdatedDate(patientInfoDaoResponse.getUpdateDate());

		return patientInfoProcessResponse;

	}

	public List<PatientInfoProcessResponse> buildPatientDetails(List<PatientInfoDaoResponse> daoRespList,
			PatientInfoProcessRequest request) {
		List<PatientInfoProcessResponse> processRespList = new ArrayList<PatientInfoProcessResponse>();
		for (PatientInfoDaoResponse daoResponse : daoRespList) {
			PatientInfoProcessResponse processResponse = new PatientInfoProcessResponse();
			processResponse.setCreatedBy(daoResponse.getCratedBy());
			processResponse.setCreatedDate(daoResponse.getCreatedDate());
			processResponse.setDob(daoResponse.getDob());
			processResponse.setFname(daoResponse.getFname());
			processResponse.setGender(daoResponse.getGender());
			processResponse.setId(daoResponse.getId());
			processResponse.setLname(daoResponse.getLname());
			processResponse.setNationalIdentifierType(daoResponse.getNationalIdentifierType());
			processResponse.setNationalPatientId(daoResponse.getNationalPatientId());
			processResponse.setNhsNumber(daoResponse.getNhsNumber());
			processResponse.setPostalCode(daoResponse.getPostalCode());
			processResponse.setRespCode(daoResponse.getRespCode());
			processResponse.setRespMsg(daoResponse.getRespMsg());
			processResponse.setUpdatedBy(daoResponse.getUpdateBy());
			processResponse.setUpdatedDate(daoResponse.getUpdateDate());

			processRespList.add(processResponse);

		}
		return processRespList;

	}

}
