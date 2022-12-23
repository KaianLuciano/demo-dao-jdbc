package application;

import java.text.ParseException;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===== TEST 1: Seller findbyID =====\n");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n===== TEST 2: Seller findbyID =====\n");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		list.forEach(System.out::println);
		
		System.out.println("\n===== TEST 3: Seller findAll =====\n");
		list = sellerDao.findAll();
		
		list.forEach(System.out::println);
	}

}
