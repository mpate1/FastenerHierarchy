/* 
 * This class is to check if the size, length, gauge and 
 * finish of all Common Nails are valid.
 * This class extends Nail, so it will be passing the size, length, gauge, 
 * finish, price, and the number of units to the Nail class.
 */

public class CommonNail extends Nail {

	//attributes
	private int size;

	// This class will be passing size, the length, 
	// gauge, finish type, price, and unit size as a parameter.

	public CommonNail(NailDesigns.CommonNailSizes size, NailDesigns.CommonNailLengths length,
			NailDesigns.CommonNailGauges gauge, Finishes.CommonNailFinish finish,
			double pricePerUnit, int unitSize) throws IllegalFastener {
		super(size, length, gauge, finish, pricePerUnit, unitSize);
	}

	//toString
	@Override
	public String toString(){
		return "Common Nail, " + super.toString();  
	}  //end toString

}  //end program