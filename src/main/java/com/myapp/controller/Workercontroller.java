package com.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.PatientDTO;
import com.myapp.datatransferobject.WorkerDTO;
import com.myapp.service.car.Workerservice;

@RestController
@RequestMapping("/W1/Worker")
public class Workercontroller {

	@Autowired
	private Workerservice workerService;

	@GetMapping("/Workerid/Allargs")
	public WorkerDTO getWorkerallargs() {
		return new WorkerDTO( 1, "ganesh", "attada", "9133010525", "mattagani@gmail.com", "20000");
	}

	@PostMapping("/Workerss/save")
	public String SaveWorker(@RequestBody WorkerDTO dto) {
		workerService.saveWorObject(dto);
		return "SAVED SUCCESSFULLY!!";

	}
}
