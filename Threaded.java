/*
 * This class is checking if the length is valid for the appropriate fasteners. 
 * Also, this class passes material, finish, price, and unit to the Fastener class. 
 */


public abstract class Threaded extends Fastener {

	private Threads diameterThreadSize;

	private double length;

	// the length, thread, material type, finish type, price of unit and number of units is passed.
	public Threaded(double length, Threads thread, Enum<?> material, 
			Enum<?> finish, double pricePerUnit, int unitSize) throws IllegalFastener {
		super(material, finish, pricePerUnit, unitSize);
		this.diameterThreadSize = thread;
		checkLength(length);
	}

	// if and else statements created in order to make sure the length of the both fits 
	// within the given ranges and increase by the given increments
	private void checkLength (double length) throws IllegalFastener {
		if ((length>= 0.5 && length <= 6.0) && (length % 0.25 == 0)) {
			this.length = length;
		}
		else if ((length>= 6.0 && length <= 11.0) && (length % 0.5 == 0)) {
			this.length = length;
		}
		else if ((length>= 11.0 && length <= 20.0) && (length % 1.0 == 0)) {
			this.length = length;
		}
		else 
			throw new IllegalFastener("Illegal Length Size!");

	}

	// toString generated to create a valid output.
	public String toString() { 
		return length + "\" long, " + diameterThreadSize + " thread, " + super.toString();
	}
} // end class