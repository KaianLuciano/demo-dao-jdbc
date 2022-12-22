package application;

import java.text.ParseException;
import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
			
		Department department = new Department(1, "Lindos");

		Seller seller = new Seller(1, "Kaian", "kaian@gmail.com", new Date(), 2.000, department);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
		
	}

}
