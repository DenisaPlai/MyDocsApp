package com.application.myDocs.police;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoliceService {

	@Autowired
	private PoliceRepository policeRepository;

	public Police createPolice(Police police) {
		return policeRepository.saveAndFlush(police);
	}

	public void deletePoliceById(Integer id) {
		policeRepository.deleteById(id);
	}

}
