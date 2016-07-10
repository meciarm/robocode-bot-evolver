package robotevolution;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;


public class GACorners_19_2 extends AdvancedRobot { 
 

public void run() { 

while(true) {turnLeft(55);
turnLeft(71);
turnGunLeft(97);
ahead(0);
 } 
} 


	public void onScannedRobot(ScannedRobotEvent e) { 
 

fire(6%4);
turnGunRight(160);
back(119);
} 

public void onHitByBullet(HitByBulletEvent e) { 

back(35);
fire(174%4);
turnLeft(47);
back(80);
} 

public void onHitWall(HitWallEvent e) { 

turnRight(76);
fire(166%4);
turnGunLeft(63);
turnLeft(116);
} 

public void onHitRobot(HitWallEvent e) { 

ahead(160);
fire(88%4);
turnGunLeft(148);
fire(125%4);
} 

}