
package com.application.myDocs.police;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.myDocs.police.dto.PoliceDTO;
import com.application.myDocs.police.mapper.PoliceMapper;

@RestController
@RequestMapping("/police")
public class PoliceController {
	@Autowired
	private PoliceService policeService;
	@Autowired
	private PoliceMapper policeMapper;

	@PostMapping
	private PoliceDTO createPolice(@RequestBody PoliceDTO policeDTO) {
		Police police = policeService.createPolice(policeMapper.policeDTO2Police(policeDTO));
		return policeMapper.police2PoliceDTO(police);
	}

	@DeleteMapping("/{id}")
	public void deletePoliceById(@PathVariable Integer id) {
		policeService.deletePoliceById(id);
	}

	@GetMapping("/list")
	public List<PoliceDTO> getAllPolice() {
		return policeMapper.policeList2PoliceListDTO(policeService.getAllPolice());
	}
}
