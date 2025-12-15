package banking.model;
class Customer{
    private int customerId;
    private String name;
    private String email;
    private String phoneNumber;

    public Customer(int customerId, String name,String email, String phoneNumber){
        this.customerId = customerId;
        this.name= name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void displayCustomerDetails(){
     System.out.println("Customer ID     : "+ customerId);
     System.out.println("Customer name   : "+ name);
     System.out.println("Customer email  : "+ email);
     System.out.println("Customer Phnnum : "+ phoneNumber);

    }

    public static void main(String[] args) {
        
        Customer c1 = new Customer(101,"divya","diva@gmail.com","1234567890");
        Customer c2 = new Customer(103,"ramya","rama@gmail.com","0987654321");
        Customer c3 = new Customer(107,"sathya","satha@gmail.com","9863425643");
         
        c1.setPhoneNumber("9999900887");
        c1.displayCustomerDetails();
        c2.displayCustomerDetails();
        c3.displayCustomerDetails();

    }

    
}