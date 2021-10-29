package com.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.ProductDTO;
import com.myapp.datatransferobject.ProductParent;
import com.myapp.service.car.ProductService;

@RestController
@RequestMapping("/p1/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/ppost")
	public ProductDTO getProduct(@RequestBody ProductParent pp1) {
		ProductDTO dt = productService.saveProduct(pp1);
		return dt;
		
	}
	
	@GetMapping("/pget")
	public List<ProductDTO> getproductdto() {
		List<ProductDTO> dto1 = productService.getProduct();
		return dto1;
		
	}

}
