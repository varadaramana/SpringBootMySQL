package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.HospitalDTO;
import com.myapp.datatransferobject.ShoppingmallDTO;

@RestController
@RequestMapping("/G1/shoppingmall")

public class Shoppingmallcontroller {
	
	@GetMapping("/shoppingmalldata/set")
	public ShoppingmallDTO getshoppingmallDTO(@RequestParam("shoppingmallId")String shoppingmallId,
			@RequestParam("shoppingmallName")String shoppingmallname, 
			@RequestParam("shoppingmallPlace")String shoppingmallplace,
			@RequestParam("shoppingmallPhone")String shoppingmallphone,
			@RequestParam("shoppingmallManager")String shoppingmallmanager) {
		
		ShoppingmallDTO sm = new ShoppingmallDTO();
		sm.setShoppingmallId(shoppingmallId);
		sm.setShoppingmallName(shoppingmallname);
		sm.setShoppingmalPlace(shoppingmallplace);
		sm.setShoppingmallphone(shoppingmallphone);
		sm.setShoppingmallManager(shoppingmallmanager);
			return sm;
}
	@GetMapping("/shoppingmalldata/args")
	public ShoppingmallDTO getshoppingmallargs(@RequestParam("shoppingmallId")String shoppingmallId,
			@RequestParam("shoppingmallName")String shoppingmallname, 
			@RequestParam("shoppingmallPlace")String shoppingmallplace,
			@RequestParam("shoppingmallPhone")String shoppingmallphone,
			@RequestParam("shoppingmallManager")String shoppingmallmanager) {
		return new ShoppingmallDTO(shoppingmallId,shoppingmallname,shoppingmallplace,shoppingmallphone,
				shoppingmallmanager);
		
	}
	@GetMapping("/noargs")
	public  ShoppingmallDTO getshoppingmallnoargs() {
		 ShoppingmallDTO sm = ShoppingmallDTO.builder().shoppingmallId("123456").shoppingmallName("CMR").
				 shoppingmalPlace("vizag").shoppingmallphone("1234569871").shoppingmallManager("venkey").build();
	return sm;							
}
	@GetMapping("/shoppingmalldata/H/set")
	public ShoppingmallDTO getshoppingmallHDTO(@RequestHeader("shoppingmallId")String shoppingmallId,
			@RequestHeader("shoppingmallName")String shoppingmallname, 
			@RequestHeader("shoppingmallPlace")String shoppingmallplace,
			@RequestHeader("shoppingmallPhone")String shoppingmallphone,
			@RequestHeader("shoppingmallManager")String shoppingmallmanager) {
		
		ShoppingmallDTO sm = new ShoppingmallDTO();
		sm.setShoppingmallId(shoppingmallId);
		sm.setShoppingmallName(shoppingmallname);
		sm.setShoppingmalPlace(shoppingmallplace);
		sm.setShoppingmallphone(shoppingmallphone);
		sm.setShoppingmallManager(shoppingmallmanager);
			return sm;
}
	@GetMapping("/shoppingmalldata/H/args")
	public ShoppingmallDTO getshoppingmallhargs(@RequestHeader("shoppingmallId")String shoppingmallId,
			@RequestHeader("shoppingmallName")String shoppingmallname, 
			@RequestHeader("shoppingmallPlace")String shoppingmallplace,
			@RequestHeader("shoppingmallPhone")String shoppingmallphone,
			@RequestHeader("shoppingmallManager")String shoppingmallmanager) {
		return new ShoppingmallDTO(shoppingmallId,shoppingmallname,shoppingmallplace,shoppingmallphone,
				shoppingmallmanager);
		
	}
	@GetMapping("/H/noargs")
	public  ShoppingmallDTO getshoppingmallhnoargs() {
		 ShoppingmallDTO sm = ShoppingmallDTO.builder().shoppingmallId("123456").shoppingmallName("CMR").
				 shoppingmalPlace("vizag").shoppingmallphone("1234569871").shoppingmallManager("venkey").build();
	return sm;		
}
}	
