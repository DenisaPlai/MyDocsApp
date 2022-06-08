package com.application.myDocs.vehicleIdentityCard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleIdentityCardService {

	@Autowired
	private VehicleIdentityCardRepository vicRepository;

	public VehicleIdentityCard createVic(VehicleIdentityCard vic) {
		return vicRepository.saveAndFlush(vic);
	}

	public void deleteVicById(Integer id) {
		vicRepository.deleteById(id);
	}

	public List<VehicleIdentityCard> getAllVic() {
		return vicRepository.findAll();
	}

}
