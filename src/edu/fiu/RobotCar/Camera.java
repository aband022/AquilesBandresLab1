/**
 * 
 */
package edu.fiu.RobotCar;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author aband
 *
 */
public class Camera implements SelfCheckCapable {

	boolean Enable;
	
	/**
	 * This is the TakePicture method - It sends the signal to the car
	 * to take a picture
	 */
	void TakePicture() {
		
	}
	/**
	 * This is the SendPicture method - It transmits the picture from the car 
	 * to remote client 
	 */
	void SendPicture() {
		
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
