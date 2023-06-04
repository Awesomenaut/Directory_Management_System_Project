public class Employee extends Person{
	private int empID;
	private double baseSalary;

	private String empType;


	public Employee(String last, String first, String middle, int id, double sal, String Type) {
		super(last, first, middle);
		empID = id;
		baseSalary = sal;
		empType = Type;
	}

	public int getID()
	{
		return empID;

	}

	public double getBaseSalary(){
		return baseSalary;
	}

	public String getEmpType(){
		return empType;
	}

}
