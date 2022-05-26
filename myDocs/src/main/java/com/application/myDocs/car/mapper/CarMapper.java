package com.application.myDocs.car.mapper;

import org.springframework.stereotype.Component;

import com.application.myDocs.car.Car;
import com.application.myDocs.car.dto.CarDTO;

@Component
public class CarMapper {

	public CarDTO car2CarDTO(Car car) {
		CarDTO carDTO = new CarDTO();
		carDTO.setId(car.getId());
		carDTO.setCivilAutoLiability(car.getCivilAutoLiability());
		carDTO.setRoadworthinessCertificate(car.getRoadworthinessCertificate());
		carDTO.setVehicleIdentityCard(car.getVehicleIdentityCard());
		carDTO.setVehicleRegistrationCertificate(car.getVehicleRegistrationCertificate());
		return carDTO;
	}

	public Car carDTO2Car(CarDTO carDTO) {
		Car car = new Car();
		car.setId(carDTO.getId());
		car.setCivilAutoLiability(carDTO.getCivilAutoLiability());
		car.setRoadworthinessCertificate(carDTO.getRoadworthinessCertificate());
		car.setVehicleIdentityCard(carDTO.getVehicleIdentityCard());
		car.setVehicleRegistrationCertificate(carDTO.getVehicleRegistrationCertificate());
		return car;
	}
}
