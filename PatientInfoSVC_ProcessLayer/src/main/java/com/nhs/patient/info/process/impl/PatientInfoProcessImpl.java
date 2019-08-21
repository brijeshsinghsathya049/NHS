package com.nhs.patient.info.process.impl;

import org.apache.log4j.Logger;

import com.nhs.patient.info.dao.PatientInfoDao;
import com.nhs.patient.info.exception.BusinessException;
import com.nhs.patient.info.exception.SystemException;
import com.nhs.patient.info.process.PatientInfoProcess;
import com.nhs.patient.info.process.beans.PatientInfoProcessRequest;
import com.nhs.patient.info.process.beans.PatientInfoProcessResponse;

public class PatientInfoProcessImpl implements PatientInfoProcess {
	Logger logger = Logger.getLogger(PatientInfoProcessImpl.class);

	@Override
	public PatientInfoProcessResponse getPatientDetails(String patientID) {
		logger.debug("Enter Process Layer getPatientDetails::" + patientID);
		PatientInfoDao patientInfoDao = null;

		return null;
	}

	@Override
	public PatientInfoProcessResponse createPatient(PatientInfoProcessRequest request)
			throws BusinessException, SystemException {
		return null;
	}

	@Override
	public PatientInfoProcessResponse updatePatient(PatientInfoProcessRequest request) {
		return null;
	}

	@Override
	public PatientInfoProcessRequest serachPatient(PatientInfoProcessRequest request) {
		return null;
	}

}
