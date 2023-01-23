package com.thursdayactivityjan12.productservice;

import com.thursdayactivityjan12.productentity.Product;


public interface ProductService {
	Product saveProduct(Product p);         //crud operation
	void deleteProduct(int id);
	void updateProduct(Product p,int id);
	Product getProductById(int id);
	
}
