package com.thursdayactivityjan12.productcontoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thursdayactivityjan12.productentity.Product;
import com.thursdayactivityjan12.productserimpl.ProductServiceImpl;

@RestController
public class ProductController {
	@Autowired
	ProductServiceImpl productserviceimpl;
	
	@PostMapping("/product")
	int insertProduct(@RequestBody Product product)    
	{
		productserviceimpl.saveProduct(product);
		return product.getProductId();
	}

	@DeleteMapping("/product/{productid}")
	void delproduct(@PathVariable("productid")int productid)
	{
		productserviceimpl.deleteProduct(productid);
	}

	@GetMapping("/product/{productid}")
    Product getProduct(@PathVariable("productid")int productid)
	{
		return productserviceimpl.getProductById(productid);
	}

	@PutMapping("/product/{productid}")
	void update(@RequestBody Product product,@PathVariable("productid")int productid)
	{
		productserviceimpl.updateProduct(product, productid);
	}

	@GetMapping("/products")
	public List<Product>getProducts()
	{
		return productserviceimpl.getAllProducts();
	}

}
