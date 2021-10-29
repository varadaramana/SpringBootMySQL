package com.myapp.domainobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "product")
@Data

public class ProductDO {
	
	@Id
	@GeneratedValue(generator = "HIBERNATE_SEQUENCE")
	@Column(name = "product_id")
	private Long productid;
	
	@Column(name = "product_name")
	private String productname;
	
	@Column(name = "product_expdate")
	private String productexpdate;
	
	@Column(name = "product_price")
	private String productprice;
	
	@Column(name = "product_qty")
	private String productqty;
	
	
	
	 
	
	

}
