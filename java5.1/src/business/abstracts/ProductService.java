package business.abstracts;

import java.util.List; 

import entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	void logIn(String emailId,String passwordId);
	List <Product> getAll();
}
