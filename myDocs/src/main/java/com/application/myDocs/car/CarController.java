package com.application.myDocs.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.myDocs.car.dto.CarDTO;
import com.application.myDocs.car.mapper.CarMapper;

@RestController
@RequestMapping("/cars")
public class CarController {

	@Autowired
	private CarService carService;
	@Autowired
	private CarMapper carMapper;

	@PostMapping
	public CarDTO createCar(@RequestBody CarDTO carDTO) {
		Car car = carService.createCar(carMapper.carDTO2Car(carDTO));
		return carMapper.car2CarDTO(car);
	}

	@DeleteMapping("/{id}")
	public void deleteCarById(@PathVariable Integer id) {
		carService.deleteCarById(id);
	}
}
