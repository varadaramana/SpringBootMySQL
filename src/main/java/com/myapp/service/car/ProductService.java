package com.myapp.service.car;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.dataaccessobject.ProductRepository;
import com.myapp.datatransferobject.ProductDTO;
import com.myapp.datatransferobject.ProductParent;
import com.myapp.domainobject.ProductDO;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public ProductDTO saveProduct(ProductParent pp) {
		List<ProductDTO> productDTO = pp.getProductParent();
		
		for (ProductDTO pp1 : productDTO) {
			ProductDO ppdo= new ProductDO();
			ppdo.setProductname(pp1.getProductName());
			ppdo.setProductexpdate(pp1.getProductExp());
			ppdo.setProductprice(pp1.getProductPrice());
			ppdo.setProductqty(pp1.getProductQty());
			productRepository.save(ppdo);
			
		}
		return null;	
	}

		public List<ProductDTO> getProduct() {
			List<ProductDTO> list = new LinkedList<ProductDTO>();
			Iterable<ProductDO> productDTO = productRepository.findAll();
			Iterator<ProductDO> list1 = productDTO.iterator();
			
			while (list1.hasNext()) {
				ProductDTO pp11 = new ProductDTO();
				ProductDO pp12 = list1.next();
				pp11.setProductId(pp12.getProductid().toString());
				pp11.setProductName(pp12.getProductname());
				pp11.setProductPrice(pp12.getProductprice());
				pp11.setProductExp(pp12.getProductexpdate());
				pp11.setProductQty(pp12.getProductqty());
				list.add(pp11);
			}
			
			return list;
		}

	
		
		
}
