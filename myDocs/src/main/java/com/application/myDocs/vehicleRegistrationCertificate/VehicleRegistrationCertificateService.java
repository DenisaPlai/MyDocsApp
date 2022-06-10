package com.application.myDocs.vehicleRegistrationCertificate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.myDocs.car.Car;
import com.application.myDocs.car.CarService;

@Service
public class VehicleRegistrationCertificateService {

	@Autowired
	private VehicleRegistrationCertificateRepository vrcRepository;
	@Autowired
	private CarService carService;

	public VehicleRegistrationCertificate createVrc(VehicleRegistrationCertificate vrc) {
		return vrcRepository.saveAndFlush(vrc);
	}

	public void deleteVrcById(Integer id) {
		vrcRepository.deleteById(id);
	}

	public List<VehicleRegistrationCertificate> getAllVrc() {
		return vrcRepository.findAll();
	}

	public VehicleRegistrationCertificate createVrc(VehicleRegistrationCertificate vrc, Integer carId) {
		Car car = carService.getCar(carId);
		vrc.addCar(car);
		return vrcRepository.save(vrc);
	}

}
