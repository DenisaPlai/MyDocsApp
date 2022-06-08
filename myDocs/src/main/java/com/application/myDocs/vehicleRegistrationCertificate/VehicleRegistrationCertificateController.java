package com.application.myDocs.vehicleRegistrationCertificate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.myDocs.vehicleRegistrationCertificate.dto.VehicleRegistrationCertificateDTO;
import com.application.myDocs.vehicleRegistrationCertificate.mapper.VehicleRegistrationCertificateMapper;

@RestController
@RequestMapping("/vehicleRegistrationCertificate")
public class VehicleRegistrationCertificateController {

	@Autowired
	private VehicleRegistrationCertificateService vrcService;
	@Autowired
	private VehicleRegistrationCertificateMapper vrcMapper;

	@PostMapping
	public VehicleRegistrationCertificateDTO createVrc(@RequestBody VehicleRegistrationCertificateDTO vrcDTO) {
		VehicleRegistrationCertificate vrc = vrcService
				.createVrc(vrcMapper.vehicleRegistrationCertificateDTO2VehicleRegistrationCertificate(vrcDTO));
		return vrcMapper.vehicleRegistrationCertificate2VehicleRegistrationCertificateDTO(vrc);
	}

	@DeleteMapping("/{id}")
	public void deleteVrcById(@PathVariable Integer id) {
		vrcService.deleteVrcById(id);
	}

	@GetMapping("/list")
	public List<VehicleRegistrationCertificateDTO> getAllVrc() {
		return vrcMapper
				.vehicleRegistrationCertificateList2VehicleRegistrationCertificateListDTO(vrcService.getAllVrc());
	}
}
