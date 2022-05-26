package com.application.myDocs.roadVignette.mapper;

import org.springframework.stereotype.Component;

import com.application.myDocs.roadVignette.RoadVignette;
import com.application.myDocs.roadVignette.dto.RoadVignetteDTO;

@Component
public class RoadVignetteMapper {

	public RoadVignette roadVignetteDTO2RoadVignette(RoadVignetteDTO roadVignetteDTO) {
		RoadVignette roadVignette = new RoadVignette();
		roadVignette.setId(roadVignetteDTO.getId());
		roadVignette.setExpirationDate(roadVignetteDTO.getExpirationDate());
		roadVignette.setIssuedDate(roadVignetteDTO.getIssuedDate());
		roadVignette.setRegistrationNo(roadVignetteDTO.getRegistrationNo());
		roadVignette.setTerritorialValidity(roadVignetteDTO.getTerritorialValidity());
		return roadVignette;
	}

	public RoadVignetteDTO roadVignette2RoadVignetteDTO(RoadVignette roadVignette) {
		RoadVignetteDTO roadVignetteDTO = new RoadVignetteDTO();
		roadVignetteDTO.setId(roadVignette.getId());
		roadVignetteDTO.setExpirationDate(roadVignette.getExpirationDate());
		roadVignetteDTO.setIssuedDate(roadVignette.getIssuedDate());
		roadVignetteDTO.setRegistrationNo(roadVignette.getRegistrationNo());
		roadVignetteDTO.setTerritorialValidity(roadVignette.getTerritorialValidity());
		return roadVignetteDTO;
	}
}
