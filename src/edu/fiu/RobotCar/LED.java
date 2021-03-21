/**
 * 
 */
package edu.fiu.RobotCar;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author aband
 *
 */
public class LED implements SelfCheckCapable {

	String LED0_color;
	String LED1_color;
	String LED2_color;
	String LED3_color;
	String LED4_color;
	String LED5_color;
	String LED6_color;
	String LED7_color;
	
	/**
	 * This is DisplayLedShow method - It initiates LedShow on the Car
	 */
	void DisplayLedShow() {
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}
