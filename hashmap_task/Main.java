
import java.util.*;

public class Main{
	public static void main(String [] args){
		Employee emp1 = new Employee(1,"Divyadarshne.M","Female",3000);
		Employee emp2 = new Employee(2,"Raguram","Male",5000);
		Employee emp3 = new Employee(3,"DhanaVaradhan.M","Male",6000);

		EmployeeManager employees =new EmployeeManager();

		employees.addEmployees(emp1);
		employees.addEmployees(emp2);
		employees.addEmployees(emp3);

		employees.displayAllEmployees();
		employees.salaryList();
		employees.getHighest();

	}
}
		 


