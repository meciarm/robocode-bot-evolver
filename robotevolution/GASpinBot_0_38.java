package robotevolution;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;


public class GASpinBot_0_38 extends AdvancedRobot { 
 

public void run() { 

while(true) {back(84);
turnRadarLeft(42);
turnRadarRight(44);
turnLeft(67);
 } 
} 


	public void onScannedRobot(ScannedRobotEvent e) { 
 
turnGunRight(43);
fire(2%4);
fire(14%4);
turnGunRight(11);
} 

public void onHitByBullet(HitByBulletEvent e) { 




turnRight(75);
} 

public void onHitWall(HitWallEvent e) { 


fire(12%4);
turnGunRight(48);
ahead(7);
} 

public void onHitRobot(HitWallEvent e) { 

back(10);
turnGunLeft(88);
turnGunLeft(59);
ahead(59);
} 

}