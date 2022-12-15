package payroll;

import java.util.ArrayList;
import java.util.Scanner;

public class PayrollSys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> emps = new ArrayList<Employee>();
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Enter new Employee ? (Y or N)");
		String cont = kbd.next();
		
		// data entry
		while (cont.equals("Y")) {
			
			
			
			Employee emp = new Employee();

			
			System.out.print("First Name: ");
			//emp.firstName = kbd.next(); // "Joe";
			String tempFN = kbd.next();
			emp.setFirstName(tempFN);
			
			System.out.print("Last Name: ");
			emp.setLastName(kbd.next()); //"Doe";
			
			System.out.print("Age: ");
			emp.setAge(kbd.nextInt());
			
			System.out.print("Salary: ");
			emp.setSalary(kbd.nextInt());   // 30000;
			
			System.out.print("Bonus: ");
			emp.setBonus(kbd.nextInt()); // 3000;
			emps.add(emp);
			
			System.out.println("----------------------------");
			System.out.println("Enter new Employee ? (Y or N)");
			cont = kbd.next();

			
		}
		// add employee to the array
		//emps.add(emp1);
		
//		// create employee number 2
//		Employee emp2 = new Employee();
//		emp2.firstName = "Jane";
//		emp2.lastName = "Doe";
//		emp2.salary = 35000;
//		emp2.bonus = 3500;
//		emp2.getTotalEarnings();
		
//		emps.add(emp2);
		
		// using emp1 and emp2
		/*
		System.out.println(emp1.firstName);
		System.out.println(emp1.lastName);
		System.out.println(emp1.salary);
		System.out.println(emp1.bonus);
		System.out.println(emp1.getTotalEarnings());
		System.out.println("----------------");
		System.out.println(emp2.firstName);
		System.out.println(emp2.lastName);
		System.out.println(emp2.salary);
		System.out.println(emp2.bonus);
		System.out.println(emp2.getTotalEarnings());
		*/
		
		//  using the array to display data 
		
		int totalPayroll = 0;
		
		for (int i=0; i<emps.size(); i++) {
			
			System.out.println("Full Name: " + emps.get(i).getFirstName() + " " + emps.get(i).getLastName());
			System.out.println("Age: " + emps.get(i).getAge());
			System.out.println("Birth Year: " + emps.get(i).getBirthYear());
			System.out.println("Salary: " + emps.get(i).getSalary());
			System.out.println("Bonus: " + emps.get(i).getBonus());
			
			totalPayroll = totalPayroll + emps.get(i).getTotalEarnings();
			
			System.out.println("Total Earnings After Tax: " + emps.get(i).getTotalEarnings());
			
			
			System.out.println("----------------------------");
			
		} // end loop
		System.out.println("Total Payroll without tax: " + totalPayroll);
		
	} // end of main	
} // end of class
