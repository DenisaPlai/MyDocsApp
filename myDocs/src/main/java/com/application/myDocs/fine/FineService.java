package com.application.myDocs.fine;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.myDocs.check.Check;
import com.application.myDocs.check.CheckService;

@Service
public class FineService {

	@Autowired
	private FineRepository fineRepository;
	@Autowired
	private CheckService checkService;

	public Fine createFine(Fine fine) {
		return fineRepository.saveAndFlush(fine);
	}

	public void deleteFineById(Integer id) {
		fineRepository.deleteById(id);

	}

	public List<Fine> getAllFine() {
		return fineRepository.findAll();
	}

	public Fine createFine(Fine fine, Integer checkId) {
		Check check = checkService.getCheck(checkId);
		fine.addCheck(check);
		return fineRepository.save(fine);
	}
	
//create book with autor
//       fine with check

}
