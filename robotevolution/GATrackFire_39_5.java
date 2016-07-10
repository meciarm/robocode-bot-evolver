package robotevolution;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;


public class GATrackFire_39_5 extends AdvancedRobot { 
 

public void run() { 

while(true) {
turnGunLeft(168);
back(111);

 } 
} 


	public void onScannedRobot(ScannedRobotEvent e) { 
 

fire(55%4);
turnGunRight(1);
back(86);
} 

public void onHitByBullet(HitByBulletEvent e) { 

turnRight(52);
turnRight(161);
back(148);
turnGunLeft(115);
} 

public void onHitWall(HitWallEvent e) { 

turnLeft(182);
back(178);
fire(150%4);
turnGunRight(84);
} 

public void onHitRobot(HitWallEvent e) { 


turnGunLeft(66);
turnLeft(150);
turnRadarLeft(81);
} 

}