public class Employee extends Person{
    private String employeeId;
    public Employee(String name, int age,String em){
    super(name, age);
    employeeId = em;
    }
    public String getemployeeId()
   {  
      return employeeId; 
    }
   public void setemployeeId (String em) {
        employeeId = em;
    }
   public void printDetails () {
        System.out.println("----Employee----");
        super.printDetails();
        System.out.println("EmployeeID : "+employeeId);
        
    }
}
