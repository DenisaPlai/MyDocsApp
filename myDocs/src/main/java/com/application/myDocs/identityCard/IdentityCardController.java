package com.application.myDocs.identityCard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.myDocs.identityCard.dto.IdentityCardCreateDTO;
import com.application.myDocs.identityCard.dto.IdentityCardDTO;
import com.application.myDocs.identityCard.mapper.IdentityCardMapper;

@RestController
@RequestMapping("/identityCard")
public class IdentityCardController {

	@Autowired
	private IdentityCardService identityCardService;
	@Autowired
	private IdentityCardMapper identityCardMapper;

	@PostMapping
	public IdentityCardDTO createIdentityCard(@RequestBody IdentityCardDTO identityCardDTO) {
		IdentityCard identityCard = identityCardService
				.createIdentityCard(identityCardMapper.identityCardDTO2IdentityCard(identityCardDTO));
		return identityCardMapper.identityCard2IdentityCardDTO(identityCard);
	}

	@DeleteMapping("/{id}")
	public void deleteIdentityCardById(@PathVariable Integer id) {
		identityCardService.deleteIdentityCardById(id);
	}

	@GetMapping("/list")
	public List<IdentityCardDTO> getAllIdentityCard() {
		return identityCardMapper.identityCardList2IdentityCardListDTO(identityCardService.getAllIdentityCard());
	}

	@PostMapping("/with-driver")
	public IdentityCardDTO createIdentityCardWithDriver(@RequestBody IdentityCardCreateDTO identityCardCreateDTO) {
		IdentityCard createIdentityCard = identityCardService.createIdentityCard(
				identityCardMapper.identityCardCreateDTO2IdentityCard(identityCardCreateDTO),
				identityCardCreateDTO.getDriverId());
		return identityCardMapper.identityCard2IdentityCardDTO(createIdentityCard);
	}
}
