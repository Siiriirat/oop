public class MainPoint{
public static void main(String[] args) { 
    Point p1,p2,p3;
    p1 = new Point(1.0, 2.0, -1.0);
    System.out.print("Old point :" +p1.get_x()+" "+  p1.get_y()+" "+p1.get_z() + " moveto " );
    p2 = new Point(3.0,5.0,6.0);
    p3 = new Point();
    p1.movepoint(p2);
    System.out.println("New point :"+p1.get_x()+" "+  p1.get_y()+" " +p1.get_z());
    p1.setpoint(2.4,2.5,2.6);
    System.out.println("Set point :"+p1.get_x()+" "+  p1.get_y()+" " +p1.get_z());
    p3.set_x(2.5);
    p3.set_y(2.75);
    p3.set_z(2.35);
    System.out.println("Point 3 :"+p3.get_x()+" "+  p3.get_y()+" " +p3.get_z());
    ArraylistPoint A = new ArraylistPoint();
    A.add(p1);
    A.add(p2);
    A.add(p3);
    System.out.println("Point in list : "+ A.toString());
  }
}