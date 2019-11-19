/*
 * This is an abstract class that that extends fastener, and this class is called in the WingNut class.
 * It assigns the appropriate values for thread, material, finish, pricePerUnit, and unitSize.
 * This class is followed by toString that generates an output.
 */


abstract class InnerThreaded extends Fastener{

	private Threads thread;

	// thread, material, finish type, pricePerUnit, and unitSize are passed as parameters.
	public InnerThreaded(Threads thread, Enum<?> material, Enum<?> finish, double pricePerUnit, int unitSize)
			throws IllegalFastener {
		super(material, finish, pricePerUnit, unitSize);
		this.thread = thread;
	}

	// toString to generate an output line.
	public String toString() {
		return thread + " thread, " + super.toString();
	}

} //end class



