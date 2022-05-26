package com.application.myDocs.defects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefectsService {

	@Autowired
	private DefectsRepository defectsRepository;

	public Defects createDefects(Defects defects) {
		return defectsRepository.saveAndFlush(defects);
	}

	public void deleteDefectsById(Integer id) {
		defectsRepository.deleteById(id);

	}

}
