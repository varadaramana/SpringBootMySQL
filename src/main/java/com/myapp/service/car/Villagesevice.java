package com.myapp.service.car;

import org.springframework.stereotype.Service;

import com.myapp.datatransferobject.VillageDTO;

@Service
public class Villagesevice {
	
	public VillageDTO getvillageDTO() {
		VillageDTO vdto = new VillageDTO();
		vdto.setVillgeName("attada");
		vdto.setVillgeId("0123");
		vdto.setVillgeMand("jami");
		vdto.setVillgeDist("vzm");
		
		return vdto;
	}
}
