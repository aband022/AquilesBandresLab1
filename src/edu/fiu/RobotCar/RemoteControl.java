/**
 * 
 */
package edu.fiu.RobotCar;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author aband
 *
 */
public class RemoteControl implements SelfCheckCapable {
	boolean ConnectionEstablished;
	
	/**
	 *  This is the SelfDriving method - It sends signal to the car to enable
	 *  self driving and obstacle avoidance capability
	 */
	
	void SelfDriving() {
		
	}	
	
	/**
	 * This is the Manual driving method  
	 */
		void ManualDriving() {
			
		}	
	
	/**
		 * This is the SetBuzzer method  - It turns on and off the buzzer for a 
		 * determined time
		 */
			void SetBuzzer() {
				
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
