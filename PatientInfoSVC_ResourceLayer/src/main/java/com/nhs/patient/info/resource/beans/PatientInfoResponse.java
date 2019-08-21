package com.nhs.patient.info.resource.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PatientInfoResponse {
	private StatusBlock statusBlock;
	private PatientInfoDetails patientInfoDetails;

	public StatusBlock getStatusBlock() {
		return statusBlock;
	}

	public void setStatusBlock(StatusBlock statusBlock) {
		this.statusBlock = statusBlock;
	}

	public PatientInfoDetails getPatientInfoDetails() {
		return patientInfoDetails;
	}

	public void setPatientInfoDetails(PatientInfoDetails patientInfoDetails) {
		this.patientInfoDetails = patientInfoDetails;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientInfoResponse [statusBlock=");
		builder.append(statusBlock);
		builder.append(", patientInfoDetails=");
		builder.append(patientInfoDetails);
		builder.append("]");
		return builder.toString();
	}

}
