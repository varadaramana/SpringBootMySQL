package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductDTO {
	
	private String productId;
	private String productName;
	private String productExp;
	private String productPrice;
	private String productQty;
	
	
}
