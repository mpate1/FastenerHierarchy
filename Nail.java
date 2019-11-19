/*
 * This class is setting the value for size, length, and gauge of commonNail.
 * This class extends Fastener
 */


public class Nail extends Fastener {



	//attributes are assigned.
	private NailDesigns.CommonNailGauges gauge;
	private NailDesigns.CommonNailLengths length;
	private NailDesigns.CommonNailSizes size;

	// Nail class is passing material, finish, price, and unit to the Fastener class. 	
	public Nail(NailDesigns.CommonNailSizes size, NailDesigns.CommonNailLengths length,
			NailDesigns.CommonNailGauges gauge, Finishes.CommonNailFinish finish,
			double pricePerUnit, int unitSize) throws IllegalFastener {
		super(Materials.NailMaterials.Steel, finish ,pricePerUnit, unitSize);
		this.size = size;
		this.gauge = gauge;
		this.length = length;
	}

	//toString created in order to execute proper output.
	public String toString() {
		return size + " size, " + length + 
				" long, " + gauge + " gauge, " + super.toString();
	}

} // end class