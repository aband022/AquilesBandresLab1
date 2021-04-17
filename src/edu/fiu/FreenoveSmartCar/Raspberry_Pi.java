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
public class Raspberry_Pi implements SelfCheckCapable {

	RemoteControl myremotecontrol;
	
	public Raspberry_Pi() {
		myremotecontrol = new RemoteControl(); 
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Raspberry Pi";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.05);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this,myremotecontrol);
	}

	public void initiate_systems() {
		// TODO Auto-generated method stub
		System.out.println("Systems are up");
		myremotecontrol.Establishconnection(); 
		myremotecontrol.SelfDriving();
	}
}
