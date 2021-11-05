package com.myapp.service.employee;

import org.springframework.stereotype.Service;

import com.myapp.datatransferobject.AddressDTO;

@Service
public class AddressService {

	public AddressDTO getAddressDTO() {

		AddressDTO addto = new AddressDTO();
		addto.setEmpDoorNum(101);
		addto.setEmpStreet("Talari");
		addto.setEmpVillage("Aga");
		addto.setEmpTown("Vizag");
		addto.setEmpState("A.P");
		addto.setEmpPincode(530046);
		return addto;

	}

	public AddressDTO getempAddressDTO() {
		AddressDTO addempdto = new AddressDTO();
		addempdto.setEmpDoorNum(4-16/9);
		addempdto.setEmpPincode(530053);
		addempdto.setEmpState("hyd");
		addempdto.setEmpStreet("balanagar");
		addempdto.setEmpTown("Telangana");
		addempdto.setEmpVillage("srclolony");
		
		return addempdto;
		
	}
}
