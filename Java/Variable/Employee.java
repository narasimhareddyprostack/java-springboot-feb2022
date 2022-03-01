class Employee{
    int salary;
	int emp_Id = 101;
	String emp_Name= "Rahul Gandhi";
	static  String Company_Name="TCS";
public static void main(String[] args){

    Employee e1 = new Employee();
	
	System.out.println(e1.salary);
	System.out.println(e1.emp_Id);
	System.out.println(e1.emp_Name);
	System.out.println(e1.Company_Name);
	
	System.out.println(Company_Name);
	
	
	}
}