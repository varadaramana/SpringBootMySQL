package com.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.VoterDTO;
import com.myapp.service.car.VoterService;

@RestController
@RequestMapping("/v1/voter")

public class VoterController {
	
	@Autowired
	private VoterService voterService;
	
	@GetMapping("/voterId")
	public VoterDTO getVoter() {
		return new VoterDTO("6546542154","kiran","vijayawada","351654835");
		
	}
	@PostMapping("voter1/save")
	public String saveVoter(@RequestBody VoterDTO dto) {
		voterService.saveVoterObject(dto);
		return "SAVED SUCCESSFULLY!!";
		
	}

}
