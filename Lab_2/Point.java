/**
 * Auto Generated Java Class.
 */
public class Point {
  private double x;
  private double y;
  private double z;
  public Point() {
  }
  public Point(Point p) {
   this.x = p.x;
   this.y = p.y;
   this.z = p.z;
  }
  public Point(double x, double y, double z) {
   this.x = x;
   this.y = y;
   this.z = z;
  }
  public double get_x() {
   return this.x;
  }
public double get_y() {
   return this.y;
  }

public double get_z() {
   return this.z;
  }
  public void set_x (double x) {
   this.x = x;
  }
public void set_y (double y) {
   this.y = y;
  }
public void set_z (double z) {
   this.z = z;
  }
  public void setpoint(double x, double y, double z) {
   this.x = x;
   this.y = y;
   this.z = z;
  }
  public void movepoint (Point newPoint) {
   this.x = newPoint.x;
   this.y = newPoint.y;
   this.z = newPoint.z;
  }
  
}
