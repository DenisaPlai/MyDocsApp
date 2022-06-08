package com.application.myDocs.roadworthinessCertificate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoadworthinessCertificateService {

	@Autowired
	private RoadworthinessCertificateRepository rcRepository;

	public RoadworthinessCertificate createRoadworthinessCertificate(RoadworthinessCertificate rc) {
		return rcRepository.saveAndFlush(rc);
	}

	public void deleteRoadworthinessCertificateById(Integer id) {
		rcRepository.deleteById(id);
	}

	public List<RoadworthinessCertificate> getAllRoadworthinessCertificate() {
		return rcRepository.findAll();
	}
}
