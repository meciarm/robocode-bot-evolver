package robotevolution;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;


public class GATrackFire_0_23 extends AdvancedRobot { 
 

public void run() { 

while(true) {turnRight(55);
turnRadarLeft(153);


 } 
} 


	public void onScannedRobot(ScannedRobotEvent e) { 
 
fire(69%4);
fire(32%4);
turnRadarRight(96);
turnRadarLeft(1);
} 

public void onHitByBullet(HitByBulletEvent e) { 


back(99);
turnGunRight(172);
fire(147%4);
} 

public void onHitWall(HitWallEvent e) { 

fire(48%4);
fire(171%4);
turnRight(117);
turnRadarRight(31);
} 

public void onHitRobot(HitWallEvent e) { 


fire(117%4);
turnGunLeft(147);
turnRight(70);
} 

}