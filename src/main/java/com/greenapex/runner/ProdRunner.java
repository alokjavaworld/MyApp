package com.greenapex.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.greenapex.model.Product;
import com.greenapex.repo.IProductRepo;

@Component
public class ProdRunner implements CommandLineRunner {
	
	
	@Autowired
	 private IProductRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
//		 repo.save(new Product("Sam", "Poco"	, 24000.0));
//		 repo.save(new Product("Len", "lapton"	, 38000.0));
//		 repo.save(new Product("Hp", "Printer"	, 10000.0));
//		 repo.save(new Product("Mi", "redmi"	, 18000.0));
		
		List<Product> list=repo.getAllProducts("sam", 19000.0);
		System.out.println();
		System.out.println(list);
		
	}

}
