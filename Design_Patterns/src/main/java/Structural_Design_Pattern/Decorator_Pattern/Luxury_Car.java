package Structural_Design_Pattern.Decorator_Pattern;


public class Luxury_Car extends Car_Decorator {

	public Luxury_Car(Car c) {
		super(c);
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Luxury Car.");
	}

}
