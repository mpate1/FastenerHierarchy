import java.io.Serializable;


public final class Finishes implements Serializable {

	// Generate a new serialVersionUID after you have added the ScrewFinish Enum:
	//private static final long serialVersionUID = 3287198433875663480L;

	public enum BoltFinish {Chrome, Hot_Dipped_Galvanized, Plain, Yellow_Zinc, Zinc};

	public enum WingNutFinish {Chrome, Hot_Dipped_Galvanized, Plain, Yellow_Zinc, Zinc};
	
	public enum CommonNailFinish {Bright, Hot_Dipped_Galvanized};
	
	public enum ScrewFinish {Zinc, ACQ_1000_Hour, Chrome, BlackPhosphate, Lubricated, Yellow_Zinc, Hot_Dipped_Galvanized, Plain};
	
}
