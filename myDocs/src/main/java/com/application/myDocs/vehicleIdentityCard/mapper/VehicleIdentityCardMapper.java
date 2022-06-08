package com.application.myDocs.vehicleIdentityCard.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.application.myDocs.vehicleIdentityCard.VehicleIdentityCard;
import com.application.myDocs.vehicleIdentityCard.dto.VehicleIdentityCardDTO;

@Component
public class VehicleIdentityCardMapper {

	public VehicleIdentityCardDTO vehicleIdentityCard2VehicleIdentityCardDTO(VehicleIdentityCard vehicleIdentityCard) {
		VehicleIdentityCardDTO vehicleIdentityCardDTO = new VehicleIdentityCardDTO();
		vehicleIdentityCardDTO.setId(vehicleIdentityCard.getId());
		vehicleIdentityCardDTO.setRegistrationNo(vehicleIdentityCard.getRegistrationNo());
		vehicleIdentityCardDTO.setRegistrationAuthority(vehicleIdentityCard.getRegistrationAuthority());
		vehicleIdentityCardDTO.setRegistrationDate(vehicleIdentityCard.getRegistrationDate());
		vehicleIdentityCardDTO.setMark(vehicleIdentityCard.getMark());
		vehicleIdentityCardDTO.setType(vehicleIdentityCard.getType());
		vehicleIdentityCardDTO.setVariant(vehicleIdentityCard.getVariant());
		vehicleIdentityCardDTO.setVersion(vehicleIdentityCard.getVersion());
		vehicleIdentityCardDTO.setTradeName(vehicleIdentityCard.getTradeName());
		vehicleIdentityCardDTO.setIdentificationNumber(vehicleIdentityCard.getIdentificationNumber());
		vehicleIdentityCardDTO.setManufactureYear(vehicleIdentityCard.getManufactureYear());
		vehicleIdentityCardDTO.setCategory(vehicleIdentityCard.getCategory());
		vehicleIdentityCardDTO.setUseCategory(vehicleIdentityCard.getUseCategory());
		vehicleIdentityCardDTO.setClasses(vehicleIdentityCard.getClasses());
		vehicleIdentityCardDTO.setCarrossery(vehicleIdentityCard.getCarrossery());
		vehicleIdentityCardDTO.setTypeApprovalNumber(vehicleIdentityCard.getTypeApprovalNumber());
		vehicleIdentityCardDTO.setNationalRegisterNumber(vehicleIdentityCard.getNationalRegisterNumber());
		vehicleIdentityCardDTO.setAxlesNumber(vehicleIdentityCard.getAxlesNumber());
		vehicleIdentityCardDTO.setMaxPermissibleMass(vehicleIdentityCard.getMaxPermissibleMass());
		vehicleIdentityCardDTO.setMaxPermissibleMassForAxis1(vehicleIdentityCard.getMaxPermissibleMassForAxis1());
		vehicleIdentityCardDTO.setMaxPermissibleMassForAxis2(vehicleIdentityCard.getMaxPermissibleMassForAxis2());
		vehicleIdentityCardDTO.setMaxPermissibleMassForAxis3(vehicleIdentityCard.getMaxPermissibleMassForAxis3());
		vehicleIdentityCardDTO.setMaxPermissibleMassForAxis4(vehicleIdentityCard.getMaxPermissibleMassForAxis4());
		vehicleIdentityCardDTO.setMaxPermissibleMassForAxis5(vehicleIdentityCard.getMaxPermissibleMassForAxis5());
		vehicleIdentityCardDTO
				.setVehicleAssemblyMaxPermissibleMss(vehicleIdentityCard.getVehicleAssemblyMaxPermissibleMss());
		vehicleIdentityCardDTO.setMassInRunningOrders(vehicleIdentityCard.getMassInRunningOrders());
		vehicleIdentityCardDTO.setRealMass(vehicleIdentityCard.getRealMass());
		vehicleIdentityCardDTO.setLength(vehicleIdentityCard.getLength());
		vehicleIdentityCardDTO.setWidth(vehicleIdentityCard.getWidth());
		vehicleIdentityCardDTO.setHeight(vehicleIdentityCard.getHeight());
		vehicleIdentityCardDTO.setDistanceBetweenTheAxes(vehicleIdentityCard.getDistanceBetweenTheAxes());
		vehicleIdentityCardDTO.setEngineCode(vehicleIdentityCard.getEngineCode());
		vehicleIdentityCardDTO.setEngineCode(vehicleIdentityCard.getEngineCode());
		vehicleIdentityCardDTO.setCylinderCapacity(vehicleIdentityCard.getCylinderCapacity());
		vehicleIdentityCardDTO.setPower(vehicleIdentityCard.getPower());
		vehicleIdentityCardDTO.setFuelType(vehicleIdentityCard.getFuelType());
		vehicleIdentityCardDTO.setRatedSpeed(vehicleIdentityCard.getRatedSpeed());
		vehicleIdentityCardDTO.setPropulsyonSystem(vehicleIdentityCard.getPropulsyonSystem());
		vehicleIdentityCardDTO.setEngineSeries(vehicleIdentityCard.getEngineSeries());
		vehicleIdentityCardDTO.setPowerElectricMotor(vehicleIdentityCard.getPowerElectricMotor());
		vehicleIdentityCardDTO.setEmissionsStandard(vehicleIdentityCard.getEmissionsStandard());
		vehicleIdentityCardDTO.setNationalEmissionCode(vehicleIdentityCard.getNationalEmissionCode());
		vehicleIdentityCardDTO.setColor(vehicleIdentityCard.getColor());
		vehicleIdentityCardDTO.setSeatsNo(vehicleIdentityCard.getSeatsNo());
		vehicleIdentityCardDTO.setStandingPlacesNo(vehicleIdentityCard.getStandingPlacesNo());
		vehicleIdentityCardDTO.setMaxSpeed(vehicleIdentityCard.getMaxSpeed());
		vehicleIdentityCardDTO.setStationarySoundLevel(vehicleIdentityCard.getStationarySoundLevel());
		vehicleIdentityCardDTO.setEngineRevving(vehicleIdentityCard.getEngineRevving());
		vehicleIdentityCardDTO.setPowerWeightRatio(vehicleIdentityCard.getPowerWeightRatio());
		vehicleIdentityCardDTO.setCo2(vehicleIdentityCard.getCo2());
		vehicleIdentityCardDTO.setTraction(vehicleIdentityCard.getTraction());
		vehicleIdentityCardDTO.setFrontAxleTires(vehicleIdentityCard.getFrontAxleTires());
		vehicleIdentityCardDTO.setFrontAxleTires(vehicleIdentityCard.getFrontAxleTires());
		vehicleIdentityCardDTO.setRearAxleTires(vehicleIdentityCard.getRearAxleTires());
		vehicleIdentityCardDTO.setFrontAxleSuspension(vehicleIdentityCard.getFrontAxleSuspension());
		vehicleIdentityCardDTO.setRearAxleSuspension(vehicleIdentityCard.getRearAxleSuspension());
		vehicleIdentityCardDTO.setTankCapacity(vehicleIdentityCard.getTankCapacity());
		vehicleIdentityCardDTO.setRarOffice(vehicleIdentityCard.getRarOffice());
		vehicleIdentityCardDTO.setIssueDate(vehicleIdentityCard.getIssueDate());
		return vehicleIdentityCardDTO;
	}

