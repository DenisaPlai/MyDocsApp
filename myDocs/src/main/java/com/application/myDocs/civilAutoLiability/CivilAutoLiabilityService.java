package com.application.myDocs.civilAutoLiability;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.myDocs.car.Car;
import com.application.myDocs.car.CarService;

@Service
public class CivilAutoLiabilityService {

	@Autowired
	private CivilAutoLiabilityRepository calRepository;
	@Autowired
	private CarService carService;

	public CivilAutoLiability createCal(CivilAutoLiability cal) {
		return calRepository.saveAndFlush(cal);
	}

	public void deleteCalById(Integer id) {
		calRepository.deleteById(id);
	}

	public List<CivilAutoLiability> getAllCal() {
		return calRepository.findAll();
	}

	public CivilAutoLiability createCal(CivilAutoLiability cal, Integer carId) {
		Car car = carService.getCar(carId);
		cal.addCar(car);
		return calRepository.save(cal);
	}

}
