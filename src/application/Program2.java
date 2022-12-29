package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		//System.out.println("===== TEST 1: Department Insert =====\n");
		//departmentDao.insert(new Department(7, "Computação"));
		
		System.out.println("===== TEST 2: Department Update =====\n");
		departmentDao.update(new Department(6, "Games"));
		
		System.out.println("===== TEST 3: Department Delete =====\n");
		departmentDao.deletById(10);
		
		System.out.println("===== TEST 4: Department FindById =====\n");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("===== TEST 5: Department FindById =====\n");
		List<Department> dep2 = departmentDao.findAll();
		dep2.forEach(System.out::println);
	}
}
