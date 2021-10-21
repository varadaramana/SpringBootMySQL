package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.BankDTO;

@RestController
@RequestMapping("v1/Bank")
public class BankController {
	
	@GetMapping("/Bankid")
	public BankDTO getBank() {
		return new BankDTO("12345","sbi","agnampudi","vzg","512154");
		
	}
	@GetMapping("/Bankid/Noargs")
	public BankDTO getBankNoargs() {
		BankDTO bnk = BankDTO.builder().Bankid("23456").Bankname("kotak").Branch("vijayawada")
				.Address("Vijayawada").Pincode("5236854").build();
			return bnk;
			
	}	
	@GetMapping("/Bankid/kiran")
	public BankDTO getbankSetters() {
		BankDTO bnk = new BankDTO();
		bnk.setBankid("23456");
		bnk.setBankname("kotak");
		bnk.setBranch("vijayawada");
		bnk.setAddress("Vijayawada");
		bnk.setPincode("5236854");
		return bnk;
	}
}
