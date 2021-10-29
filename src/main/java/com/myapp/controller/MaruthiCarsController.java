package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.MaruthiCarsDTO;

@RestController
@RequestMapping("/c1/car")
 
public class MaruthiCarsController {

	@GetMapping("/cardata")
	public MaruthiCarsDTO getMaruthiCarsDTO(@RequestParam() String name1, @RequestParam() String model,
			@RequestParam() String colour, @RequestParam() String fuel,
			@RequestParam() String price) {
		MaruthiCarsDTO mcdto = new MaruthiCarsDTO();
		mcdto.setName(name1);
		mcdto.setModel(model);
		mcdto.setColour(colour);
		mcdto.setFuel(fuel);
		mcdto.setPrice(price);
		return mcdto;
	}

	@GetMapping("/cardataheaders")
	public MaruthiCarsDTO getMaruthiCarsheaders(@RequestParam("name") String name, @RequestParam("model") String model,
			@RequestHeader("colour") String colour, @RequestHeader("fuel") String fuel,
			@RequestHeader("price") String price) {
		MaruthiCarsDTO mcdto = new MaruthiCarsDTO();
		mcdto.setName(name);
		mcdto.setModel(model);
		mcdto.setColour(colour);
		mcdto.setFuel(fuel);
		mcdto.setPrice(price);
		return mcdto;

	}

}
