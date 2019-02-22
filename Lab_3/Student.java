/**
 * Auto Generated Java Class.
 */
public class Student {
  protected String stCode; // student code 
  protected String name;  
  protected double gpa;
  public Student() { }
  public Student(String c, String nm){
   stCode = c;
   name = nm;
  }
  public Student(String c, String nm, double g){
   stCode = c;
   name = nm;
   gpa = g;
  }
  public String getCode(){
   return stCode;
  }
  public String getName( ){
   return name;
  }
  public double getGPA( ) {
   return gpa;
  }
  public void setGPA(double g){
   gpa = g;
  }
  public String toString( ){
   String s = stCode + " " + name + " " + gpa;
   return s;
  } 
}

