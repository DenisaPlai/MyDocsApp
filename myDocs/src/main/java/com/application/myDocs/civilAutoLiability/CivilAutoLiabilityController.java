package com.application.myDocs.civilAutoLiability;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/civilAutoLiability")
public class CivilAutoLiabilityController {

	@Autowired
	private CivilAutoLiabilityService calService;

	@PostMapping
	public CivilAutoLiability createCal(@RequestBody CivilAutoLiability cal) {
		return calService.createCal(cal);
	}

	@DeleteMapping("/{id}")
	public void deleteCalById(@PathVariable Integer id) {
		calService.deleteCalById(id);
	}
}
