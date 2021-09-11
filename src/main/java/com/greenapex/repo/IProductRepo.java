package com.greenapex.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greenapex.model.Product;

public interface IProductRepo  extends JpaRepository<Product, Integer>{
	
	
	@Query("select p from Product p where p.vendorCode=:a or p.prodCost>:b")
	List<Product> getAllProducts(String a, Double b);

	
	
	
	
	
	
	
	
}
