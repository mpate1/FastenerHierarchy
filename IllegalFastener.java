/*
 * This is an exception class created for all illegal values from
 * Bolt, CarriageBolt, CommonNail, Threaded, Nail, InnerThreaded, Screw, 
 * WingNut, WoodScrew, and Fastener class. 
 */

public class IllegalFastener extends Exception {
	public IllegalFastener (String message){
		super(message);
	}
}