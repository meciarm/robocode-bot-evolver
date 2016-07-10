package robotevolution;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;


public class GATest_27_0 extends AdvancedRobot { 
 

public void run() { 

while(true) {turnGunLeft(53);
ahead(19);

back(0);
 } 
} 


	public void onScannedRobot(ScannedRobotEvent e) { 
 
fire(91%4);
turnGunRight(91);
ahead(35);
back(3);
} 

public void onHitByBullet(HitByBulletEvent e) { 

turnGunRight(46);

turnRight(6);
turnRight(54);
} 

public void onHitWall(HitWallEvent e) { 

turnGunLeft(90);
fire(12%4);
turnRight(46);
ahead(27);
} 

public void onHitRobot(HitWallEvent e) { 

turnGunLeft(47);

turnRadarRight(10);
turnRadarLeft(54);
} 

}