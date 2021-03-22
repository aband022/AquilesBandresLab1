/**
 * 
 */
package edu.fiu.RobotCar;

/**
 * @author aband
 *
 */
public class RemoteControl {

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
					
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car  myCar = new Car();
		myCar.runSelfCheck();
		LED  myLED = new LED();
		myLED.runSelfCheck();
		Camera  myCamera = new Camera();
		myCamera.runSelfCheck();
		Motor  myMotor = new Motor();
		myMotor.runSelfCheck();
		ObstacleAvoidance  myObstacleAvoidance = new ObstacleAvoidance();
		myObstacleAvoidance.runSelfCheck();
		System_check  mySystem_check = new System_check();
		mySystem_check.runSelfCheck();
		
	}

}
