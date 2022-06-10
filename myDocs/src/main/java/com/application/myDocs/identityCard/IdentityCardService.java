package com.application.myDocs.identityCard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.myDocs.driver.Driver;
import com.application.myDocs.driver.DriverService;

@Service
public class IdentityCardService {

	@Autowired
	private IdentityCardRepository identityCardRepository;
	@Autowired
	private DriverService driverService;

	public IdentityCard createIdentityCard(IdentityCard identityCard) {
		return identityCardRepository.saveAndFlush(identityCard);
	}

	public void deleteIdentityCardById(Integer id) {
		identityCardRepository.deleteById(id);
	}

	public List<IdentityCard> getAllIdentityCard() {
		return identityCardRepository.findAll();
	}

	public IdentityCard createIdentityCard(IdentityCard identityCard, Integer driverId) {
		Driver driver = driverService.getDriverById(driverId);
		identityCard.addDriver(driver);
		return identityCardRepository.save(identityCard);
	}

}
