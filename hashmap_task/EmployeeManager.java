import java.util.*;

public class EmployeeManager{

        Map <Integer, Employee> employee = new HashMap<>();

        public void addEmployees(Employee emp){
                employee.put(emp.getEmpId(), emp);
             }
	public void displayAllEmployees(){
		for(Employee details : employee.values()){
			System.out.println(" ID: "+ details.getEmpId() +" Name: "+details.getName()+" Gender: "+details.getGender()+" Salary: "+ details.getSalary());
		}
	}
	ArrayList <Double> salaries = new ArrayList<>();
          
       	public void salaryList(){
	   for(Employee sal: employee.values()){
		   salaries.add(sal.getSalary());
	   }
	   System.out.println(salaries);
	   }	
	public void getHighestSalary(){
		salaryList();
		double highestSalary = Collections.max(salaries);
		System.out.println("Highest Salary: "+ highestSalary);
	}
        public void getLowestSalary(){
                salaryList();
                double lowestSalary = Collections.min(salaries);
                System.out.println("Lowest Salary: "+ lowestSalary);
        }
	 public void getAverageSalary(){
                salaryList();
		double sum=0;
		for(double sal : salaries){
			sum+=sal;
		}
                double averageSalary = sum/salaries.size();
                System.out.println("Average Salary: "+ averageSalary);
        }
	public void getHighest(){
               Employee highestSal=null;
               for(Map.Entry<Integer,Employee> emp : employee.entrySet()){
               Employee e=emp.getValue();
               if(highestSal == null || e.getSalary() > highestSal.getSalary()){
               highestSal=e;
	       }
	       }
	       System.out.println("Name: "+ highestSal.getName()+ "  Employment_id: "+highestSal.getEmpId()+ "  Highest Salary: "+ highestSal.getSalary());
	}

}
