package com.myapp.controller;

import org.springframework.security.access.event.PublicInvocationEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.CollegeDTO;

@RestController

@RequestMapping("v1/College")
public class CollegeController {
	
	@GetMapping("/Collegeid")
		public CollegeDTO getcollege() {
			return new CollegeDTO("1135","pace","hyd","vzg","987456321");
			
	
	}
	
	@GetMapping("/Collegeid/Noargs")
		public CollegeDTO getCollegeNoargs() {
			CollegeDTO clg = CollegeDTO.builder().collegeId("563284").collegeName("giet").collegeLoc("rjy")
					.collegePh("98745625874").build();
			return clg;
	}

	@GetMapping("/Collegeid/Set")
	public CollegeDTO getCollegeSet() {
		CollegeDTO clg = new CollegeDTO();
		 
		clg.setCollegeId("84124");
		clg.setCollegeName("srit");
		clg.setCollegeLoc("vzg");
		clg.setCollegeDistrict("vizag");
		clg.setCollegePh("587498455444");
		return clg;
	}
	
	@GetMapping("/param/set")
	public CollegeDTO getCollegeDTO(@RequestParam("collegeId") String collegeId,
			@RequestParam("collegeName") String collegeName,
			@RequestParam("collegeLoc") String collegeLoc,
			@RequestParam("collegeDistrict") String collegeDistrict,
			@RequestParam("collegePh") String collegePh) {
		CollegeDTO clg = new CollegeDTO();
		clg.setCollegeId(collegeId);
		clg.setCollegeName(collegeName);
		clg.setCollegeLoc(collegeLoc);
		clg.setCollegeDistrict(collegeDistrict);
		clg.setCollegePh(collegePh);
		
		return clg;
		
	}
	
	@GetMapping("/param/args")
	public CollegeDTO getCollege(@RequestParam("collegeId") String collegeId,
			@RequestParam("collegeName") String collegeName,
			@RequestParam("collegeLoc") String collegeLoc,
			@RequestParam("collegeDistrict") String collegeDistrict,
			@RequestParam("collegePh") String collegePh) {
			return new CollegeDTO (collegeId,collegeName,collegeDistrict,collegeLoc,collegePh);
			
	}
	
	@GetMapping("/param/noargs")
	public CollegeDTO getCollegenoargs(@RequestParam("collegeId") String collegeId,
			@RequestParam("collegeName") String collegeName,
			@RequestParam("collegeLoc") String collegeLoc,
			@RequestParam("collegeDistrict") String collegeDistrict,
			@RequestParam("collegePh") String collegePh) {
			CollegeDTO clg = CollegeDTO.builder()
					.collegeId(collegeId)
					.collegeName(collegeName)
					.collegeLoc(collegeLoc)
					.collegeDistrict(collegeDistrict)
					.collegePh(collegePh).build();
			
			return clg;	
	}
	
	@GetMapping("/headers/args")
	public CollegeDTO getheadersargs(@RequestHeader("collegeId") String collegeId,
			@RequestHeader("collegeName") String collegeName,
			@RequestHeader("collageLoc") String collegeLoc,
			@RequestHeader("collegeDistrict") String collegeDistrict,
			@RequestHeader("collegePh") String collegePh) {
		return new CollegeDTO(collegeId,collegeName,collegeDistrict,collegeLoc,collegePh);
		
	}
	
	@GetMapping("/headers/noargs")
	public CollegeDTO getheadersnoargs(@RequestHeader("collegeId") String collegeId,
			@RequestHeader("collegeName") String collegeName,
			@RequestHeader("collageLoc") String collegeLoc,
			@RequestHeader("collegeDistrict") String collegeDistrict,
			@RequestHeader("collegePh") String collegePh) {
		CollegeDTO clg = CollegeDTO.builder().collegeId("collegeId")
				.collegeName(collegeName)
				.collegeLoc(collegeLoc)
				.collegeDistrict(collegeDistrict)
				.collegePh(collegePh).build();
				return clg;
		
	}
	@GetMapping("/headers/set")
	public CollegeDTO getheaderset(@RequestHeader("collegeId") String collegeId,
			@RequestHeader("collegeName") String collegeName,
			@RequestHeader("collageLoc") String collegeLoc,
			@RequestHeader("collegeDistrict") String collegeDistrict,
			@RequestHeader("collegePh") String collegePh) {
		CollegeDTO clg = new CollegeDTO();
		clg.setCollegeId(collegeId);
		clg.setCollegeName(collegeName);
		clg.setCollegeLoc(collegeLoc);
		clg.setCollegeDistrict(collegeDistrict);
		clg.setCollegePh(collegePh);
		return clg;
		
		
	}
}
	
	
	
	
	
