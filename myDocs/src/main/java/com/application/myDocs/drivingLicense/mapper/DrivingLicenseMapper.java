package com.application.myDocs.drivingLicense.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.application.myDocs.drivingLicense.DrivingLicense;
import com.application.myDocs.drivingLicense.dto.DrivingLicenseCreateDTO;
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

	public List<DrivingLicenseDTO> drivingLicenseList2DrivingLicenseListDTO(List<DrivingLicense> list) {
		return list.stream().map(drivingLicense -> drivingLicense2DrivingLicenseDTO(drivingLicense))
				.collect(Collectors.toList());
	}

	public DrivingLicense drivingLicenseCreateDTO2DrivingLicense(DrivingLicenseCreateDTO drivingLicenseCreateDTO) {
		DrivingLicense drivingLicense = new DrivingLicense();
		drivingLicense.setId(drivingLicenseCreateDTO.getId());
		drivingLicense.setFirstName(drivingLicenseCreateDTO.getFirstName());
		drivingLicense.setLastName(drivingLicenseCreateDTO.getLastName());
		drivingLicense.setDateOfBirth(drivingLicenseCreateDTO.getDateOfBirth());
		drivingLicense.setPlaceOfBirth(drivingLicenseCreateDTO.getPlaceOfBirth());
		drivingLicense.setNumber(drivingLicenseCreateDTO.getNumber());
		drivingLicense.setIssuedBy(drivingLicenseCreateDTO.getIssuedBy());
		drivingLicense.setSuspended(drivingLicenseCreateDTO.isSuspended());
		return drivingLicense;
	}
}
