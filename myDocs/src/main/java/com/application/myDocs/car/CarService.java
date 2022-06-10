package com.application.myDocs.car;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.myDocs.driver.Driver;
import com.application.myDocs.driver.DriverService;

@Service
public class CarService {
	@Autowired
	private CarRepository carRepository;
	@Autowired
	private DriverService driverService;

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

	public Car getCarByRegistrationNo(String registrationNo) {
		return carRepository.findByRegistrationNo(registrationNo);
	}

	public Car createCar(Car car, Set<Integer> driverIds) {
		Set<Driver> drivers = driverService.getDrivers(driverIds);
		for (Driver driver : drivers) {
			car.addDriver(driver);
		}
		return carRepository.save(car);
	}
}
