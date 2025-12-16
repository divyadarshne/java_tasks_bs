
import java.util.*;

public class Employee{
	private int emp_id;
	private String name;
	private String gender;
	private double salary;

	public Employee(int emp_id, String name, String gender, double salary){
		this.emp_id = emp_id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	public int getEmpId(){
		return emp_id;
	}
	public void setEmpId(int emp_id){
		this.emp_id= emp_id;
	}
	public String getName(){
                return name;
        }
        public void setName(String name){
                this.name= name;
        }
	public String getGender(){
                return gender;
        }
	public void setGender(String gender){
                this.gender=gender;
        }
	public double getSalary(){
                return salary;
        }
        public void setSalary(double salary){
                this.salary = salary;
        }
        
}

