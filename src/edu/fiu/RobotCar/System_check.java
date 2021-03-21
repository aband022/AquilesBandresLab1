/**
 * 
 */
package edu.fiu.RobotCar;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author aband
 *
 */
public class System_check implements SelfCheckCapable {

	String Camera_status;
	String LED_status;
	String Power_voltage_status;
	boolean Remote_control_Established;
	
	/**
	 * This is the System_check Method - It check all Systems in the car
	 */
	void System_check() { 
		
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
