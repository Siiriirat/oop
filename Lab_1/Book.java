//Book.java 
public class Book{
  public static void main(String[] args){
    Book mybook,mybook1;
    boolean x;
    mybook = new Book("A Little Boy", 148, "Sirirat" );
    mybook1 = new Book("A Little Boy", 148, "Sirirat" );
    x = mybook.compare(mybook1);
    boolean y = mybook.isMorePages(mybook1);
    if(y == true)
    {
    System.out.println("Mybook1" +" more than " + "Mybook");
    }
    else
    {
    System.out.println("Mybook1" +" !more than " + "Mybook");
    }
    if(x == true)
    {
    System.out.println("Mybook" +" equal " + "Mybook1");
    }
    else
    {
    System.out.println("Mybook" +" !equal " + "Mybook1");
    }
    System.out.println("Title is " +mybook.gettitle()+ "\nNumberofPage is" + mybook.getnumberOfPage() + "\nAuthorName is " +mybook.authorName);    
  }
//attibutes
private String title;
private int numberOfPage;
private String authorName;
//Constructor 
public Book(){
}
public Book(String title){
 this.title = title; 
}
public Book(String title, int numberOfPage){
  this.title = title;
  this.numberOfPage = numberOfPage;
}
public Book(String title, int numberOfPage, String authorName){
  this.title = title;
  this.numberOfPage = numberOfPage;
  this.authorName = authorName;
}
public String gettitle( ){ 
  return this.title;
} 
public int getnumberOfPage( ){
 return this.numberOfPage;
}
public void settitle(String title){ 
 this.title = title;
}
public void setnumberOfPage(int numberOfPage){
 this.numberOfPage = numberOfPage;
}
public String getauthorName( ){
 return this.authorName;
}
public void setauthorName(String authorName){ 
 this.authorName = authorName;
}
public boolean compare(Book mybook1){
  if(this.gettitle().equals(mybook1.gettitle()) && this.getnumberOfPage() ==  mybook1.getnumberOfPage() && this.getauthorName().equals(mybook1.getauthorName()))
    return true;
  else 
    return false;
}
public boolean isMorePages(Book argBook){
  if(argBook.getnumberOfPage() > this.getnumberOfPage())
    return true;
  else 
    return false;
}
}
