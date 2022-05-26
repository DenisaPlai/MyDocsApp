package com.application.myDocs.vehicleIdentityCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicleIdentityCard")
public class VehicleIdentityCardController {

	@Autowired
	private VehicleIdentityCardService vicService;

	@PostMapping
	public VehicleIdentityCard createVic(@RequestBody VehicleIdentityCard vic) {
		return vicService.createVic(vic);
	}

	@DeleteMapping("/{id}")
	public void deleteVrcById(@PathVariable Integer id) {
		vicService.deleteVicById(id);
	}
}
