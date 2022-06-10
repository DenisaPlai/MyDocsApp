package com.application.myDocs.civilAutoLiability;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.myDocs.civilAutoLiability.dto.CivilAutoLiabilityCreateDTO;
import com.application.myDocs.civilAutoLiability.dto.CivilAutoLiabilityDTO;
import com.application.myDocs.civilAutoLiability.mapper.CivilAutoLiabilityMapper;

@RestController
@RequestMapping("/civilAutoLiability")
public class CivilAutoLiabilityController {

	@Autowired
	private CivilAutoLiabilityService calService;
	@Autowired
	private CivilAutoLiabilityMapper calMapper;

	@PostMapping
	public CivilAutoLiabilityDTO creatCivilAutoLiability(@RequestBody CivilAutoLiabilityDTO calDTO) {
		CivilAutoLiability cal = calService.createCal(calMapper.civilAutoLiabilityDTO2CivilAutoLiability(calDTO));
		return calMapper.civilAutoLiability2CivilAutoLiabilityDTO(cal);
	}

	@DeleteMapping("/{id}")
	public void deleteCalById(@PathVariable Integer id) {
		calService.deleteCalById(id);
	}

	@GetMapping("/list")
	public List<CivilAutoLiabilityDTO> getAllCal() {
		return calMapper.civilAutoLiabilityList2CivilAutoLiabilityListDTO(calService.getAllCal());
	}

	@PostMapping("/with-car")
	public CivilAutoLiabilityDTO createCalWithCar(@RequestBody CivilAutoLiabilityCreateDTO calCreateDTO) {
		CivilAutoLiability createCal = calService.createCal(
				calMapper.civilAutoLiabilityCreateDTO2CivilAutoLiability(calCreateDTO), calCreateDTO.getCarId());
		return calMapper.civilAutoLiability2CivilAutoLiabilityDTO(createCal);
	}
}
