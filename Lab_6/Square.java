// Square.java
public class Square extends Polygon{
	public Square(double w){
		super(4);
		for(int i = 0; i < n ; i++){
			sides[i] = w;
		}
		calArea();
	}
	public void calArea(){
    	area = sides[0] * sides[0];
	}
}