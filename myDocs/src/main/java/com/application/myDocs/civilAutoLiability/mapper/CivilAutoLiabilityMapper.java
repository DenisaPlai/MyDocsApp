package com.application.myDocs.civilAutoLiability.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.application.myDocs.civilAutoLiability.CivilAutoLiability;
import com.application.myDocs.civilAutoLiability.dto.CivilAutoLiabilityCreateDTO;
import com.application.myDocs.civilAutoLiability.dto.CivilAutoLiabilityDTO;

@Component
public class CivilAutoLiabilityMapper {

	public CivilAutoLiabilityDTO civilAutoLiability2CivilAutoLiabilityDTO(CivilAutoLiability civilAutoLiability) {
		CivilAutoLiabilityDTO civilAutoLiabilityDTO = new CivilAutoLiabilityDTO();
		civilAutoLiabilityDTO.setId(civilAutoLiability.getId());
		civilAutoLiabilityDTO.setValidFrom(civilAutoLiability.getValidFrom());
		civilAutoLiabilityDTO.setValidTo(civilAutoLiability.getValidTo());
		civilAutoLiabilityDTO.setIssuedBy(civilAutoLiability.getIssuedBy());
		civilAutoLiabilityDTO.setRegistrationNo(civilAutoLiability.getRegistrationNo());
		civilAutoLiabilityDTO.setCountryCode(civilAutoLiability.getCountryCode());
		civilAutoLiabilityDTO.setNumber(civilAutoLiability.getNumber());
		civilAutoLiabilityDTO.setSeries(civilAutoLiability.getSeries());
		civilAutoLiabilityDTO.setVehicleCategory(civilAutoLiability.getVehicleCategory());
		civilAutoLiabilityDTO.setMakeOfVehicle(civilAutoLiability.getMakeOfVehicle());
		civilAutoLiabilityDTO.setTerritorialValidity(civilAutoLiability.getTerritorialValidity());
		civilAutoLiabilityDTO
				.setLimitCompensationForMaterialDamage(civilAutoLiability.getLimitCompensationForMaterialDamage());
		civilAutoLiabilityDTO
				.setLimitCompensationForPersonalInjury(civilAutoLiability.getLimitCompensationForPersonalInjury());
		civilAutoLiabilityDTO.setObservation(civilAutoLiability.getObservation());
		civilAutoLiabilityDTO.setPrice(civilAutoLiability.getPrice());
		return civilAutoLiabilityDTO;
	}

	public CivilAutoLiability civilAutoLiabilityDTO2CivilAutoLiability(CivilAutoLiabilityDTO civilAutoLiabilityDTO) {
		CivilAutoLiability civilAutoLiability = new CivilAutoLiability();
		civilAutoLiability.setId(civilAutoLiabilityDTO.getId());
		civilAutoLiability.setValidFrom(civilAutoLiabilityDTO.getValidFrom());
		civilAutoLiability.setValidTo(civilAutoLiabilityDTO.getValidTo());
		civilAutoLiability.setIssuedBy(civilAutoLiabilityDTO.getIssuedBy());
		civilAutoLiability.setRegistrationNo(civilAutoLiabilityDTO.getRegistrationNo());
		civilAutoLiability.setCountryCode(civilAutoLiabilityDTO.getCountryCode());
		civilAutoLiability.setCountryCode(civilAutoLiabilityDTO.getCountryCode());
		civilAutoLiability.setSeries(civilAutoLiabilityDTO.getSeries());
		civilAutoLiability.setVehicleCategory(civilAutoLiabilityDTO.getVehicleCategory());
		civilAutoLiability.setMakeOfVehicle(civilAutoLiabilityDTO.getMakeOfVehicle());
		civilAutoLiability.setTerritorialValidity(civilAutoLiabilityDTO.getTerritorialValidity());
		civilAutoLiability
				.setLimitCompensationForMaterialDamage(civilAutoLiabilityDTO.getLimitCompensationForMaterialDamage());
		civilAutoLiability
				.setLimitCompensationForPersonalInjury(civilAutoLiabilityDTO.getLimitCompensationForPersonalInjury());
		civilAutoLiability.setObservation(civilAutoLiabilityDTO.getObservation());
		civilAutoLiability.setPrice(civilAutoLiabilityDTO.getPrice());
		return civilAutoLiability;
	}

	public List<CivilAutoLiabilityDTO> civilAutoLiabilityList2CivilAutoLiabilityListDTO(List<CivilAutoLiability> list) {
		return list.stream().map(cal -> civilAutoLiability2CivilAutoLiabilityDTO(cal)).collect(Collectors.toList());
	}

	public CivilAutoLiability civilAutoLiabilityCreateDTO2CivilAutoLiability(
			CivilAutoLiabilityCreateDTO civilAutoLiabilityCreateDTO) {
		CivilAutoLiability civilAutoLiability = new CivilAutoLiability();
		civilAutoLiability.setValidFrom(civilAutoLiabilityCreateDTO.getValidFrom());
		civilAutoLiability.setValidTo(civilAutoLiabilityCreateDTO.getValidTo());
		civilAutoLiability.setIssuedBy(civilAutoLiabilityCreateDTO.getIssuedBy());
		civilAutoLiability.setRegistrationNo(civilAutoLiabilityCreateDTO.getRegistrationNo());
		civilAutoLiability.setCountryCode(civilAutoLiabilityCreateDTO.getCountryCode());
		civilAutoLiability.setCountryCode(civilAutoLiabilityCreateDTO.getCountryCode());
		civilAutoLiability.setSeries(civilAutoLiabilityCreateDTO.getSeries());
		civilAutoLiability.setVehicleCategory(civilAutoLiabilityCreateDTO.getVehicleCategory());
		civilAutoLiability.setMakeOfVehicle(civilAutoLiabilityCreateDTO.getMakeOfVehicle());
		civilAutoLiability.setTerritorialValidity(civilAutoLiabilityCreateDTO.getTerritorialValidity());
		civilAutoLiability.setLimitCompensationForMaterialDamage(
				civilAutoLiabilityCreateDTO.getLimitCompensationForMaterialDamage());
		civilAutoLiability.setLimitCompensationForPersonalInjury(
				civilAutoLiabilityCreateDTO.getLimitCompensationForPersonalInjury());
		civilAutoLiability.setObservation(civilAutoLiabilityCreateDTO.getObservation());
		civilAutoLiability.setPrice(civilAutoLiabilityCreateDTO.getPrice());
		return civilAutoLiability;
	}
}
