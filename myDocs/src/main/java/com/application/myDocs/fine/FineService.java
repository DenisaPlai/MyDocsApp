package com.application.myDocs.fine;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FineService {

	@Autowired
	private FineRepository fineRepository;

	public Fine createFine(Fine fine) {
		return fineRepository.saveAndFlush(fine);
	}

	public void deleteFineById(Integer id) {
		fineRepository.deleteById(id);

	}

	public List<Fine> getAllFine() {
		return fineRepository.findAll();
	}

}
