/*
 * This class passes the diameter/ thread size, material type , finish type,
 * price per unit, and the unit size to the InnerThreaded class
 */

public class WingNut extends InnerThreaded {

	//Passes diameter/thread size, material type, finish type, pricePerUnit, and unitSize to the InnerThreaded class
	public WingNut(Threads threads, Materials.ThreadedMaterials material, 
			Finishes.WingNutFinish finish, double pricePerUnit, int unitSize) throws IllegalFastener {
		super(threads, material, finish, pricePerUnit, unitSize);

		// if/ else statements created to make sure the finish corresponds with the appropriate material type.
		if ((material == Materials.ThreadedMaterials.Brass ||
				material == Materials.ThreadedMaterials.Stainless_Steel) && 
				(finish != Finishes.WingNutFinish.Plain)) {
			throw new IllegalFastener("Illegal Finish for the Material Type."); 
		}
	}

	// toString generated to help format the output
	public String toString() {
		return "Wing Nut, " + super.toString();
	} 
}//end program