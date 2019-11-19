/*
 * This class checks to see if the material and finish are corresponding with one another. 
 * The length, diameter/ thread size, material, finish, head, drive, price, and unit are passed to the Screw class. 
 */
public class WoodScrew extends Screw {

	private ScrewDesigns.WoodScrewPoints point;

	// A constructor is created and length, thread, material, finish type, head type, drive type, 
	//point type, price and number of units is passed as a parameter.
	public WoodScrew(double length, Threads threads, Materials.ThreadedMaterials material, 
			Finishes.ScrewFinish finish, ScrewDesigns.ScrewHeads heads,
			ScrewDesigns.ScrewDrive drive, ScrewDesigns.WoodScrewPoints point, 
			double pricePerUnit, int unitSize) throws IllegalFastener {
		super(length, threads, material, finish, heads, drive, pricePerUnit, unitSize);
		this.point = point;

		// if and else statements created in order to determine whether the materials have 
		// their corresponding finishes, if not, the program should throw an IllegalFastener.
		if ((material == Materials.ThreadedMaterials.Brass || 
				material == Materials.ThreadedMaterials.Stainless_Steel) && 
				(finish != Finishes.ScrewFinish.Plain)) {
			throw new IllegalFastener("Illegal Finihs for the Material Type.");
		}
	}

	// a toString created to create a return type
	public String toString() {
		return "Wood Screw, " + point + " point, " + super.toString();
	}

}
//end program