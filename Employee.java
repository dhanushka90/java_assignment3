package payroll;

public class Employee {
	// class variables or properties or attribute
	private String firstName;
	private String lastName;
	private int salary;
	private int bonus;
	private int age;
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("hey age is ot negative .. i will consider zero");
			this.age = 0;
		}
		
	}

	public int getTotalEarnings() {
		return (this.salary + this.bonus - this.getTaxes());
	}
	
	public int getBirthYear() {
		return (2022 - this.age);
	}
	
	private int getTaxes() {
		return (100);//Assuming tax is 100 for every employee
	}
	
	
}
