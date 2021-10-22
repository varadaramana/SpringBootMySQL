package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ShoppingmallDTO {

	private String shoppingmallId;
	private String shoppingmallName;
	private String shoppingmalPlace;
	private String shoppingmallphone;
	private String shoppingmallManager;
	
	
}
