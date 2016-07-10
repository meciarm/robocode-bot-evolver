package robotevolution;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;


public class GATrackFire_24_2 extends AdvancedRobot { 
 

public void run() { 

while(true) {turnGunLeft(10);
turnGunLeft(168);
ahead(111);

 } 
} 


	public void onScannedRobot(ScannedRobotEvent e) { 
 

fire(55%4);
ahead(1);
back(86);
} 

public void onHitByBullet(HitByBulletEvent e) { 

turnGunRight(52);
turnRight(10);
back(148);
turnGunLeft(115);
} 

public void onHitWall(HitWallEvent e) { 

back(182);
back(178);
fire(150%4);
ahead(84);
} 

public void onHitRobot(HitWallEvent e) { 

back(199);
turnGunLeft(159);
back(134);
turnRadarLeft(43);
} 

}