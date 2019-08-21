package com.nhs.patient.info.dao;

import java.util.List;

import com.nhs.patient.info.dao.beans.PatientInfoDaoRequest;
import com.nhs.patient.info.dao.beans.PatientInfoDaoResponse;
import com.nhs.patient.info.exception.BusinessException;
import com.nhs.patient.info.exception.SystemException;

public interface PatientInfoDao {
	PatientInfoDaoResponse getPatient(String patientID);

	PatientInfoDaoResponse createPatient(PatientInfoDaoRequest request) throws BusinessException, SystemException;

	PatientInfoDaoResponse updatePatient(PatientInfoDaoRequest request);

	List<PatientInfoDaoResponse> searchPatient(PatientInfoDaoRequest request);

}
