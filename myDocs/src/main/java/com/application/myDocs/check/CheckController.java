package com.application.myDocs.check;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.myDocs.check.dto.CheckDTO;
import com.application.myDocs.check.mapper.CheckMapper;

@RestController
@RequestMapping("/checks")
public class CheckController {

	@Autowired
	private CheckService checkService;
	@Autowired
	private CheckMapper checkMapper;

	@PostMapping
	public CheckDTO creatCheck(@RequestBody CheckDTO checkDTO) {
		Check check = checkService.createCheck(checkMapper.checkDTO2check(checkDTO));
		return checkMapper.check2checkDTO(check);
	}

	@DeleteMapping("/{id}")
	public void deleteCheckById(@PathVariable Integer id) {
		checkService.deleteCheckById(id);
	}

	@GetMapping("/list")
	public List<CheckDTO> getAllCheck() {
		return checkMapper.checkList2CheckListDTO(checkService.getAllCheck());
	}

	@PostMapping("/add/{policeId}/{driverId}")
	public ResponseEntity<Object> createCheckWithPoliceAndDriver(@PathVariable Integer policeId,
			@PathVariable Integer driverId, @RequestBody CheckDTO checkDTO) {
		try {
			Check createdCheck = checkService.createCheckWithPoliceAndDriver(policeId, driverId,
					checkMapper.checkDTO2check(checkDTO));
			return ResponseEntity.ok(checkMapper.check2checkDTO(createdCheck));
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
}
