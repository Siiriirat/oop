/**
 * Auto Generated Java Class.
 */
 import java.util.*;
 public class StudentList {
  private ArrayList<Student> stlist = new ArrayList<Student> ();
  private String info = "";
  public StudentList(){
  }
  public void addstudent(Student st){
    stlist.add(st);
  }
  public void removeStudentBystCode(String c){
  for(int i = 0; i < stlist.size() ; i++)
   {
    if(stlist.get(i).getCode() == c)
     stlist.remove(i);
   }
  }
  public String showAllStudentInfo(){
    info = "";
    for(int i = 0; i < stlist.size() ; i++){
      info += (i+1)+". " + stlist.get(i).toString()+"\n";
    }
    return info;
  }
  
  public int getNumberofStudent(){
    return stlist.size();
  }
  public void searchBystCode(String c){
    for(int i = 0 ; i < stlist.size() ; i++){
       if(stlist.get(i).getCode().equals(c))
       {
         System.out.println("Found : "+stlist.get(i).getCode() + " " + stlist.get(i).getName() + " " + stlist.get(i).getGPA() + " ");
       }
    }
        
  }

}
