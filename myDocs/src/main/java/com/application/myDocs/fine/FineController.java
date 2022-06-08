package com.application.myDocs.fine;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.myDocs.fine.dto.FineDTO;
import com.application.myDocs.fine.mapper.FineMapper;

@RestController
@RequestMapping("/fine")
public class FineController {

	@Autowired
	private FineService fineService;
	@Autowired
	private FineMapper fineMapper;

	@PostMapping
	public FineDTO crateFine(@RequestBody FineDTO fineDTO) {
		Fine fine = fineService.createFine(fineMapper.fineDTO2Fine(fineDTO));
		return fineMapper.fine2FineDTO(fine);
	}

	@DeleteMapping("/{id}")
	public void deleteFineById(@PathVariable Integer id) {
		fineService.deleteFineById(id);
	}

	@GetMapping("/list")
	public List<FineDTO> getAllFine() {
		return fineMapper.fineList2FineListDTO(fineService.getAllFine());
	}

}
