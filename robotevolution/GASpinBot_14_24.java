package robotevolution;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;


public class GASpinBot_14_24 extends AdvancedRobot { 
 

public void run() { 

while(true) {
turnLeft(48);
turnRadarRight(97);
back(67);
 } 
} 


	public void onScannedRobot(ScannedRobotEvent e) { 
 

fire(13%4);
fire(14%4);
turnGunRight(49);
} 

public void onHitByBullet(HitByBulletEvent e) { 


turnGunLeft(81);

turnRight(75);
} 

public void onHitWall(HitWallEvent e) { 


ahead(49);
turnGunRight(48);

} 

public void onHitRobot(HitWallEvent e) { 

turnLeft(65);
turnLeft(11);
back(74);
turnGunRight(23);
} 

}