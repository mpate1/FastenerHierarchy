import java.io.Serializable;

/*
 * This class is creating the values for finish, price, number of units, and material type if they are valid
 * Also, this class includes a getCost method and value checking methods. 
 */

public abstract class Fastener implements Serializable {
	private Enum <?> material;
	private Enum<?> finish;
	private double pricePerUnit;	
	private int unitSize;

	//Passing in the value for material type, finish type, price, and the number of units.
	public Fastener(Enum<?> material, Enum<?> finish, double pricePerUnit, int unitSize) throws IllegalFastener {
		this.material = material;
		this.finish = finish;
		this.pricePerUnit = pricePerUnit;
		this.unitSize=unitSize;

		//Generating an if/else statements to check if the number of units and the price falls within the given parameters. 
		if (unitSize < 1 || unitSize > 10000){
			if (unitSize % 5 != 0);
			throw new IllegalFastener("Units must be between 1 and 10000 inclusive.");
		}
		if (pricePerUnit < 0){
			throw new IllegalFastener("Unit price must be greater than $0.");
		}
	}

	//universal methods
	public double getOrderCost(int OrderSize) {
		return (double) (OrderSize*this.pricePerUnit);
	}  //end method

	// Creating a string output
	public String toString() {
		return material + ", with a " + finish + " finish. " + 
				unitSize + " in a unit, $" + pricePerUnit + " per unit.";
	}
}  //end program