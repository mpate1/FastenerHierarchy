/*
 * This class generates the value of head type and drive type.
 * Also, this class is passing length, diameter, material, finish, price, and unit to the OuterThreaded class
 */

public class Screw extends Threaded  {

	//enums assigned
	private Enum <?> headType;
	private Enum <?> driveType;


	//The length, diameter, material, finish, price of the unit, and the unit size is passed to the Threaded class
	public Screw(double length, Threads threads, Enum<?> material, Enum<?> finish, Enum<?> heads,
			Enum<?> drive, double pricePerUnit, int unitSize) throws IllegalFastener {
		super(length, threads, material, finish, pricePerUnit, unitSize);
		this.headType = heads;
		this.driveType = drive;
	}


	//toString method created to add a return type
	@Override
	public String toString(){
		return headType + " head, " + driveType + " drive, " + super.toString(); 
	}  //end toString

}  //end program
