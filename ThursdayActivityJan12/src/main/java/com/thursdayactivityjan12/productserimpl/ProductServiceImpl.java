package com.thursdayactivityjan12.productserimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thursdayactivityjan12.productentity.Product;
import com.thursdayactivityjan12.productrepository.ProductRepository;
import com.thursdayactivityjan12.productservice.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
@Autowired
ProductRepository productrepository;
	@Override
	public Product saveProduct(Product p) {
		// TODO Auto-generated method stub
		return productrepository.save(p);
	}

	@Override
	public void deleteProduct(int id) {
		 productrepository.deleteById(id);
	}

	@Override
	public void updateProduct(Product params, int id) {
	    Product p=productrepository.findById(id).get();
		p.setProductName(params.getProductName());
		p.setProductBrand(params.getProductBrand());
		p.setProductPrice(params.getProductPrice());
		productrepository.save(p);
	}

	@Override
	public Product getProductById(int id) {
		
		return productrepository.findById(id).get();
	}

	public List<Product> getAllProducts() {
		
		return productrepository.findAll();
	}

	

}
