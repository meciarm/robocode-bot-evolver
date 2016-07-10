package robotevolution;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;


public class GAFire_0_22 extends AdvancedRobot { 
 

public void run() { 

while(true) {ahead(33);
fire(82%4);
back(167);
turnLeft(139);
 } 
} 


	public void onScannedRobot(ScannedRobotEvent e) { 
 
fire(63%4);
back(79);
fire(149%4);

} 

public void onHitByBullet(HitByBulletEvent e) { 

back(191);
ahead(175);
back(30);
turnRight(147);
} 

public void onHitWall(HitWallEvent e) { 

turnLeft(95);
turnRight(9);
turnRadarRight(57);
turnGunRight(9);
} 

public void onHitRobot(HitWallEvent e) { 

back(153);
ahead(36);

turnGunRight(72);
} 

}