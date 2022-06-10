package com.application.myDocs.car.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.application.myDocs.car.Car;
import com.application.myDocs.car.dto.CarCreateDTO;
import com.application.myDocs.car.dto.CarDTO;

@Component
public class CarMapper {

	public CarDTO car2CarDTO(Car car) {
		CarDTO carDTO = new CarDTO();
		carDTO.setId(car.getId());
		carDTO.setRegistrationNo(car.getRegistrationNo());
		return carDTO;
	}

	public Car carDTO2Car(CarDTO carDTO) {
		Car car = new Car();
		car.setId(carDTO.getId());
		car.setRegistrationNo(carDTO.getRegistrationNo());
		return car;
	}

	public List<CarDTO> carList2CarListDTO(List<Car> list) {
		return list.stream().map(car -> car2CarDTO(car)).collect(Collectors.toList());
	}

	public Car carCreateDTO2Car(CarCreateDTO carCreateDTO) {
		Car car = new Car();
		car.setId(carCreateDTO.getId());
		car.setRegistrationNo(carCreateDTO.getRegistrationNo());
		return car;
	}
}
