import java.io.Serializable;


public final class NailDesigns implements Serializable {

	// Generate a new serialVersionUID after you have build the CommonNailSizes class:
	//private static final long serialVersionUID = -5312569835250174515L;

	public static class CommonNailLengths implements Serializable {
		private static final long serialVersionUID = -1990822737665330422L;
		private float length;
		private CommonNailLengths(float length) { this.length = length; }
		public static final CommonNailLengths L2 = new CommonNailLengths(2.0f);
		public static final CommonNailLengths L2_5 = new CommonNailLengths(2.5f);
		public static final CommonNailLengths L3 = new CommonNailLengths(3.0f);
		public static final CommonNailLengths L3_25 = new CommonNailLengths(3.25f);
		public static final CommonNailLengths L3_5 = new CommonNailLengths(3.5f);
		public static final CommonNailLengths L6 = new CommonNailLengths(6.0f);
		public String toString() { return "" + length + "\""; }
	}

	public static class CommonNailGauges implements Serializable {
		private static final long serialVersionUID = -1976857688978088109L;
		private float gauge;
		private CommonNailGauges(float gauge) { this.gauge = gauge; }
		public static final CommonNailGauges G2 = new CommonNailGauges(2.0f);
		public static final CommonNailGauges G8 = new CommonNailGauges(8.0f);
		public static final CommonNailGauges G9 = new CommonNailGauges(9.0f);
		public static final CommonNailGauges G10_25 = new CommonNailGauges(10.25f);
		public static final CommonNailGauges G11_5 = new CommonNailGauges(11.5f);
		public String toString() { return "" + gauge; }
	}

	public static class CommonNailSizes implements Serializable {
		private String size;
		private CommonNailSizes(String f) { this.size = f; }
		public static final CommonNailSizes S10D = new CommonNailSizes("10D");
		public static final CommonNailSizes S16D = new CommonNailSizes("16D");
		public static final CommonNailSizes S60D = new CommonNailSizes("60D");
		public String toString() { return "" + size; }
		}

	

} // end NailDesigns
