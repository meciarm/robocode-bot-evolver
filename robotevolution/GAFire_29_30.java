package robotevolution;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;


public class GAFire_29_30 extends AdvancedRobot { 
 

public void run() { 

while(true) {turnLeft(33);
turnLeft(127);

turnRadarRight(139);
 } 
} 


	public void onScannedRobot(ScannedRobotEvent e) { 
 
fire(63%4);
fire(128%4);
back(154);

} 

public void onHitByBullet(HitByBulletEvent e) { 

back(97);
turnRadarLeft(165);
turnRight(23);
turnRight(169);
} 

public void onHitWall(HitWallEvent e) { 

ahead(94);
turnLeft(106);
ahead(60);
turnRight(44);
} 

public void onHitRobot(HitWallEvent e) { 

turnRadarRight(159);
ahead(37);
turnGunRight(194);
turnGunRight(16);
} 

}