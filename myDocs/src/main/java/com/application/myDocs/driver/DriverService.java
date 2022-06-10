package com.application.myDocs.driver;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

	@Autowired
	private DriverRepository driverRepository;

	public Driver createDriver(Driver driver) {
		return driverRepository.saveAndFlush(driver);
	}

	public void deleteDriverById(Integer id) {
		driverRepository.deleteById(id);
	}

	public List<Driver> getAllDrivers() {
		return driverRepository.findAll();
	}

	public Driver getDriverById(Integer id) {
		Optional<Driver> driverOpt = driverRepository.findById(id);
		if (driverOpt.isPresent()) {
			return driverOpt.get();
		}
		return null;
	}

}
