public class Dice 
{
 private int face;
 public static void main(String[] args) { 
  
  }
 public Dice() 
 {
  face = 1;
 }
 public void roll()
 {
  face = (int)(Math.random()*6)+1;
 }
 public int getFace() 
 {
  return face;
 }
 public String toString()
 {
  return "F = " + face;
 }
}




