package com.application.myDocs.identityCard.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.application.myDocs.identityCard.IdentityCard;
import com.application.myDocs.identityCard.dto.IdentityCardCreateDTO;
import com.application.myDocs.identityCard.dto.IdentityCardDTO;

@Component
public class IdentityCardMapper {

	public IdentityCardDTO identityCard2IdentityCardDTO(IdentityCard identityCard) {
		IdentityCardDTO identityCardDTO = new IdentityCardDTO();
		identityCardDTO.setId(identityCard.getId());
		identityCardDTO.setSerie(identityCard.getSerie());
		identityCardDTO.setNumber(identityCard.getNumber());
		identityCardDTO.setFirstName(identityCard.getFirstName());
		identityCardDTO.setLastName(identityCard.getLastName());
		identityCardDTO.setNationality(identityCard.getNationality());
		identityCardDTO.setPlaceOfBirth(identityCard.getPlaceOfBirth());
		identityCardDTO.setAddress(identityCard.getAddress());
		identityCardDTO.setIssuedBy(identityCard.getIssuedBy());
		identityCardDTO.setIssuedDate(identityCard.getIssuedDate());
		identityCardDTO.setExpirationDate(identityCard.getExpirationDate());
		identityCardDTO.setSex(identityCard.getSex());
		return identityCardDTO;
	}

	public IdentityCard identityCardDTO2IdentityCard(IdentityCardDTO identityCardDTO) {
		IdentityCard identityCard = new IdentityCard();
		identityCard.setId(identityCardDTO.getId());
		identityCard.setSerie(identityCardDTO.getSerie());
		identityCard.setNumber(identityCardDTO.getNumber());
		identityCard.setFirstName(identityCardDTO.getFirstName());
		identityCard.setLastName(identityCardDTO.getLastName());
		identityCard.setNationality(identityCardDTO.getNationality());
		identityCard.setPlaceOfBirth(identityCardDTO.getPlaceOfBirth());
		identityCard.setAddress(identityCardDTO.getAddress());
		identityCard.setIssuedBy(identityCardDTO.getIssuedBy());
		identityCard.setIssuedDate(identityCardDTO.getIssuedDate());
		identityCard.setExpirationDate(identityCardDTO.getExpirationDate());
		identityCard.setSex(identityCardDTO.getSex());
		return identityCard;
	}

	public List<IdentityCardDTO> identityCardList2IdentityCardListDTO(List<IdentityCard> list) {
		return list.stream().map(identityCard -> identityCard2IdentityCardDTO(identityCard))
				.collect(Collectors.toList());
	}

	public IdentityCard identityCardCreateDTO2IdentityCard(IdentityCardCreateDTO identityCardCreateDTO) {
		IdentityCard identityCard = new IdentityCard();
		identityCard.setId(identityCardCreateDTO.getId());
		identityCard.setSerie(identityCardCreateDTO.getSerie());
		identityCard.setNumber(identityCardCreateDTO.getNumber());
		identityCard.setFirstName(identityCardCreateDTO.getFirstName());
		identityCard.setLastName(identityCardCreateDTO.getLastName());
		identityCard.setNationality(identityCardCreateDTO.getNationality());
		identityCard.setPlaceOfBirth(identityCardCreateDTO.getPlaceOfBirth());
		identityCard.setAddress(identityCardCreateDTO.getAddress());
		identityCard.setIssuedBy(identityCardCreateDTO.getIssuedBy());
		identityCard.setIssuedDate(identityCardCreateDTO.getIssuedDate());
		identityCard.setExpirationDate(identityCardCreateDTO.getExpirationDate());
		identityCard.setSex(identityCardCreateDTO.getSex());
		return identityCard;
	}
}
