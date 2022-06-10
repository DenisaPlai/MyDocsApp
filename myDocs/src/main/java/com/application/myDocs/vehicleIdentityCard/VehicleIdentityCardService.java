package com.application.myDocs.vehicleIdentityCard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.myDocs.car.Car;
import com.application.myDocs.car.CarService;

@Service
public class VehicleIdentityCardService {

	@Autowired
	private VehicleIdentityCardRepository vicRepository;
	@Autowired
	private CarService carService;

	public VehicleIdentityCard createVic(VehicleIdentityCard vic) {
		return vicRepository.saveAndFlush(vic);
	}

	public void deleteVicById(Integer id) {
		vicRepository.deleteById(id);
	}

	public List<VehicleIdentityCard> getAllVic() {
		return vicRepository.findAll();
	}

	public VehicleIdentityCard createVic(VehicleIdentityCard vic, Integer carId) {
		Car car = carService.getCar(carId);
		vic.addCar(car);
		return vicRepository.save(vic);
	}

}
