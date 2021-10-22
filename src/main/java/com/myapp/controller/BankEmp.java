package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.BankEmpDetails;

@RestController
@RequestMapping("/v1/name")
public class BankEmp {

	@GetMapping("/data")
	public BankEmpDetails getBankEmpDat() {
		BankEmpDetails ba = new BankEmpDetails("78", "kishore", "67578", "9010657068", "aganampudi");
		return ba;
	}

	@GetMapping("/history")
	public BankEmpDetails getBankEmphistory() {
		BankEmpDetails ba = BankEmpDetails.builder().name("guryu").Eid("87").salary("55767").pnumber("8764324569")
				.adress("gajuwaka").build();
		return ba;

	}

	@GetMapping("/setters")
	public BankEmpDetails getBankEmpsetters() {
		BankEmpDetails ba = new BankEmpDetails();
		ba.setEid("97");
		ba.setName("srinu");
		ba.setSalary("878878");
		ba.setAdress("talari");
		ba.setPnumber("97887565454");

		return ba;

	}

	@GetMapping("/test")
	public BankEmpDetails getBankEmptest(@RequestParam("Eid") String eid, @RequestParam("adress") String adress,
			@RequestParam("salary") String salary, @RequestParam("pnumber") String pnumber,
			@RequestParam("name") String name)

	{
		BankEmpDetails C1 = new BankEmpDetails();

		C1.setAdress("kurmanpalem");
		C1.setEid("90");
		C1.setName("matta");
		C1.setPnumber("9908681368");
		C1.setSalary("87878");

		return C1;

	}

	@GetMapping("/source")
	public BankEmpDetails getBankEmpsource(@RequestParam("Eid") String Eid, @RequestParam("adress") String adress,
			@RequestParam("salary") String salary, @RequestParam("pnumber") String pnumber,
			@RequestParam("name") String name) {
		BankEmpDetails B1 = new BankEmpDetails(Eid, adress, salary, pnumber, name);

		return B1;

	}

	@GetMapping("/builder")
	public BankEmpDetails getBankEmpbuilder(@RequestParam("Eid") String Eid, @RequestParam("adress") String adress,
			@RequestParam("salary") String salary, @RequestParam("pnumber") String pnumber,
			@RequestParam("name") String name) {
		BankEmpDetails B1 = BankEmpDetails.builder().Eid(Eid).adress(adress).salary(salary).pnumber(pnumber).build();

		return B1;

	}

}
