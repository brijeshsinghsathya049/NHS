package com.nhs.patient.info.resource.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nhs.patient.info.resource.PatientInfoResource;
import com.nhs.patient.info.resource.beans.PatientInfoRequest;
import com.nhs.patient.info.resource.beans.PatientInfoResponse;
import com.nhs.patient.info.resource.validator.PatientInfoRequestValidator;

@Path("/ncap")
public class PatientInfoResourceImpl implements PatientInfoResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getPatient/{patientID}")
	public PatientInfoResponse getPatientDetails(@PathParam("patientID") String patientID) {
		PatientInfoRequestValidator validator = null;
		
		// get the request from client

		// validate the request
		validator = new PatientInfoRequestValidator();

		return null;
	}

	@Override
	public PatientInfoResponse createPatient(PatientInfoRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientInfoResponse searchPatient(String fname, String lname, String postalCode, String gender,
			String pageSize, String pageNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientInfoResponse updatePatient(PatientInfoRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
