package com.application.myDocs.fine.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.application.myDocs.fine.Fine;
import com.application.myDocs.fine.dto.FineCreateDTO;
import com.application.myDocs.fine.dto.FineDTO;

@Component
public class FineMapper {

	public FineDTO fine2FineDTO(Fine fine) {
		FineDTO fineDTO = new FineDTO();
		fineDTO.setId(fine.getId());
		fineDTO.setReason(fine.getReason());
		fineDTO.setAmount(fine.getAmount());
		fineDTO.setPenaltyPoints(fine.getPenaltyPoints());
		fineDTO.setPaymentDate(fine.getPaymentDate());
		fineDTO.setObservations(fine.getObservations());
		return fineDTO;
	}

	public Fine fineDTO2Fine(FineDTO fineDTO) {
		Fine fine = new Fine();
		fine.setId(fineDTO.getId());
		fine.setReason(fineDTO.getReason());
		fine.setAmount(fineDTO.getAmount());
		fine.setPenaltyPoints(fineDTO.getPenaltyPoints());
		fine.setPaymentDate(fineDTO.getPaymentDate());
		fine.setObservations(fineDTO.getObservations());
		return fine;
	}

	public List<FineDTO> fineList2FineListDTO(List<Fine> list) {
		return list.stream().map(fine -> fine2FineDTO(fine)).collect(Collectors.toList());
	}

	public Fine fineCreateDTO2Fine(FineCreateDTO fineCreateDTO) {
		Fine fine = new Fine();
		fine.setAmount(fineCreateDTO.getAmount());	
		fine.setObservations(fineCreateDTO.getObservations());
		fine.setPaymentDate(fineCreateDTO.getPaymentDate());
		fine.setPenaltyPoints(fineCreateDTO.getPenaltyPoints());
		fine.setReason(fineCreateDTO.getReason());
		return fine;
	}
}
