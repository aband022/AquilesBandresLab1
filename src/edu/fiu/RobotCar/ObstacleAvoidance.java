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
public class ObstacleAvoidance implements SelfCheckCapable {
	
	int Left_object_distance;
	int Middle_object_distance;
	int Right_object_distance;
	
	/**
	 * This is the CalculateDistance method - It calculates the distance to the next object
	 */
     void CalculateDistance() {
    	 
     }
     
     /**
 	 * This is the RotateLeft method - It turns left to avoid object
 	 */
      void RotateLeft() {
     	 
      }
      
      /**
   	 * This is the RotateMiddle  method - It turns to the middle to avoid object
   	 */
        void RotateMiddle() {
       	 
        }
        /**
       	 * This is the RotateRight  method - It turns right to avoid object
       	 */
            void RotateRight () {
            	
            }
	
            @Override
        	public String getComponentName() {
        		// TODO Auto-generated method stub
        		return "MY Obstacle Avoidance Function";
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
