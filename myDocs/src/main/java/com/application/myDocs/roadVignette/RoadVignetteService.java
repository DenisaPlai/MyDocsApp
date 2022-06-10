package com.application.myDocs.roadVignette;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.myDocs.car.Car;
import com.application.myDocs.car.CarService;

@Service
public class RoadVignetteService {

	@Autowired
	private RoadVignetteRepository roadVignetteRepository;
	@Autowired
	private CarService carService;
	
	public RoadVignette createRoadVignette(RoadVignette roadVignette) {
		return roadVignetteRepository.saveAndFlush(roadVignette);
	}

	public void deleteRoadVignetteById(Integer id) {
		roadVignetteRepository.deleteById(id);
	}

	public List<RoadVignette> getAllRoadVignette() {
		return roadVignetteRepository.findAll();
	}
	
	public RoadVignette createRoadVignette(RoadVignette roadVignette, Integer carId) {
		Car car = carService.getCar(carId);
		roadVignette.addCar(car);
		return roadVignetteRepository.save(roadVignette);
	}
}
