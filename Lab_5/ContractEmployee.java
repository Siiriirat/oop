public class ContractEmployee extends Employee{
    private int payment;
    public ContractEmployee(String name, int age,String em,int pay){
    super(name, age,em);
    payment = pay;
    }
    public int getConsalary()
   {  
      return payment; 
    }
   public void setConsalary (int pay) {
        payment = pay;
    }
   public void printDetails () {
        System.out.println("---ContractEmployee---");
        super.printDetails();
        System.out.println("Payment : " +payment);
        
    }
}