/**
 * 
 */
package edu.fiu.RobotCar;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author aband
 *
 */
public class Car implements SelfCheckCapable {

	boolean Switch1;
    String IPaddress;
	int power_voltage;
	int Buzzer;
	
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
