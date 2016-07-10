package robotevolution;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;


public class GATest_0_0 extends AdvancedRobot { 
 

public void run() { 

while(true) {ahead(96);
turnGunRight(87);
ahead(27);
back(96);
 } 
} 


	public void onScannedRobot(ScannedRobotEvent e) { 
 
turnGunRight(87);
turnRadarRight(68);
fire(52%4);
turnLeft(97);
} 

public void onHitByBullet(HitByBulletEvent e) { 

turnGunRight(39);

ahead(87);
ahead(69);
} 

public void onHitWall(HitWallEvent e) { 

turnRight(56);
back(67);
fire(67%4);
turnGunLeft(75);
} 

public void onHitRobot(HitWallEvent e) { 


turnRadarLeft(6);

turnRadarLeft(45);
} 

}