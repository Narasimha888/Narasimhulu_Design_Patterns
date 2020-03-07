package Structural_Design_Pattern.Decorator_Pattern;

import Structural_Design_Pattern.Decorator_Pattern.Basic_Car;
import Structural_Design_Pattern.Decorator_Pattern.Car;
import Structural_Design_Pattern.Decorator_Pattern.Luxury_Car;
import Structural_Design_Pattern.Decorator_Pattern.Sports_Car;

public class Decorator_PatternText {
	public static void main(String[] args) {
		Car sports_Car = new Sports_Car(new Basic_Car());
		sports_Car.assemble();
		System.out.println("\n*****");
		
		Car sportsLuxuryCar = new Sports_Car(new Luxury_Car(new Basic_Car()));
		sportsLuxuryCar.assemble();
	}
}
