public class MainDiceBox {
  public static void main(String args[]) { 
  Dice d1 = new Dice();
  System.out.println(d1);
  d1.roll();
  System.out.println(d1);
  DiceBox box = new DiceBox();
  box.add(d1);
  box.add(new Dice());
  box.add(new Dice());
  System.out.println("Before shaking: total = " + box.getTotal());
  box.shake();
  System.out.println("After shaking: total = " + box.getTotal());
  box.printDices();
  }
}

