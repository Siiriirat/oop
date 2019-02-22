// VehicleMain.java
public class VehicleMain {
	public static void main(String[] args) {
		Bicycle b = new Bicycle();
		b.changeGear(3);
		b.speedUp(80);
		String a = b.toString();
		System.out.println(a);
		b.changeGear(1);
        b.applyBrakes(10);
		System.out.println("When you break \n"+b.toString());
	}
}