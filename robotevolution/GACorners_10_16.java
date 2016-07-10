package robotevolution;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;


public class GACorners_10_16 extends AdvancedRobot { 
 

public void run() { 

while(true) {
back(4);
turnGunLeft(32);
turnRight(177);
 } 
} 


	public void onScannedRobot(ScannedRobotEvent e) { 
 

fire(6%4);
turnGunRight(150);
turnGunRight(195);
} 

public void onHitByBullet(HitByBulletEvent e) { 

turnGunLeft(18);
turnGunLeft(91);
turnGunLeft(172);
ahead(80);
} 

public void onHitWall(HitWallEvent e) { 

turnGunLeft(15);
ahead(48);
turnRight(14);
back(167);
} 

public void onHitRobot(HitWallEvent e) { 

turnRadarLeft(143);

turnRadarLeft(19);
turnRight(62);
} 

}