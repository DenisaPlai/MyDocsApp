package com.application.myDocs.roadworthinessCertificate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.myDocs.roadworthinessCertificate.dto.RoadworthinessCertificateDTO;
import com.application.myDocs.roadworthinessCertificate.mapper.RoadworthinessCertificateMapper;

@RestController
@RequestMapping("/roadworthinessCertificate")
public class RoadworthinessCertificateController {

	@Autowired
	private RoadworthinessCertificateService rcService;
	@Autowired
	private RoadworthinessCertificateMapper rcMapper;

	@PostMapping
	private RoadworthinessCertificateDTO createRoadworthinessCertificate(
			@RequestBody RoadworthinessCertificateDTO rcDTO) {
		RoadworthinessCertificate rc = rcService.createRoadworthinessCertificate(
				rcMapper.roadworthinessCertificateDTO2RoadworthinessCertificate(rcDTO));
		return rcMapper.roadworthinessCertificate2RoadworthinessCertificateDTO(rc);
	}

	@DeleteMapping("/{id}")
	public void deleteRoadworthinessCertificate(@PathVariable Integer id) {
		rcService.deleteRoadworthinessCertificateById(id);
	}

	@GetMapping("/list")
	public List<RoadworthinessCertificateDTO> getAllRoadworthinessCertificate() {
		return rcMapper.roadworthinessCertificateList2RoadworthinessCertificateListDTO(
				rcService.getAllRoadworthinessCertificate());
	}
}
