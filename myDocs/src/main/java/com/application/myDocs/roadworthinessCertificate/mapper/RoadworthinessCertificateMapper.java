package com.application.myDocs.roadworthinessCertificate.mapper;

import org.springframework.stereotype.Component;

import com.application.myDocs.roadworthinessCertificate.RoadworthinessCertificate;
import com.application.myDocs.roadworthinessCertificate.dto.RoadworthinessCertificateDTO;

@Component
public class RoadworthinessCertificateMapper {

	public RoadworthinessCertificateDTO roadworthinessCertificate2RoadworthinessCertificateDTO(
			RoadworthinessCertificate rc) {
		RoadworthinessCertificateDTO rcDTO = new RoadworthinessCertificateDTO();
		rcDTO.setId(rc.getId());
		rcDTO.setVinNumber(rc.getVinNumber());
		rcDTO.setCountrySymbol(rc.getCountrySymbol());
		rcDTO.setRegistrationNo(rc.getRegistrationNo());
		rcDTO.setPlace(rc.getPlace());
		rcDTO.setDate(rc.getDate());
		rcDTO.setOdometer(rc.getOdometer());
		rcDTO.setVehicleClass(rc.getVehicleClass());
		rcDTO.setOverallAssessment(rc.getOverallAssessment());
		rcDTO.setDateOfNextPeriodicalTest(rc.getDateOfNextPeriodicalTest());
		rcDTO.setInspectionOrganisationName(rc.getInspectionOrganisationName());
		rcDTO.setEntryInTheNationalDb(rc.getEntryInTheNationalDb());
		return rcDTO;
	}

	public RoadworthinessCertificate roadworthinessCertificateDTO2RoadworthinessCertificate(
			RoadworthinessCertificateDTO rcDTO) {
		RoadworthinessCertificate rc = new RoadworthinessCertificate();
		rc.setId(rcDTO.getId());
		rc.setVinNumber(rcDTO.getVinNumber());
		rc.setCountrySymbol(rcDTO.getCountrySymbol());
		rc.setRegistrationNo(rcDTO.getRegistrationNo());
		rc.setPlace(rcDTO.getPlace());
		rc.setDate(rcDTO.getDate());
		rc.setOdometer(rcDTO.getOdometer());
		rc.setVehicleClass(rcDTO.getVehicleClass());
		rc.setOverallAssessment(rcDTO.getOverallAssessment());
		rc.setDateOfNextPeriodicalTest(rcDTO.getDateOfNextPeriodicalTest());
		rc.setInspectionOrganisationName(rcDTO.getInspectionOrganisationName());
		rc.setEntryInTheNationalDb(rcDTO.getEntryInTheNationalDb());
		return rc;
	}
}
