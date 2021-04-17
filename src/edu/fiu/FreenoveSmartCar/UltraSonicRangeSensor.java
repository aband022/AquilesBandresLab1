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
public class UltraSonicRangeSensor implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Ultra Sonic Range Sensor";
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

	public static void RotateServoLeft() {
		// TODO Auto-generated method stub
		
	}

	public static void CalculateDistanceLeft() {
		// TODO Auto-generated method stub
		System.out.println("Left Object < 30 CMS");
	}

	public static void RotateServoRight() {
		// TODO Auto-generated method stub
		
	}

	public static void CalculateDistanceRight() {
		// TODO Auto-generated method stub
		System.out.println("Rigt Object > 30 CMS");
	}

}
