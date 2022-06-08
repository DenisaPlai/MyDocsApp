package com.application.myDocs.car;

import java.util.List;

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
}
