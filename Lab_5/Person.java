public class Person {
  private String name;
  private int age;
   public Person(){}
  public Person(String n, int a){
    name = n;
    age = a;}
  public void printDetails () {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
  public String getName(){
     return name; }
    public void setName(String n){
     this.name = n;}
    public int getAge(){
     return age; }
    public void setAge(int a){
     this.age = a;}
}
  
