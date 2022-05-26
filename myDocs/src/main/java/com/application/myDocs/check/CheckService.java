package com.application.myDocs.check;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckService {

	@Autowired
	private CheckRepository checkRepository;

	public Check createCheck(Check check) {
		return checkRepository.saveAndFlush(check);
	}

	public void deleteCheckById(Integer id) {
		checkRepository.deleteById(id);

	}

}
