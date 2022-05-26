package com.application.myDocs.roadVignette;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoadVignetteService {

	@Autowired
	private RoadVignetteRepository roadVignetteRepository;

	public RoadVignette createRoadVignette(RoadVignette roadVignette) {
		return roadVignetteRepository.saveAndFlush(roadVignette);
	}

	public void deleteRoadVignetteById(Integer id) {
		roadVignetteRepository.deleteById(id);
	}

}
