/**
 * Auto Generated Java Class.
 */

public class Teacher extends Person{
    private String faculty;
    public Teacher(String name, int age,String f){
    super(name, age);
    faculty = f;
    }
    public String getFaculty()
   {  
      return faculty; 
    }

   public void setFaculty (String f) {
        faculty = f;
    }
   public void printDetails () {
        System.out.println("------ Teacher ------");
        super.printDetails();
        System.out.println("Faculty : "+faculty);
   
    }
  
}
