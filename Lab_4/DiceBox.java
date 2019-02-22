import java.util.*;
public class DiceBox {
 private ArrayList<Dice> box = new ArrayList<Dice>();
 public DiceBox()
 {}
 public void add (Dice d)
 {
  box.add(d);
 }
 public void shake()
 {
  for(int i=0; i<box.size();i++)
   box.get(i).roll();
 }
 public int getTotal()
 {
  int total = 0;
  for(int i=0; i<box.size();i++){
  total += box.get(i).getFace();
  }
  return total;
 }
 public void printDices()
 {
  for(int i=0; i<box.size();i++)
  System.out.println((i+1)+" . Face = " +box.get(i).getFace());
 }  
}

