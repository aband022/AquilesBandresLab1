/**
 * 
 */
package edu.fiu.RobotCar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author aband
 *
 */
public class Motor implements SelfCheckCapable {
	int Motor_speed;
	
	/**
	 * This is the SetMotorModeLeft method - setMotorModel(-1500,-1500,2000,2000) #Left 
	 */
	void SetMotorModeLeft() {
		
	}
	/**
	 * This is the SetMotorModeRigth method - setMotorModel(2000,2000,-1500,-1500) #Right 
	 */
	void SetMotorModeRight() {
		
	}
	
	/**
	 * This is the SetMotorModeForward method - setMotorModel(1000,1000,1000,1000) #Forward 
	 */
	void SetMotorModeFroward() {
		
	}
	/**
	 * This is the SetMotorModeBack method - setMotorModel(-1000,-1000,-1000,-1000) #Back
	 */
	void SetMotorModeBack() {
		
	}
	/**
	 * This is the SetMotorModeStop method - setMotorModel(0,0,0,-0) #Stop
	 */
	void SetMotorModeStop() {
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "MY Wheels";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.25);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
