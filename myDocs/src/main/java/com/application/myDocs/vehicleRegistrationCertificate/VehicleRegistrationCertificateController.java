package com.application.myDocs.vehicleRegistrationCertificate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicleRegistrationCertificate")
public class VehicleRegistrationCertificateController {

	@Autowired
	private VehicleRegistrationCertificateService vrcService;

	@PostMapping
	public VehicleRegistrationCertificate createVrc(@RequestBody VehicleRegistrationCertificate vrc) {
		return vrcService.createVrc(vrc);
	}

	@DeleteMapping("/{id}")
	public void deleteVrcById(@PathVariable Integer id) {
		vrcService.deleteVrcById(id);
	}
}
