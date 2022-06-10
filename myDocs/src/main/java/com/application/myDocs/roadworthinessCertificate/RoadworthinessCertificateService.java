package com.application.myDocs.roadworthinessCertificate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.myDocs.car.Car;
import com.application.myDocs.car.CarService;

@Service
public class RoadworthinessCertificateService {

	@Autowired
	private RoadworthinessCertificateRepository rcRepository;
	@Autowired
	private CarService carService;

	public RoadworthinessCertificate createRoadworthinessCertificate(RoadworthinessCertificate rc) {
		return rcRepository.saveAndFlush(rc);
	}

	public void deleteRoadworthinessCertificateById(Integer id) {
		rcRepository.deleteById(id);
	}

	public List<RoadworthinessCertificate> getAllRoadworthinessCertificate() {
		return rcRepository.findAll();
	}

	public RoadworthinessCertificate createRoadworthinessCertificate(RoadworthinessCertificate rc, Integer carId) {
		Car car = carService.getCar(carId);
		rc.addCar(car);
		return rcRepository.save(rc);

	}
}
