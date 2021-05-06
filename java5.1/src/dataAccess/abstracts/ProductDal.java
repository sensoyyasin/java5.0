package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Product;


public interface ProductDal {
	void add(Product product);
	void update();
	void delete();
	
	Product get(int emailId);
	List<Product> getAll();
	
}


