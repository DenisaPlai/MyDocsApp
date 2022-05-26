package com.application.myDocs.identityCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/identityCard")
public class IdentityCardController {

	@Autowired
	private IdentityCardService identityCardService;

	@PostMapping
	public IdentityCard createIdentityCard(@RequestBody IdentityCard identityCard) {
		return identityCardService.createIdentityCard(identityCard);
	}

	@DeleteMapping("/{id}")
	public void deleteIdentityCardById(@PathVariable Integer id) {
		identityCardService.deleteIdentityCardById(id);
	}
}
