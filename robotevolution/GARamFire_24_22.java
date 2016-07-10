package robotevolution;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;


public class GARamFire_24_22 extends AdvancedRobot { 
 

public void run() { 

while(true) {fire(186%4);
back(5);
turnRadarRight(34);
back(191);
 } 
} 


	public void onScannedRobot(ScannedRobotEvent e) { 
 
turnRadarRight(113);
fire(112%4);
fire(117%4);
fire(140%4);
} 

public void onHitByBullet(HitByBulletEvent e) { 

ahead(154);
turnGunLeft(178);
ahead(56);
turnGunRight(130);
} 

public void onHitWall(HitWallEvent e) { 

back(90);
fire(143%4);
turnLeft(68);
back(190);
} 

public void onHitRobot(HitWallEvent e) { 

turnRight(146);
back(157);
turnLeft(104);
turnRadarRight(172);
} 

}