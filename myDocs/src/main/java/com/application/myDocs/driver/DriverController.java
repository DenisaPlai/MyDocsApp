package com.application.myDocs.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.myDocs.driver.dto.DriverDTO;
import com.application.myDocs.driver.dto.GetDriverDTO;
import com.application.myDocs.driver.mapper.DriverMapper;

@RestController
@RequestMapping("/drivers")
public class DriverController {

	@Autowired
	private DriverService driverService;
	@Autowired
	private DriverMapper driverMapper;

	@PostMapping
	public DriverDTO crateDriver(DriverDTO driverDTO) {
		Driver driver = driverService.createDriver(driverMapper.driverDTO2Driver(driverDTO));
		return driverMapper.driver2DriverDTO(driver);
	}

	@DeleteMapping("/{id}")
	public void deleteDriverById(@PathVariable Integer id) {
		driverService.deleteDriverById(id);
	}

	@GetMapping("/list")
	public List<DriverDTO> getAllDrivers() {
		return driverMapper.driverList2DriverListDTO(driverService.getAllDrivers());
	}

	@GetMapping("/byCnp")
	public DriverDTO getDriverByCnp(@RequestParam String cnp) {
		return driverMapper.driver2DriverDTO(driverService.getDriverByCnp(cnp));
	}
	
	@GetMapping("/byCnpWithDocs")
	public GetDriverDTO getDriverByCnpDoc(@RequestParam String cnp) {
		return driverMapper.driver2GetDriverDTO(driverService.getDriverByCnp(cnp));
	}

	@PutMapping("/{id}")
	public DriverDTO updateDriver(@RequestBody DriverDTO driverDTO, @PathVariable Integer id) {
		Driver driver = driverService.updateDriverById(driverMapper.driverDTO2Driver(driverDTO), id);
		return driverMapper.driver2DriverDTO(driver);
	}
}
