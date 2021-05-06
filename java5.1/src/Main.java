import business.abstracts.ProductService;
import business.concretes.ProductManager;
import dataAccess.concretes.HiberProductDal;
import entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		ProductService productService = new ProductManager(new HiberProductDal());
		Product product = new Product("Yasin@gmail.com","Yasin","Sensoy","123456"); //HiberProductDal ile eklendi . 
		Product product1 = new Product("Yasin@gmail.com","yasin","Sensoy","123456"); //Email adresi kullanýlmýs
		Product product2 = new Product("yasingmail","YASIN","Sensoy","12wr345x6"); //Lütfen e-mail adresinizi doðru girin.
		Product product3 = new Product("Yasinn@gmail.com","nasiy","sensoy","1236545xcxc"); //HiberProductDal ile eklendi . 
		Product product4 = new Product("sensyas@gmail.com","asiny","Sensoy","1256"); //Parola en az 6 karakter olmalidir.

		productService.add(product);
		productService.add(product1);
		productService.add(product2);
		productService.add(product3);
		productService.add(product4);
		
		
		
		productService.logIn("Yasin@gmail.com","123456");
	}

}
