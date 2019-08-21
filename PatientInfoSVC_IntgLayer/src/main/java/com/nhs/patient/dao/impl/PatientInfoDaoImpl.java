package com.nhs.patient.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.nhs.patient.info.dao.PatientInfoDao;
import com.nhs.patient.info.dao.beans.PatientInfoDaoRequest;
import com.nhs.patient.info.dao.beans.PatientInfoDaoResponse;
import com.nhs.patient.info.exception.BusinessException;
import com.nhs.patient.info.exception.SystemException;

public class PatientInfoDaoImpl implements PatientInfoDao {
	Logger logger = Logger.getLogger(PatientInfoDaoImpl.class);

	@Override
	public PatientInfoDaoResponse getPatient(String patientID) {
		PatientInfoDaoResponse patientInfoDaoResponse = null;

		logger.debug("Enter info dao layer getPatientDetails with:" + patientID);
		// get the request from Process Layer
		// prepare the db request
		patientInfoDaoResponse = new PatientInfoDaoResponse();
		patientInfoDaoResponse.setCratedBy("brijesh");
		patientInfoDaoResponse.setCreatedDate(new Date());
		patientInfoDaoResponse.setDob(new Date());
		patientInfoDaoResponse.setFname("brijesh");
		patientInfoDaoResponse.setLname("singh");
		patientInfoDaoResponse.setGender("male");
		patientInfoDaoResponse.setId("pts001");
		patientInfoDaoResponse.setNationalIdentifierType(null);
		patientInfoDaoResponse.setNationalPatientId(null);
		patientInfoDaoResponse.setNhsNumber(null);
		patientInfoDaoResponse.setPostalCode("841503");
		patientInfoDaoResponse.setRespMsg("sucusses");

		logger.debug("Exit from dao layer getPatientDetails with:" + patientInfoDaoResponse);

		return patientInfoDaoResponse;
	}

	@Override
	public PatientInfoDaoResponse createPatient(PatientInfoDaoRequest request)
			throws BusinessException, SystemException {
		PatientInfoDaoResponse patientInfoDaoResponse = null;
		// 1. get the request from process layer
		// 2. prepare the db request using dao request
		// 3. call the db and get the response

		try {
			String dbRespCode = "0";
			String dbRespMsg = "success";
			if ("0".equals(dbRespCode)) {
				patientInfoDaoResponse = new PatientInfoDaoResponse();
				// TODO:: Replace hardCode response with daoResponse
				patientInfoDaoResponse.setCratedBy("brijesh");
				patientInfoDaoResponse.setCreatedDate(new Date());
				patientInfoDaoResponse.setFname("brijesh");
				patientInfoDaoResponse.setLname("singh");
				patientInfoDaoResponse.setGender("male");
				patientInfoDaoResponse.setId("pts001");
				patientInfoDaoResponse.setNationalIdentifierType(null);
				patientInfoDaoResponse.setNationalPatientId(null);
				patientInfoDaoResponse.setNhsNumber("8945");
				patientInfoDaoResponse.setPostalCode("841503");
				patientInfoDaoResponse.setRespCode("0");
				patientInfoDaoResponse.setRespMsg("sucess");
				patientInfoDaoResponse.setUpdateBy("brijesh");
				patientInfoDaoResponse.setUpdateDate(new Date());

			} else if ("111".equals(dbRespCode) || "112".equals(dbRespCode) || "123".equals(dbRespCode)) {
				throw new BusinessException(dbRespCode, dbRespMsg);
			} else {
				throw new SystemException(dbRespCode, dbRespMsg);
			}

		} catch (BusinessException be) {
			logger.debug("Bussiness Exception in createPatient:", be);
			throw be;

		} catch (SystemException se) {
			logger.debug("System Exception in createPatient:", se);
			throw se;

		}
		logger.error("exiting from createPatient dao layer::" + patientInfoDaoResponse);

		return patientInfoDaoResponse;
	}

	@Override
	public List<PatientInfoDaoResponse> searchPatient(PatientInfoDaoRequest request) {
		PatientInfoDaoResponse patientInfoDaoResponse = null;
		List<PatientInfoDaoResponse> daoResponsesList = null;
		logger.debug("Enter into dao searchPatient:" + request);

		daoResponsesList = new ArrayList<>();
		// get the request from PL
		// prepare the db response
		// call db and get db response
		patientInfoDaoResponse = new PatientInfoDaoResponse();
		patientInfoDaoResponse.setCratedBy("brijesh");
		patientInfoDaoResponse.setCreatedDate(new Date());
		patientInfoDaoResponse.setDob(new Date());
		patientInfoDaoResponse.setFname("brijesh");
		patientInfoDaoResponse.setLname("singh");
		patientInfoDaoResponse.setGender("male");
		patientInfoDaoResponse.setId("pts001");
		patientInfoDaoResponse.setNationalIdentifierType(null);
		patientInfoDaoResponse.setNationalPatientId(null);
		patientInfoDaoResponse.setPostalCode("841503");
		patientInfoDaoResponse.setNhsNumber("1641");
		patientInfoDaoResponse.setRespCode("0");
		patientInfoDaoResponse.setRespMsg("success");
		patientInfoDaoResponse.setUpdateBy("brijesh");
		patientInfoDaoResponse.setUpdateDate(new Date());

		daoResponsesList.add(patientInfoDaoResponse);
		logger.debug("Exiting from dao serach patient with::" + daoResponsesList);

		return daoResponsesList;
	}

	@Override
	public PatientInfoDaoResponse updatePatient(PatientInfoDaoRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
