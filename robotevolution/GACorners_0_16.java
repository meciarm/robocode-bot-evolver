package robotevolution;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;


public class GACorners_0_16 extends AdvancedRobot { 
 

public void run() { 

while(true) {turnGunRight(76);
turnRight(74);
fire(110%4);
back(199);
 } 
} 


	public void onScannedRobot(ScannedRobotEvent e) { 
 
ahead(19);
ahead(36);
back(2);
fire(69%4);
} 

public void onHitByBullet(HitByBulletEvent e) { 

back(35);
fire(91%4);
turnLeft(172);
back(80);
} 

public void onHitWall(HitWallEvent e) { 

back(76);
turnRadarRight(63);
turnRadarLeft(136);
turnRight(35);
} 

public void onHitRobot(HitWallEvent e) { 

turnRadarLeft(143);
turnLeft(42);
turnGunRight(19);
turnLeft(125);
} 

}