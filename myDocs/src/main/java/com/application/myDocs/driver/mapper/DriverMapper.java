package com.application.myDocs.driver.mapper;

import org.springframework.stereotype.Component;

import com.application.myDocs.driver.Driver;
import com.application.myDocs.driver.dto.DriverDTO;

@Component
public class DriverMapper {

	public Driver driverDTO2Driver(DriverDTO driverDTO) {
		Driver driver = new Driver();
		driver.setId(driverDTO.getId());
		driver.setTotalPenaltyPoints(driverDTO.getTotalPenaltyPoints());
		driver.setUnpaidFines(driverDTO.isUnpaidFines());
		driver.setExpiredDocuments(driverDTO.isExpiredDocuments());
		return driver;
	}

	public DriverDTO driver2DriverDTO(Driver driver) {
		DriverDTO driverDTO = new DriverDTO();
		driverDTO.setId(driver.getId());
		driverDTO.setTotalPenaltyPoints(driver.getTotalPenaltyPoints());
		driverDTO.setUnpaidFines(driver.isUnpaidFines());
		driverDTO.setExpiredDocuments(driver.isExpiredDocuments());
		return driverDTO;
	}
}
