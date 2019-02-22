import java.util.ArrayList;
public class ArraylistPerson
{
  private ArrayList<Person> items;
  public ArraylistPerson(){  
    items = new ArrayList<Person>();  
  }
  public void addPerson(Person theItem){  
    items.add(theItem);
  }
  public void list()
  {  
    System.out.println("Print List");
    for(int i = 0 ; i < items.size() ;  i++)
    {
       items.get(i).printDetails();   
     
    }
  } 
}
