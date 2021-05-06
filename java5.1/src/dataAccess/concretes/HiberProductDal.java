package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.ProductDal;
import entities.concretes.Product;

public class HiberProductDal implements ProductDal{

	@Override
	public void add(Product product) {
		System.out.println("HiberProductDal ile eklendi . ");
		
	}

	@Override
	public void update() {
		System.out.println("HiberProductDal ile güncellendi . ");
		
	}

	@Override
	public void delete() {
		System.out.println("HiberProductDal ile silindi . ");
		
	}

	@Override
	public Product get(int emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}

