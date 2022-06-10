package com.application.myDocs.car;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
	@Autowired
	private CarRepository carRepository;

	public Car createCar(Car car) {
		return carRepository.saveAndFlush(car);
	}

	public void deleteCarById(Integer id) {
		carRepository.deleteById(id);
	}

	public List<Car> getAllCar() {
		return carRepository.findAll();
	}

	public Car getCar(Integer id) {
		Optional<Car> carOpt = carRepository.findById(id);
		if (carOpt.isPresent()) {
			return carOpt.get();
		}
		return null;
	}
}
