public class Bicycle implements Vehicle {
	private int speed; 
	private int gear;
    public Bicycle(){
      speed = 0; 
      gear = 0;
    }
    public void changeGear(int a){
        gear = a;   
    }
    public void speedUp(int a){
        speed = speed + a;   
    }
    public void applyBrakes(int a){
        speed = speed - a;   
    }
    public String toString(){
       String show;
       show = "Gear " + gear + " Speed " + speed;

       return show;
    }
}