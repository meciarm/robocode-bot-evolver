package robotevolution;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;


public class GARamFire_13_9 extends AdvancedRobot { 
 

public void run() { 

while(true) {fire(186%4);
back(5);
turnRadarRight(46);
back(191);
 } 
} 


	public void onScannedRobot(ScannedRobotEvent e) { 
 
turnRadarRight(6);
fire(112%4);
fire(117%4);
fire(140%4);
} 

public void onHitByBullet(HitByBulletEvent e) { 

ahead(154);
turnGunLeft(178);
ahead(56);

} 

public void onHitWall(HitWallEvent e) { 

back(85);
fire(143%4);
turnRight(68);
back(190);
} 

public void onHitRobot(HitWallEvent e) { 

turnRadarRight(174);
back(157);
turnGunRight(114);
turnRight(5);
} 

}