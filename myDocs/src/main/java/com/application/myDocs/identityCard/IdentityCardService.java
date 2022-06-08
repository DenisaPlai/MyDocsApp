package com.application.myDocs.identityCard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdentityCardService {

	@Autowired
	private IdentityCardRepository identityCardRepository;

	public IdentityCard createIdentityCard(IdentityCard identityCard) {
		return identityCardRepository.saveAndFlush(identityCard);
	}

	public void deleteIdentityCardById(Integer id) {
		identityCardRepository.deleteById(id);
	}

	public List<IdentityCard> getAllIdentityCard() {
		return identityCardRepository.findAll();
	}

}
