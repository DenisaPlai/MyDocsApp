package com.application.myDocs.drivingLicense;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrivingLicenseService {

	@Autowired
	private DrivingLicenseRepository drivingLicenseRepository;

	public DrivingLicense createDrivingLicense(DrivingLicense drivingLicense) {
		return drivingLicenseRepository.saveAndFlush(drivingLicense);
	}

	public void deleteDrivingLicenseById(Integer id) {
		drivingLicenseRepository.deleteById(id);
	}

	public List<DrivingLicense> getAllDrivingLicense() {
		return drivingLicenseRepository.findAll();
	}

}