	public VehicleIdentityCard vehicleIdentityCardDTO2VehicleIdentityCard(
			VehicleIdentityCardDTO vehicleIdentityCardDTO) {
		VehicleIdentityCard vehicleIdentityCard = new VehicleIdentityCard();
		vehicleIdentityCard.setId(vehicleIdentityCardDTO.getId());
		vehicleIdentityCard.setRegistrationNo(vehicleIdentityCardDTO.getRegistrationNo());
		vehicleIdentityCard.setRegistrationAuthority(vehicleIdentityCardDTO.getRegistrationAuthority());
		vehicleIdentityCard.setRegistrationDate(vehicleIdentityCardDTO.getRegistrationDate());
		vehicleIdentityCard.setMark(vehicleIdentityCardDTO.getMark());
		vehicleIdentityCard.setType(vehicleIdentityCardDTO.getType());
		vehicleIdentityCard.setVariant(vehicleIdentityCardDTO.getVariant());
		vehicleIdentityCard.setVersion(vehicleIdentityCardDTO.getVersion());
		vehicleIdentityCard.setTradeName(vehicleIdentityCardDTO.getTradeName());
		vehicleIdentityCard.setIdentificationNumber(vehicleIdentityCardDTO.getIdentificationNumber());
		vehicleIdentityCard.setManufactureYear(vehicleIdentityCardDTO.getManufactureYear());
		vehicleIdentityCard.setCategory(vehicleIdentityCardDTO.getCategory());
		vehicleIdentityCard.setUseCategory(vehicleIdentityCardDTO.getUseCategory());
		vehicleIdentityCard.setClasses(vehicleIdentityCardDTO.getClasses());
		vehicleIdentityCard.setCarrossery(vehicleIdentityCardDTO.getCarrossery());
		vehicleIdentityCard.setTypeApprovalNumber(vehicleIdentityCardDTO.getTypeApprovalNumber());
		vehicleIdentityCard.setNationalRegisterNumber(vehicleIdentityCardDTO.getNationalRegisterNumber());
		vehicleIdentityCard.setAxlesNumber(vehicleIdentityCardDTO.getAxlesNumber());
		vehicleIdentityCard.setMaxPermissibleMass(vehicleIdentityCard.getMaxPermissibleMass());
		vehicleIdentityCard.setMaxPermissibleMassForAxis1(vehicleIdentityCardDTO.getMaxPermissibleMassForAxis1());
		vehicleIdentityCard.setMaxPermissibleMassForAxis2(vehicleIdentityCardDTO.getMaxPermissibleMassForAxis2());
		vehicleIdentityCard.setMaxPermissibleMassForAxis3(vehicleIdentityCardDTO.getMaxPermissibleMassForAxis3());
		vehicleIdentityCard.setMaxPermissibleMassForAxis4(vehicleIdentityCardDTO.getMaxPermissibleMassForAxis4());
		vehicleIdentityCard.setMaxPermissibleMassForAxis5(vehicleIdentityCardDTO.getMaxPermissibleMassForAxis5());
		vehicleIdentityCard
				.setVehicleAssemblyMaxPermissibleMss(vehicleIdentityCardDTO.getVehicleAssemblyMaxPermissibleMss());
		vehicleIdentityCard.setMassInRunningOrders(vehicleIdentityCardDTO.getMassInRunningOrders());
		vehicleIdentityCard.setRealMass(vehicleIdentityCardDTO.getRealMass());
		vehicleIdentityCard.setLength(vehicleIdentityCardDTO.getLength());
		vehicleIdentityCard.setWidth(vehicleIdentityCardDTO.getWidth());
		vehicleIdentityCard.setHeight(vehicleIdentityCardDTO.getHeight());
		vehicleIdentityCard.setDistanceBetweenTheAxes(vehicleIdentityCardDTO.getDistanceBetweenTheAxes());
		vehicleIdentityCard.setEngineCode(vehicleIdentityCardDTO.getEngineCode());
		vehicleIdentityCard.setEngineCode(vehicleIdentityCardDTO.getEngineCode());
		vehicleIdentityCard.setCylinderCapacity(vehicleIdentityCardDTO.getCylinderCapacity());
		vehicleIdentityCard.setPower(vehicleIdentityCardDTO.getPower());
		vehicleIdentityCard.setFuelType(vehicleIdentityCardDTO.getFuelType());
		vehicleIdentityCard.setRatedSpeed(vehicleIdentityCardDTO.getRatedSpeed());
		vehicleIdentityCard.setPropulsyonSystem(vehicleIdentityCardDTO.getPropulsyonSystem());
		vehicleIdentityCard.setEngineSeries(vehicleIdentityCardDTO.getEngineSeries());
		vehicleIdentityCard.setPowerElectricMotor(vehicleIdentityCardDTO.getPowerElectricMotor());
		vehicleIdentityCard.setEmissionsStandard(vehicleIdentityCardDTO.getEmissionsStandard());
		vehicleIdentityCard.setNationalEmissionCode(vehicleIdentityCardDTO.getNationalEmissionCode());
		vehicleIdentityCard.setColor(vehicleIdentityCardDTO.getColor());
		vehicleIdentityCard.setSeatsNo(vehicleIdentityCardDTO.getSeatsNo());
		vehicleIdentityCard.setStandingPlacesNo(vehicleIdentityCardDTO.getStandingPlacesNo());
		vehicleIdentityCard.setMaxSpeed(vehicleIdentityCardDTO.getMaxSpeed());
		vehicleIdentityCard.setStationarySoundLevel(vehicleIdentityCardDTO.getStationarySoundLevel());
		vehicleIdentityCard.setEngineRevving(vehicleIdentityCardDTO.getEngineRevving());
		vehicleIdentityCard.setPowerWeightRatio(vehicleIdentityCardDTO.getPowerWeightRatio());
		vehicleIdentityCard.setCo2(vehicleIdentityCardDTO.getCo2());
		vehicleIdentityCard.setTraction(vehicleIdentityCardDTO.getTraction());
		vehicleIdentityCard.setFrontAxleTires(vehicleIdentityCardDTO.getFrontAxleTires());
		vehicleIdentityCard.setFrontAxleTires(vehicleIdentityCardDTO.getFrontAxleTires());
		vehicleIdentityCard.setRearAxleTires(vehicleIdentityCardDTO.getRearAxleTires());
		vehicleIdentityCard.setFrontAxleSuspension(vehicleIdentityCardDTO.getFrontAxleSuspension());
		vehicleIdentityCard.setRearAxleSuspension(vehicleIdentityCardDTO.getRearAxleSuspension());
		vehicleIdentityCard.setTankCapacity(vehicleIdentityCardDTO.getTankCapacity());
		vehicleIdentityCard.setRarOffice(vehicleIdentityCardDTO.getRarOffice());
		vehicleIdentityCard.setIssueDate(vehicleIdentityCardDTO.getIssueDate());
		return vehicleIdentityCard;
	}

	public List<VehicleIdentityCardDTO> vehicleIdentityCardList2VehicleIdentityCardDTO(List<VehicleIdentityCard> list) {
		return list.stream().map(vehicleIdentityCard -> vehicleIdentityCard2VehicleIdentityCardDTO(vehicleIdentityCard))
				.collect(Collectors.toList());
	}
}
