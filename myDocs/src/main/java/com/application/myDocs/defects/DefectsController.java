package com.application.myDocs.defects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.myDocs.defects.dto.DefectsDTO;
import com.application.myDocs.defects.mapper.DefectsMapper;

@RestController
@RequestMapping("/defects")
public class DefectsController {

	@Autowired
	private DefectsService defectsService;
	@Autowired
	private DefectsMapper defectsMapper;

	@PostMapping
	private DefectsDTO createDefect(DefectsDTO defactsDTO) {
		Defects defects = defectsService.createDefects(defectsMapper.defectsDTO2Defects(defactsDTO));
		return defectsMapper.defects2DefectsDTO(defects);
	}

	@DeleteMapping("/{id}")
	public void deleteDefectsById(@PathVariable Integer id) {
		defectsService.deleteDefectsById(id);
	}
}
