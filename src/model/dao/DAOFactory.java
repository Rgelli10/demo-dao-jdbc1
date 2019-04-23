package model.dao;

import db.DB;
import model.dao.impl.DepartmentDAOJDBC;
import model.dao.impl.SellerDAOJDBC;

public class DAOFactory {
	
	public static SellerDAO CreateSellerDAO() {
		return new SellerDAOJDBC(DB.getConnection());
	}
	
	public static DepartamentDAO CreateDepartmentDAO() {
		return new DepartmentDAOJDBC(DB.getConnection());
	}

}
