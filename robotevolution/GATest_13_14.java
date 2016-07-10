package robotevolution;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;


public class GATest_13_14 extends AdvancedRobot { 
 

public void run() { 

while(true) {turnGunLeft(53);
ahead(19);
turnGunRight(1);
ahead(51);
 } 
} 


	public void onScannedRobot(ScannedRobotEvent e) { 
 
fire(91%4);
turnGunRight(46);
back(34);
back(3);
} 

public void onHitByBullet(HitByBulletEvent e) { 

turnGunRight(69);
turnGunRight(43);
turnRight(10);
turnRight(54);
} 

public void onHitWall(HitWallEvent e) { 

turnGunLeft(2);
turnGunRight(12);
turnRight(24);
ahead(27);
} 

public void onHitRobot(HitWallEvent e) { 

turnGunLeft(47);
ahead(33);
turnRight(78);
turnLeft(57);
} 

}