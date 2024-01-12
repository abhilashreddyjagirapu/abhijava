package Inheritance;

public class PolyExample {
	public static void main(String[]args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run();
		Vehicle bike = new Bike2();
		bike.run();
	}
}
