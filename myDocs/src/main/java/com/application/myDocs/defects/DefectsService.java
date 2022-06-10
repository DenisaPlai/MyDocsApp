package com.application.myDocs.defects;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.myDocs.roadworthinessCertificate.RoadworthinessCertificate;
import com.application.myDocs.roadworthinessCertificate.RoadworthinessCertificateService;

@Service
public class DefectsService {

	@Autowired
	private DefectsRepository defectsRepository;
	@Autowired
	private RoadworthinessCertificateService roadworthinessCertificateService;

	public Defects createDefects(Defects defects) {
		return defectsRepository.saveAndFlush(defects);
	}

	public void deleteDefectsById(Integer id) {
		defectsRepository.deleteById(id);

	}

	public List<Defects> getAllDefects() {
		return defectsRepository.findAll();
	}

	public Defects createDefects(Defects defects, Integer rcId) {
		RoadworthinessCertificate roadworthinessCertificate = roadworthinessCertificateService
				.getRoadworthinessCertificate(rcId);
		defects.addRc(roadworthinessCertificate);
		return defectsRepository.save(defects);
	}

}
