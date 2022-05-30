package com.application.myDocs.drivingLicense.mapper;

import org.springframework.stereotype.Component;

import com.application.myDocs.drivingLicense.DrivingLicense;
import com.application.myDocs.drivingLicense.dto.DrivingLicenseDTO;

@Component
public class DrivingLicenseMapper {

	public DrivingLicenseDTO drivingLicense2DrivingLicenseDTO(DrivingLicense drivingLicense) {
		DrivingLicenseDTO drivingLicenseDTO = new DrivingLicenseDTO();
		drivingLicenseDTO.setId(drivingLicense.getId());
		drivingLicenseDTO.setFirstName(drivingLicense.getFirstName());
		drivingLicenseDTO.setLastName(drivingLicense.getLastName());
		drivingLicenseDTO.setDateOfBirth(drivingLicense.getDateOfBirth());
		drivingLicenseDTO.setPlaceOfBirth(drivingLicense.getPlaceOfBirth());
		drivingLicenseDTO.setNumber(drivingLicense.getNumber());
		drivingLicenseDTO.setIssuedBy(drivingLicense.getIssuedBy());
		drivingLicenseDTO.setSuspended(drivingLicense.isSuspended());
		return drivingLicenseDTO;
	}

	public DrivingLicense drivingLicenseDTO2DrivingLicense(DrivingLicenseDTO drivingLicenseDTO) {
		DrivingLicense drivingLicense = new DrivingLicense();
		drivingLicense.setId(drivingLicenseDTO.getId());
		drivingLicense.setFirstName(drivingLicenseDTO.getFirstName());
		drivingLicense.setLastName(drivingLicenseDTO.getLastName());
		drivingLicense.setDateOfBirth(drivingLicenseDTO.getDateOfBirth());
		drivingLicense.setPlaceOfBirth(drivingLicenseDTO.getPlaceOfBirth());
		drivingLicense.setNumber(drivingLicenseDTO.getNumber());
		drivingLicense.setIssuedBy(drivingLicenseDTO.getIssuedBy());
		drivingLicense.setSuspended(drivingLicenseDTO.isSuspended());
		return drivingLicense;
	}
}
