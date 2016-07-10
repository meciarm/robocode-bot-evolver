package robotevolution;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;


public class GAFire_15_21 extends AdvancedRobot { 
 

public void run() { 

while(true) {
turnLeft(123);

turnLeft(139);
 } 
} 


	public void onScannedRobot(ScannedRobotEvent e) { 
 
fire(63%4);
back(79);
turnRight(54);

} 

public void onHitByBullet(HitByBulletEvent e) { 

back(170);
ahead(134);
turnRight(109);
turnGunRight(24);
} 

public void onHitWall(HitWallEvent e) { 

turnRight(94);
turnLeft(11);
turnGunRight(57);
turnGunLeft(44);
} 

public void onHitRobot(HitWallEvent e) { 

back(153);
ahead(101);
turnLeft(163);
fire(196%4);
} 

}