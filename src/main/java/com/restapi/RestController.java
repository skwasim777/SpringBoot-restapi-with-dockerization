package com.restapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@PostMapping("/product")
	public String saveProduct(@RequestBody Product p) {
		System.out.println(p);
		return "Product Saved";
	}

	@GetMapping("/product/{id}")
	public Product getPrduct(@PathVariable Integer id) {
		Product p = null;
		if (id == 101) {
			p = new Product(101, "Mouse", 500.00);
		} else if (id == 102) {
			p = new Product(102, "HD", 3500.00);
		}
		return p;

	}

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		Product p1 = new Product(101, "Mouse", 500.00);
		Product p2 = new Product(102, "HD", 3500.00);
		List<Product> products = Arrays.asList(p1, p2);
		return products;
	}
}
