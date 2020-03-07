package Structural_Design_Pattern.Decorator_Pattern;


public class Sports_Car extends Car_Decorator {

	public Sports_Car(Car c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Sports Car.");
	}

}
