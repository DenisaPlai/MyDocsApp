package com.application.myDocs.drivingLicense;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.myDocs.drivingLicense.dto.DrivingLicenseDTO;
import com.application.myDocs.drivingLicense.mapper.DrivingLicenseMapper;

@RestController
@RequestMapping("/drivingLicense")
public class DrivingLicenseController {
	@Autowired
	private DrivingLicenseService drivingLicenseService;
	@Autowired
	private DrivingLicenseMapper drivingLicenseMapper;

	@PostMapping
	private DrivingLicenseDTO createDrivingLicense(@RequestBody DrivingLicenseDTO drivingLicenseDTO) {
		DrivingLicense drivingLicense = drivingLicenseService
				.createDrivingLicense(drivingLicenseMapper.drivingLicenseDTO2DrivingLicense(drivingLicenseDTO));
		return drivingLicenseMapper.drivingLicense2DrivingLicenseDTO(drivingLicense);
	}

	@DeleteMapping("/{id}")
	public void deleteDrivingLicenseById(@PathVariable Integer id) {
		drivingLicenseService.deleteDrivingLicenseById(id);
	}

	@GetMapping("/list")
	public List<DrivingLicenseDTO> getAllDrivingLicense() {
		return drivingLicenseMapper.drivingLicenseList2DrivingLicenseListDTO(drivingLicenseService.getAllDrivingLicense());
	}
}
