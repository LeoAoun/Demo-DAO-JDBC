package application;

import java.util.Date;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main (String[] args) {
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(1, "Leo", "leonardoaoundev@gmail.com", new Date(), 300.0, obj);
		
		SellerDAO sellerDAO = DAOFactory.createSellerDAO();
		
		System.out.println(seller);
	
	
	}
}
