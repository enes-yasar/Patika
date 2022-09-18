
public class Employee {
	String firtName;
	String lastName;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String firstName, String lastName, double salary, int workHours, int hireYear) {
		
		this.firtName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	double tax(double salary) {
		
		if (salary > 1000) {
			double tax = (salary * 3) / 100; 
			return tax;
		}
		else {
			return 0;
		}
		
	}
	double bonus(int workHourse) {
		double prim = 0;
		if (workHours > 40) {
			prim = (workHours - 40) * 30;
			return prim;
		}
		else {
			return 0;
		}
		
	}
	int raiseSalary() {
		double zam;
		if (2021 - hireYear > 10) {
			zam = (salary * 5) / 100;
			return (int) zam;
		}
		 if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
			zam = (salary * 10) / 100;
			return (int) zam;
			
		}
		 if (2021 - hireYear > 19) {
			zam = ( salary * 15) / 100;
			return (int) zam;
		}
		else {
			return 0;
		}
	}
	public void toString1() {
		double genelMaas;
		System.out.println("Calisanin adi: "+ this.firtName);
		System.out.println("Calisanin soyadi: " + this.lastName);
		System.out.println("Calisanin maasi: " + this.salary);
		System.out.println("Calisanin haftalik maasi: " + this.workHours);
		System.out.println("Calisanin ise girdigi yil: " + this.hireYear);
		System.out.println("Vergi: " + tax(salary));
		System.out.println("Bonus: " + bonus(workHours));
		System.out.println("Alinan zam: " + raiseSalary());
		genelMaas = this.salary + bonus(workHours) + raiseSalary() - tax(salary);
		System.out.println("Toplam genel maas: " + genelMaas);
		System.out.println("================================");
	}
}
