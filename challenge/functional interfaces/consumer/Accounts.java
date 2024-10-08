import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//consumer contain methods forEach(),peek()


class Employee
{
	private int id;
    private String name;
	private int salary;

	
	public Employee(int id ,String name,int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(int String)
	{
		this.name = name;
	}
	
	
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Id: "+getId()+"\n"+"Name: "+getName()+"\n"+"Salary :"+getSalary();
	}
}
	
	
public class Accounts
{
	
	public static void main (String[] args)
	{
		
		List <Employee> employee = new ArrayList<>();
		
		employee.add(new Employee(1,"Mahesh",15000));
		employee.add(new Employee(2,"Farsi",5000));
		employee.add(new Employee(3,"Avinash",7000));
		employee.add(new Employee(4,"Fahad",1000));
		
		
		List<String> thousandAboveSalary = employee.stream()
											.filter(e -> e.getSalary()>1000)
											.peek(System.out::println)
											.map(e -> e.getName())
											.collect(Collectors.toList());
											
											
		System.out.println("Names Of Thousand Above Salary : "+ thousandAboveSalary);
		
											employee.stream()
											.filter(e -> e.getSalary()>1000)
											.forEach(e -> System.out.println(e));
	}	
}	