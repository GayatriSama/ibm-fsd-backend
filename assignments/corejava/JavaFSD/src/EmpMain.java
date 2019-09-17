

public class EmpMain {
private static java.util.Scanner sc;

public static void main(String[] abc) {
	Employee_Service emp= new Employee_Service();
	while(true) {
		System.out.println("1. Add Employee\n 2.View Employees \n 3.Update Employee\n 4.View Employee\n 5.Delete Employee");
		System.out.println("Enyer your choice: ");
		sc = new java.util.Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: emp.add();
			break;
		case 2: emp.viewAll();
			break;
		case 3: emp.update();
			break;
		case 4: emp.viewEmp();
			break;
		case 5: emp.delete();
			break;
		case 6: System.exit(0);
			break;
		default: System.out.println("Invalid choice.");
					break;
		
		}	
	}
}
}


