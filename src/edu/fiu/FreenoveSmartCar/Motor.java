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
public class Motor implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Motor";
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

	public static void SetMotorModeForward() {
		// TODO Auto-generated method stub
 
	}

	public static void SetMotorModeStop() {
		// TODO Auto-generated method stub
		System.out.println("Car stop");
	}

	public static void SetMotorModeback() {
		// TODO Auto-generated method stub
		System.out.println("Car is going Back for 2 seconds");
	}

	public static void SetMotorModeRight() {
		// TODO Auto-generated method stub
		System.out.println("Car is going Right");
	}

}
