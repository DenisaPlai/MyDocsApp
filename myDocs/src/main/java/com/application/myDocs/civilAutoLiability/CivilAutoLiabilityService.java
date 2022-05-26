package com.application.myDocs.civilAutoLiability;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CivilAutoLiabilityService {

	@Autowired
	private CivilAutoLiabilityRepository calRepository;

	public CivilAutoLiability createCal(CivilAutoLiability cal) {
		return calRepository.saveAndFlush(cal);
	}

	public void deleteCalById(Integer id) {
		calRepository.deleteById(id);
	}

}
