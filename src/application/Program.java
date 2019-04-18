package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {		
		
		SellerDAO sellerDao = DAOFactory.CreateSellerDAO();
		
		Seller seller = sellerDao.findById(3);
		
		
		System.out.println("=== Teste 1: seller findById ===");
		System.out.println(seller);
		
		
	}

}
