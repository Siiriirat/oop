public class ArraylistPoint{
private ArrayList<Point> p;
public ArraylistPoint(){
  p = new ArrayList<Point>();
}
public void add(Point p1){
 p.add(p1);
}
public String toString(){
 String point = "";
 for(int i = 0; i < p.size() ;i++){
 point = point +" "+ p.get(i).get_x() +" "+ p.get(i).get_y() +" "+ p.get(i).get_z() ;
 }
 return point;
}

}