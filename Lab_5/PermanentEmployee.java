public class PermanentEmployee extends Employee{
    private int salary;
    public PermanentEmployee(String name, int age,String em,int salary){
    super(name, age,em);
    this.salary = salary;
    }
    public int getPersalary()
    {  
      return this.salary; 
    }
   public void setPersalary(int salary) 
   {
        this.salary = salary;
    }
   public void printDetails () {
        System.out.println("Permanent Employee");
        super.printDetails();
        System.out.println("Salary : " +salary);
    }
}