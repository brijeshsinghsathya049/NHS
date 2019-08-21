package com.nhs.patient.info.resource;

import com.nhs.patient.info.resource.beans.PatientInfoRequest;
import com.nhs.patient.info.resource.beans.PatientInfoResponse;

public interface PatientInfoResource {
	PatientInfoResponse getPatientDetails(String patientID);

	PatientInfoResponse createPatient(PatientInfoRequest request);

	PatientInfoResponse searchPatient(String fname, String lname, String postalCode, String gender, String pageSize,
			String pageNum);

	PatientInfoResponse updatePatient(PatientInfoRequest request);

}
