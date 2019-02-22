import java.util.ArrayList; 
public class MainStudentList {
 public static void main(String[] args) { 
    Student st =  new Student("148","Sirirat",3.33);
    Student st1 = new Student("149","Aunyamane",3.37);
    Student st2 = new Student("000","ABC",3.35);
    StudentList stlist = new StudentList();
    
    stlist.addstudent(st);
    stlist.addstudent(st1);
    stlist.addstudent(st2);
    
    st.setGPA(3.75);
    
    System.out.println("Show all students after add");
    System.out.println(stlist.showAllStudentInfo());
    
    stlist.removeStudentBystCode("000");
    System.out.println("Show all students after remove");
    System.out.println(stlist.showAllStudentInfo());
    
    stlist.searchBystCode("000");
    ArrayList<Student> sts = new ArrayList<Student>();
    System.out.println("Number of Student Found : "+ searchCode(st,"148"));
    
    System.out.println("Number of Student : "+stlist.getNumberofStudent() + " students");
  }
 }