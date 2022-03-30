package langpack.Obj;

public class Employee {
	int eid;
	String ename;
	Employee(int id, String name){
		this.eid=id;
		this.ename=name;
	}

	public static void main(String[] args) {
		Employee e1= new Employee(101,"Rahul");
		Employee e2= new Employee(102,"Rahul");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
	}

}

//Object class - equals method is - ref comparision