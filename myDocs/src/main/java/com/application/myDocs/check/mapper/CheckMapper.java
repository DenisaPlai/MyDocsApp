package com.application.myDocs.check.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.application.myDocs.check.Check;
import com.application.myDocs.check.dto.CheckDTO;

@Component
public class CheckMapper {

	public CheckDTO check2checkDTO(Check check) {
		CheckDTO checkDTO = new CheckDTO();
		checkDTO.setId(check.getId());
		checkDTO.setDate(check.getDate());
		checkDTO.setTime(check.getTime());
		checkDTO.setPlace(check.getPlace());
		checkDTO.setObservation(check.getObservation());
		return checkDTO;
	}

	public Check checkDTO2check(CheckDTO checkDTO) {
		Check check = new Check();
		check.setId(checkDTO.getId());
		check.setDate(checkDTO.getDate());
		check.setTime(checkDTO.getTime());
		check.setPlace(checkDTO.getPlace());
		check.setObservation(checkDTO.getObservation());
		return check;
	}

	public List<CheckDTO> checkList2CheckListDTO(List<Check> list) {
		return list.stream().map(check -> check2checkDTO(check)).collect(Collectors.toList());
	}
}
