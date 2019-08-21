package com.nhs.patient.info.process;

import com.nhs.patient.info.exception.BusinessException;
import com.nhs.patient.info.exception.SystemException;
import com.nhs.patient.info.process.beans.PatientInfoProcessRequest;
import com.nhs.patient.info.process.beans.PatientInfoProcessResponse;

public interface PatientInfoProcess {
	PatientInfoProcessResponse getPatientDetails(String patientID);

	PatientInfoProcessResponse createPatient(PatientInfoProcessRequest request) throws BusinessException, SystemException;

	PatientInfoProcessResponse updatePatient(PatientInfoProcessRequest request);

	PatientInfoProcessRequest serachPatient(PatientInfoProcessRequest request);

}
