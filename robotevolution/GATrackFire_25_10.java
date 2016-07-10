package robotevolution;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;


public class GATrackFire_25_10 extends AdvancedRobot { 
 

public void run() { 

while(true) {turnGunLeft(10);
turnGunLeft(62);
ahead(111);

 } 
} 


	public void onScannedRobot(ScannedRobotEvent e) { 
 

fire(3%4);
ahead(99);
ahead(144);
} 

public void onHitByBullet(HitByBulletEvent e) { 

turnGunRight(52);
turnRight(10);
back(148);
turnGunLeft(117);
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
turnLeft(43);
} 

}