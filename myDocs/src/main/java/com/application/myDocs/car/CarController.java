package com.application.myDocs.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.myDocs.car.dto.CarCreateDTO;
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

	@GetMapping("/list")
	public List<CarDTO> getAllCar() {
		return carMapper.carList2CarListDTO(carService.getAllCar());
	}

	@GetMapping("/byRegistrationNo")
	public CarDTO getCarByRegistrationNo(@RequestParam String registrationNo) {
		return carMapper.car2CarDTO(carService.getCarByRegistrationNo(registrationNo));
	}

	@PostMapping("/with-drivers")
	public CarDTO createCarWithDrivers(@RequestBody CarCreateDTO carCreateDTO) {
		Car createCar = carService.createCar(carMapper.carCreateDTO2Car(carCreateDTO), carCreateDTO.getDriverIds());
		return carMapper.car2CarDTO(createCar);
	}
}
