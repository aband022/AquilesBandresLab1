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
public class Car implements SelfCheckCapable {

	Raspberry_Pi myRaspberry;
	Motor mymotor;
	UltraSonicRangeSensor mysonicsensor;
	RemoteControl myremotecontrol;
		
	public Car() {
		myRaspberry = new Raspberry_Pi();
		mymotor = new Motor();
		mysonicsensor = new UltraSonicRangeSensor();
		myremotecontrol = new RemoteControl();  
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Car";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.05);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this,myRaspberry, mymotor,mysonicsensor, myremotecontrol );
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		mycar.runSelfCheck();
		mycar.power_on();
		
	}

	private void power_on() {
		// TODO Auto-generated method stub
		myRaspberry.initiate_systems();
	}

}
