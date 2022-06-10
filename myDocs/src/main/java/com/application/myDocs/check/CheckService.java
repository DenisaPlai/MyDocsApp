package com.application.myDocs.check;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.myDocs.driver.Driver;
import com.application.myDocs.driver.DriverService;
import com.application.myDocs.police.Police;
import com.application.myDocs.police.PoliceService;

@Service
public class CheckService {

	@Autowired
	private CheckRepository checkRepository;
	@Autowired
	private PoliceService policeService;
	@Autowired
	private DriverService driverService;

	public Check createCheck(Check check) {
		return checkRepository.saveAndFlush(check);
	}

	public void deleteCheckById(Integer id) {
		checkRepository.deleteById(id);

	}

	public List<Check> getAllCheck() {
		return checkRepository.findAll();
	}

	public Check createCheckWithPoliceAndDriver(Integer policeId, Integer driverId, Check check) throws Exception {
		Police police = policeService.getPoliceById(policeId);
		if (police == null) {
			throw new Exception("Police with id " + policeId + " was not found");
		}
		Driver driver = driverService.getDriverById(driverId);

		police.addCheck(check);
		driver.addCheck(check);

		return checkRepository.saveAndFlush(check);
	}

	public Check getCheck(Integer id) {
		Optional<Check> checkOpt = checkRepository.findById(id);
		if (checkOpt.isPresent()) {
			return checkOpt.get();
		}
		return null;
	}

}
