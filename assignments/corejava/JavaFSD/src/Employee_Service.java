import java.util.ArrayList;

public class Employee_Service {

	ArrayList<Employee_details> employeeList = new ArrayList<Employee_details>();
	java.util.Scanner sc= new java.util.Scanner(System.in);
	public void add() {
		System.out.println("Enter Employee id: ");
		int id = sc.nextInt();
				System.out.println("Enter name: ");
				String name= sc.next();
				System.out.println("Enter designation: ");
				String des = sc.next();
				System.out.println("Enter salary: ");
				int sal = sc.nextInt();
				Employee_details employee = new Employee_details(id,name,des,sal);
				employeeList.add(employee);
				System.out.println("Employee is successfully added");
	}

	public void viewAll() {
		// TODO Auto-generated method stub
		
		for(Employee_details e : employeeList)
		{
			System.out.println("ID: "+e.getId()+" Name: "+e.getName()+" Designation: "+e.getDes()+" Salary: "+e.getSal());
			
		}
	}
	public void update() {
		// TODO Auto-generated method stub
		Employee_details echange = null;
		System.out.println("Enter ID of the employee to be updated: ");
		int id = sc.nextInt();
		for(Employee_details e : employeeList) {
			if(id == e.getId())
			{
				 echange = e ;
				 System.out.println("1.Update name\n2.Update designation\n3.Update salary\n");
					System.out.println("Enter choice: ");
					int ch = sc.nextInt();
					switch(ch)
					{
					case 1: System.out.println("Enter name: ");
							String cname = sc.next();
							echange.setName(cname);
						break;
					case 2: System.out.println("Enter designation: ");
							String cdes = sc.next();
							echange.setDes(cdes);
						break;
					case 3: System.out.println("Enter salary: ");
							int csal = sc.nextInt();
							echange.setSal(csal);
						break;
					default: System.out.println("Invalid choice");
						break;
					}
					System.out.println("Employee is successfully deleted");
					break;
				
			}
			else
			{
				System.out.println("Employee doesn't exist. Cannot update.");
				break;
			
			}
		}
		
		
	}

	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Enter ID of the employee to be deleted: ");
		int id = sc.nextInt();
		for(Employee_details e : employeeList) {
			if(id == e.getId())
			{
				employeeList.remove(e);
				break;
				
			}
		}
		
		
	}

	public void viewEmp() {
		// TODO Auto-generated method stub
		System.out.println("Enter ID of the employee to be displayed: ");
		int id = sc.nextInt();
		for(Employee_details e : employeeList) {
			if(id == e.getId())
			{
				System.out.println("ID: \n"+e.getId()+" Name: \n"+e.getName()+" Designation: \n"+e.getDes()+" Salary:\n "+e.getSal());
				break;
				
			}
			else
			{
				System.out.println("Employee doesn't exist.");
				break;
			}
		}
		
		
	}
}
		

	