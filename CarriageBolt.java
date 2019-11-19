public class CarriageBolt extends Bolt {

	//enums
	private double length;

	//Passing length, diameter, material, finish, price, and unit to the Bolt class
	public CarriageBolt(double length, Threads thread, Materials.ThreadedMaterials material, Finishes.BoltFinish finish, 
			double pricePerUnit, int unitSize) throws IllegalFastener {
		super(length, thread, material, finish, pricePerUnit, unitSize); 
	}

	//toString created to generate an output
	@Override
	public String toString(){
		return "Carriage Bolt " + super.toString() ;  
	}  //end toString

}