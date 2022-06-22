import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Employee1{
	int id;
	String name;
	String department;
	int salary;
	public Employee1(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
}
class IDComparator implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		if(o1.id == o2.id) {
			return 0;
		}
		else if(o1.id<o2.id) {
			return 1;
		}else {
			return -1;
		}
	}
	
}
class NameComparator implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
class DepComparator implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		return o1.getDepartment().compareTo(o2.getDepartment());
	}
	
}
class SalaryComparator implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		if(o1.salary == o2.salary) {
			return 0;
		}
		else if(o1.salary<o2.salary) {
			return 1;
		}else {
			return -1;
		}
	}
	
}
public class collectionAss3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice");
		String choice=scan.next();
		switch(choice){
		
		case "A":
			TreeSet<Employee1> t1=new TreeSet<Employee1>(new IDComparator());
			t1.add(new Employee1(10,"Ranji","Sales",3000));
			t1.add(new Employee1(19,"Ramesh","HR",300));
			t1.add(new Employee1(14,"Poorni","Admin",900));
			t1.add(new Employee1(13,"Pooja","IT",7000));
			t1.add(new Employee1(12,"Ram","Digital",8900));
			System.out.println(t1);
			break;
		case "B":TreeSet<Employee1> t2=new TreeSet<Employee1>(new NameComparator());
		t2.add(new Employee1(10,"Ranji","Sales",3000));
		t2.add(new Employee1(19,"Ramesh","HR",300));
		t2.add(new Employee1(14,"Poorni","Admin",900));
		t2.add(new Employee1(13,"Pooja","IT",7000));
		t2.add(new Employee1(12,"Ram","Digital",8900));
		System.out.println(t2);
		break;
		
		case "C":TreeSet<Employee1> t3=new TreeSet<Employee1>(new DepComparator());
		t3.add(new Employee1(10,"Ranji","Sales",3000));
		t3.add(new Employee1(19,"Ramesh","HR",300));
		t3.add(new Employee1(14,"Poorni","Admin",900));
		t3.add(new Employee1(13,"Pooja","IT",7000));
		t3.add(new Employee1(12,"Ram","Digital",8900));
		System.out.println(t3);
		break;
		case "D":TreeSet<Employee1> t4=new TreeSet<Employee1>(new SalaryComparator());
		t4.add(new Employee1(10,"Ranji","Sales",3000));
		t4.add(new Employee1(19,"Ramesh","HR",300));
		t4.add(new Employee1(14,"Poorni","Admin",900));
		t4.add(new Employee1(13,"Pooja","IT",7000));
		t4.add(new Employee1(12,"Ram","Digital",8900));
		System.out.println(t4);
		default:break;
			
			
		}
		

	}

}
