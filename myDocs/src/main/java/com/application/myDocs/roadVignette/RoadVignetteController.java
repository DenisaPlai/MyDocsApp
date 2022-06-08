package com.application.myDocs.roadVignette;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.myDocs.roadVignette.dto.RoadVignetteDTO;
import com.application.myDocs.roadVignette.mapper.RoadVignetteMapper;

@RestController
@RequestMapping("/roadVignette")
public class RoadVignetteController {

	@Autowired
	private RoadVignetteService roadVignetteService;
	@Autowired
	private RoadVignetteMapper roadVignetteMapper;

	@PostMapping
	public RoadVignetteDTO createRoadVignette(@RequestBody RoadVignetteDTO roadVignetteDTO) {
		RoadVignette roadVignette = roadVignetteService
				.createRoadVignette(roadVignetteMapper.roadVignetteDTO2RoadVignette(roadVignetteDTO));
		return roadVignetteMapper.roadVignette2RoadVignetteDTO(roadVignette);
	}

	@DeleteMapping("/{id}")
	public void deleteRoadVignette(@PathVariable Integer id) {
		roadVignetteService.deleteRoadVignetteById(id);
	}

	@GetMapping("/list")
	public List<RoadVignetteDTO> getAllRoadVignette() {
		return roadVignetteMapper.roadVignetteList2RoadVignetteListDTO(roadVignetteService.getAllRoadVignette());
	}
}
