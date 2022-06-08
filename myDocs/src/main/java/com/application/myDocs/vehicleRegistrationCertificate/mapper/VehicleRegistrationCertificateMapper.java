package com.application.myDocs.vehicleRegistrationCertificate.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.application.myDocs.vehicleRegistrationCertificate.VehicleRegistrationCertificate;
import com.application.myDocs.vehicleRegistrationCertificate.dto.VehicleRegistrationCertificateDTO;

@Component
public class VehicleRegistrationCertificateMapper {

	public VehicleRegistrationCertificateDTO vehicleRegistrationCertificate2VehicleRegistrationCertificateDTO(
			VehicleRegistrationCertificate vehicleRegistrationCertificate) {
		VehicleRegistrationCertificateDTO vehicleRegistrationCertificateDTO = new VehicleRegistrationCertificateDTO();
		vehicleRegistrationCertificateDTO.setId(vehicleRegistrationCertificate.getId());
		vehicleRegistrationCertificateDTO.setRegistrationNo(vehicleRegistrationCertificate.getRegistrationNo());
		vehicleRegistrationCertificateDTO.setCategoryId(vehicleRegistrationCertificate.getCategoryId());
		vehicleRegistrationCertificateDTO.setMark(vehicleRegistrationCertificate.getMark());
		vehicleRegistrationCertificateDTO.setModel(vehicleRegistrationCertificate.getModel());
		vehicleRegistrationCertificateDTO.setType(vehicleRegistrationCertificate.getType());
		vehicleRegistrationCertificateDTO.setVin(vehicleRegistrationCertificate.getVin());
		vehicleRegistrationCertificateDTO.setTypeApprovalNo(vehicleRegistrationCertificate.getTypeApprovalNo());
		vehicleRegistrationCertificateDTO.setMaxPermissibleMass(vehicleRegistrationCertificate.getMaxPermissibleMass());
		vehicleRegistrationCertificateDTO.setCylinderCapacity(vehicleRegistrationCertificate.getCylinderCapacity());
		vehicleRegistrationCertificateDTO.setFuelType(vehicleRegistrationCertificate.getFuelType());
		vehicleRegistrationCertificateDTO.setColor(vehicleRegistrationCertificate.getColor());
		vehicleRegistrationCertificateDTO.setSeatsNo(vehicleRegistrationCertificate.getSeatsNo());
		vehicleRegistrationCertificateDTO.setStandingPlacesNo(vehicleRegistrationCertificate.getStandingPlacesNo());
		vehicleRegistrationCertificateDTO.setSuspended(vehicleRegistrationCertificate.isSuspended());
		vehicleRegistrationCertificateDTO.setMaxPower(vehicleRegistrationCertificate.getMaxPower());
		vehicleRegistrationCertificateDTO.setMassInService(vehicleRegistrationCertificate.getMassInService());
		vehicleRegistrationCertificateDTO
				.setFirstRegistrationDate(vehicleRegistrationCertificate.getFirstRegistrationDate());
		vehicleRegistrationCertificateDTO.setDateOfIssue(vehicleRegistrationCertificate.getDateOfIssue());
		vehicleRegistrationCertificateDTO.setExpirationDate(vehicleRegistrationCertificate.getExpirationDate());
		return vehicleRegistrationCertificateDTO;
	}

	public VehicleRegistrationCertificate vehicleRegistrationCertificateDTO2VehicleRegistrationCertificate(
			VehicleRegistrationCertificateDTO vehicleRegistrationCertificateDTO) {
		VehicleRegistrationCertificate vehicleRegistrationCertificate = new VehicleRegistrationCertificate();
		vehicleRegistrationCertificate.setId(vehicleRegistrationCertificateDTO.getId());
		vehicleRegistrationCertificate.setRegistrationNo(vehicleRegistrationCertificateDTO.getRegistrationNo());
		vehicleRegistrationCertificate.setCategoryId(vehicleRegistrationCertificateDTO.getCategoryId());
		vehicleRegistrationCertificate.setMark(vehicleRegistrationCertificateDTO.getMark());
		vehicleRegistrationCertificate.setModel(vehicleRegistrationCertificateDTO.getModel());
		vehicleRegistrationCertificate.setType(vehicleRegistrationCertificateDTO.getType());
		vehicleRegistrationCertificate.setVin(vehicleRegistrationCertificateDTO.getVin());
		vehicleRegistrationCertificate.setTypeApprovalNo(vehicleRegistrationCertificateDTO.getTypeApprovalNo());
		vehicleRegistrationCertificate.setMaxPermissibleMass(vehicleRegistrationCertificateDTO.getMaxPermissibleMass());
		vehicleRegistrationCertificate.setCylinderCapacity(vehicleRegistrationCertificateDTO.getCylinderCapacity());
		vehicleRegistrationCertificate.setFuelType(vehicleRegistrationCertificateDTO.getFuelType());
		vehicleRegistrationCertificate.setColor(vehicleRegistrationCertificateDTO.getColor());
		vehicleRegistrationCertificate.setSeatsNo(vehicleRegistrationCertificateDTO.getSeatsNo());
		vehicleRegistrationCertificate.setStandingPlacesNo(vehicleRegistrationCertificateDTO.getStandingPlacesNo());
		vehicleRegistrationCertificate.setSuspended(vehicleRegistrationCertificateDTO.isSuspended());
		vehicleRegistrationCertificate.setMaxPower(vehicleRegistrationCertificateDTO.getMaxPower());
		vehicleRegistrationCertificate.setMassInService(vehicleRegistrationCertificateDTO.getMassInService());
		vehicleRegistrationCertificate
				.setFirstRegistrationDate(vehicleRegistrationCertificateDTO.getFirstRegistrationDate());
		vehicleRegistrationCertificate.setDateOfIssue(vehicleRegistrationCertificateDTO.getDateOfIssue());
		vehicleRegistrationCertificate.setExpirationDate(vehicleRegistrationCertificateDTO.getExpirationDate());
		return vehicleRegistrationCertificate;
	}

	public List<VehicleRegistrationCertificateDTO> vehicleRegistrationCertificateList2VehicleRegistrationCertificateListDTO(
			List<VehicleRegistrationCertificate> list) {
		return list.stream()
				.map(vehicleRegistrationCertificate -> vehicleRegistrationCertificate2VehicleRegistrationCertificateDTO(
						vehicleRegistrationCertificate))
				.collect(Collectors.toList());
	}
}
