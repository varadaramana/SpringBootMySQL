package com.myapp.datatransferobject;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductParent {
	
	private List<ProductDTO> productParent;
	

}
