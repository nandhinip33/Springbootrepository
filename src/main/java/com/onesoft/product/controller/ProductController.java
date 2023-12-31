package com.onesoft.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onesoft.product.entity.Product;
import com.onesoft.product.service.ProductService;

@RestController
@RequestMapping(value="/admin")
public class ProductController {
	@Autowired
	ProductService ps;
	
	@PostMapping(value="/post1")
	public String setPost1(@RequestBody Product p) {
		return ps.setPost1(p);
	}
	
	@PostMapping(value="/post2")
	public String setPost2(@RequestBody List <Product> p) {
		return ps.setPost2(p);
	}
	
	@PutMapping(value="/update")
	public String setUpdate(@RequestBody Product p) {
		return ps.setUpdate(p);
	}
	
	@GetMapping(value="/get1/{id}")
	public Product getData(@PathVariable int id) {
		return ps.getData(id);
	}
	
	@GetMapping(value="/get2")
	public List<Product> getData2() {
		return ps.getData2();
	}
	
	@DeleteMapping(value="/delete/{id}")
	public String getDelete(@PathVariable int id) {
		return ps.getDelete(id);
	}
	
	@GetMapping(value="/getAll")
	public List<Product> getAll(){
		return ps.getAll();
	}
	
	
	

}
