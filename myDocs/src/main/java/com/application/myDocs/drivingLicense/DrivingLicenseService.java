package com.application.myDocs.drivingLicense;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.myDocs.driver.Driver;
import com.application.myDocs.driver.DriverService;

@Service
public class DrivingLicenseService {

	@Autowired
	private DrivingLicenseRepository drivingLicenseRepository;
	@Autowired
	private DriverService driverService;

	public DrivingLicense createDrivingLicense(DrivingLicense drivingLicense) {
		return drivingLicenseRepository.saveAndFlush(drivingLicense);
	}

	public void deleteDrivingLicenseById(Integer id) {
		drivingLicenseRepository.deleteById(id);
	}

	public List<DrivingLicense> getAllDrivingLicense() {
		return drivingLicenseRepository.findAll();
	}

	public DrivingLicense createDrivingLicense(DrivingLicense drivingLicense, Integer driverId) {
		Driver driver = driverService.getDriverById(driverId);
		drivingLicense.addDriver(driver);
		return drivingLicenseRepository.save(drivingLicense);
	}

	public DrivingLicense getDrivingLicense(Integer id) {
		Optional<DrivingLicense> dlOpt = drivingLicenseRepository.findById(id);
		if (dlOpt.isPresent()) {
			return dlOpt.get();
		}
		return null;
	}


}
