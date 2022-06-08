package com.application.myDocs.vehicleIdentityCard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.myDocs.vehicleIdentityCard.dto.VehicleIdentityCardDTO;
import com.application.myDocs.vehicleIdentityCard.mapper.VehicleIdentityCardMapper;

@RestController
@RequestMapping("/vehicleIdentityCard")
public class VehicleIdentityCardController {

	@Autowired
	private VehicleIdentityCardService vicService;
	@Autowired
	private VehicleIdentityCardMapper vicMapper;

	@PostMapping
	public VehicleIdentityCardDTO creatVehicleIdentityCard(@RequestBody VehicleIdentityCardDTO vicDTO) {
		VehicleIdentityCard vic = vicService.createVic(vicMapper.vehicleIdentityCardDTO2VehicleIdentityCard(vicDTO));
		return vicMapper.vehicleIdentityCard2VehicleIdentityCardDTO(vic);
	}

	@DeleteMapping("/{id}")
	public void deleteVrcById(@PathVariable Integer id) {
		vicService.deleteVicById(id);
	}

	@GetMapping("/list")
	public List<VehicleIdentityCardDTO> getAllVehicleIdentityCard() {
		return vicMapper.vehicleIdentityCardList2VehicleIdentityCardDTO(vicService.getAllVic());
	}
}
