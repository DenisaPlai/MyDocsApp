package com.application.myDocs.defects.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.application.myDocs.defects.Defects;
import com.application.myDocs.defects.dto.DefectsDTO;

@Component
public class DefectsMapper {

	public DefectsDTO defects2DefectsDTO(Defects defects) {
		DefectsDTO defectsDTO = new DefectsDTO();
		defectsDTO.setId(defects.getId());
		defectsDTO.setCategory(defects.getCategory());
		defectsDTO.setIdentifiedDefect(defects.getIdentifiedDefect());
		defectsDTO.setCode(defects.getCode());
		return defectsDTO;
	}

	public Defects defectsDTO2Defects(DefectsDTO defectsDTO) {
		Defects defects = new Defects();
		defects.setId(defectsDTO.getId());
		defects.setCategory(defectsDTO.getCategory());
		defects.setIdentifiedDefect(defectsDTO.getIdentifiedDefect());
		defects.setCode(defectsDTO.getCode());
		return defects;
	}

	public List<DefectsDTO> defectsList2DefectsListDTO(List<Defects> list) {
		return list.stream().map(defects -> defects2DefectsDTO(defects)).collect(Collectors.toList());
	}
}
