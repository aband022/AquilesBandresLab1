/**
 * 
 */
package edu.fiu.FreenoveSmartCar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author aband
 *
 */
public class RemoteControl implements SelfCheckCapable {
	
	obstacleAvoidance myobstacleavoidance;

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Remote Control";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.05);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

	public void Establishconnection() {
		// TODO Auto-generated method stub
		System.out.println("Remote Connection Established");
	}

	public void SelfDriving() {
		// TODO Auto-generated method stub
		Motor.SetMotorModeForward();
		obstacleAvoidance.detect_Obstacle();
		Motor.SetMotorModeStop();
		Motor.SetMotorModeback();
		UltraSonicRangeSensor.RotateServoLeft();
		UltraSonicRangeSensor.CalculateDistanceLeft();
		UltraSonicRangeSensor.RotateServoRight();
		UltraSonicRangeSensor.CalculateDistanceRight();
		Motor.SetMotorModeRight();
		obstacleAvoidance.detect_Obstacle();
		Motor.SetMotorModeStop();
		Motor.SetMotorModeback();
	}

}
