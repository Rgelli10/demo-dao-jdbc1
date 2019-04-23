package application;

import java.util.List;

import javax.swing.JOptionPane;

import model.dao.DAOFactory;
import model.dao.DepartamentDAO;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DepartamentDAO depDao = DAOFactory.CreateDepartmentDAO();

		System.out.println("=== Teste 1: findById ===");
		
		Department dep = depDao.findById(1);
		System.out.println(dep);
		
		

		System.out.println("\n === Teste 2: findAll ===");

		List <Department> list = depDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		


		System.out.println("\n === Teste 3: Insert ===");
		
		int i = JOptionPane.showConfirmDialog(null, "You want like insert more line? ");
		while(i == 0) {
		Department newDepDao = new Department(null, JOptionPane.showInputDialog("Enter new department: "));
		depDao.insert(newDepDao);
		System.out.println("Inserted! New id = " + newDepDao.getId());
		i = JOptionPane.showConfirmDialog(null, "Insert again? ");
		}
		
		
	
		System.out.println("\n === Teste 4: Update ===");
		
		Department dep2 = depDao.findById(Integer.parseInt(JOptionPane.showInputDialog("Enter id for updated")));
		dep2.setName(JOptionPane.showInputDialog("Enter new department: "));
		depDao.update(dep2);
		System.out.println("Update completed");
		
		

		System.out.println("\n === Teste 5: Delete ===");
		
		int e = JOptionPane.showConfirmDialog(null, "You like delete for id? ");
		while(e == 0) {
			int id = Integer.parseInt(JOptionPane.showInputDialog("Enter id for delete test: "));
			depDao.deleteById(id);
			System.out.println("Delete Completed!");
			e = JOptionPane.showConfirmDialog(null, "Delete again? ");
		}
		System.out.println("Bye!");
	}

}
