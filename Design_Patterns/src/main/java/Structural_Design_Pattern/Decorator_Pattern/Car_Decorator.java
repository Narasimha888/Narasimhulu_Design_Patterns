package Structural_Design_Pattern.Decorator_Pattern;



public class Car_Decorator implements Car {

	protected Car car;
	
	public  Car_Decorator(Car c){
		this.car=c;
	}
	
	public void assemble() {
		this.car.assemble();
	}

}
