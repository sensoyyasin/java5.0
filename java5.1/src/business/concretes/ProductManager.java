package business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import business.abstracts.ProductService;
import core.LoggerService;
import dataAccess.abstracts.ProductDal;
import entities.concretes.Product;


public class ProductManager implements ProductService{

	private ProductDal productDal;
	private LoggerService loggerService;
	private ArrayList<String> eMailList = new ArrayList<String>();
	
	public static boolean isEmailValid(String emailId) {
	    final Pattern EMAIL_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	    return EMAIL_REGEX.matcher(emailId).find();
	}
	
	public static boolean isEmailValidOnClick() {
		return true;
	}

	public ProductManager(ProductDal productDal) {
		this.productDal = productDal;
	}
	
	@Override
	public void add(Product product) {
		
		if (eMailList.contains(product.getEmailId()) ) {
			System.out.println("Email adresi kullanýlmýs");
			return;
		}
		
		if (product.getPasswordId().length()<5) {
			System.out.println("Parola en az 6 karakter olmalidir.");
			return;
		}
		
		
		if ((product.getName().length())<2 && (product.getSirName()).length()<2) {
			System.out.println("isim ve soy isimin uzunluðu 2 den küçük olamaz.");
			return;
		}
		
		if (isEmailValid(product.getEmailId()) != true) {
			System.out.println("Lütfen e-mail adresinizi doðru girin.");;
			return;
		}
		
		if (isEmailValidOnClick() != true) {
			System.out.println("e-mail adresinizi doðrulayin."); 
			return;
		}else {
			eMailList.add(product.getEmailId());
		}
		
	
	
	productDal.add(product);
	
}


	@Override
	public void logIn(String emailId, String passwordId) {
		if (eMailList.contains(emailId)) {
			System.out.println("Tebrikler!! Giris basarili "+ emailId);
		}
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
