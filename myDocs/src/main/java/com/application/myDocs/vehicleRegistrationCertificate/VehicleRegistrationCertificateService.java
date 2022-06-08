package com.application.myDocs.vehicleRegistrationCertificate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleRegistrationCertificateService {

	@Autowired
	private VehicleRegistrationCertificateRepository vrcRepository;

	public VehicleRegistrationCertificate createVrc(VehicleRegistrationCertificate vrc) {
		return vrcRepository.saveAndFlush(vrc);
	}

	public void deleteVrcById(Integer id) {
		vrcRepository.deleteById(id);
	}

	public List<VehicleRegistrationCertificate> getAllVrc() {
		return vrcRepository.findAll();
	}

}
