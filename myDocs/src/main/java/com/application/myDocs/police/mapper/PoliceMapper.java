package com.application.myDocs.police.mapper;

import org.springframework.stereotype.Component;

import com.application.myDocs.police.Police;
import com.application.myDocs.police.dto.PoliceDTO;

@Component
public class PoliceMapper {

	public PoliceDTO police2PoliceDTO(Police police) {
		PoliceDTO policeDTO = new PoliceDTO();
		policeDTO.setId(police.getId());
		policeDTO.setFirstName(police.getFirstName());
		policeDTO.setLastName(police.getLastName());
		policeDTO.setWorkingPlace(police.getWorkingPlace());
		policeDTO.setGrade(police.getGrade());
		policeDTO.setCode(police.getCode());
		return policeDTO;
	}

	public Police policeDTO2Police(PoliceDTO policeDTO) {
		Police police = new Police();
		police.setId(policeDTO.getId());
		police.setFirstName(policeDTO.getFirstName());
		police.setLastName(policeDTO.getLastName());
		police.setWorkingPlace(policeDTO.getWorkingPlace());
		police.setGrade(policeDTO.getGrade());
		police.setCode(policeDTO.getCode());
		return police;
	}
}
