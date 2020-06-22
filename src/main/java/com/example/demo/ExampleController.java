package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.client.codegen.rest.api.ProductControllerApi;
import com.swagger.client.codegen.rest.model.Product;

@RequestMapping("vi/api/example")
@RestController()
public class ExampleController {
	
	@Autowired
	public ProductControllerApi productControllerApi;
	
	@GetMapping
	public Object getProductApi(@RequestParam("id") Integer id) {
		Product product =  productControllerApi.showProductUsingGET(id);
		return product;
	}
}
