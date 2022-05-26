package com.application.myDocs.fine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fine")
public class FineController {

	@Autowired
	private FineService fineService;

	@PostMapping
	public Fine crateFine(@RequestBody Fine fine) {
		return fineService.createFine(fine);
	}

	@DeleteMapping("/{id}")
	public void deleteVrcById(@PathVariable Integer id) {
		fineService.deleteFineById(id);
	}

}
