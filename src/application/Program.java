package application;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {		
		
		SellerDAO sellerDao = DAOFactory.CreateSellerDAO();
		
		System.out.println("=== Teste 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n === Teste 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj: list) {
			System.out.println(obj);
		}
			System.out.println("\n === Teste 3: seller findAll ===");
			
			list = sellerDao.findAll();
			for(Seller obj: list) {
				System.out.println(obj);
			}
			
				System.out.println("\n === Teste 4: seller Insert ===");
				Seller newSeller = new Seller(null, "Greg", "greg@gmail", new Date(), 4000.0, department);
				sellerDao.insert(newSeller);
				System.out.println("Inserted! New id = " + newSeller.getId());
				
	
		System.out.println("\n === Teste 5: seller Update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n === Teste 6: seller Delete ===");
		int id = Integer.parseInt(JOptionPane.showInputDialog("Enter id for delete test: "));
		sellerDao.deleteById(id);
		System.out.println("Delete Completed!");
}

}
