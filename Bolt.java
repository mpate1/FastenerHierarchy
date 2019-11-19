/*
 * This class is checking if the finish is valid and passing length, diameter, material, finish, price, and unit to the OuterThreaded class
 */
public class Bolt extends Threaded {



	//Passing the length, diameter, material, finish, price, unit to the OuterThreaded class
	public Bolt(double length, Threads thread, Materials.ThreadedMaterials material, Finishes.BoltFinish finish, 
			double pricePerUnit, int unitSize) throws IllegalFastener {
		super(length, thread, material, finish, pricePerUnit, unitSize);
		checkFinish(finish, material);
	}

	//Checking to see if finish corresponds with the appropriate material.
	private void checkFinish(Finishes.BoltFinish finish, Materials.ThreadedMaterials material) throws IllegalFastener{
		if ((material == Materials.ThreadedMaterials.Brass || 
				material == Materials.ThreadedMaterials.Stainless_Steel) && 
				(finish != Finishes.BoltFinish.Plain)) {
			throw new IllegalFastener("Illegal Finish for the Material Type.");
		}
	}

	//Creating a toString
	public String toString() {
		return super.toString();
	}

}

