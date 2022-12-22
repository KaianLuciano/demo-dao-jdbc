package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy"); 
		
		Department dep = new Department(1, "Lindos");
		System.out.println(dep);
		
		Seller sell = new Seller(1, "Kaian", "kaian@gmail.com", formater.parse("12/04/2003"), 2.000, new Department(1, "Jogos"));
		System.out.println(sell);
		
	}

}
