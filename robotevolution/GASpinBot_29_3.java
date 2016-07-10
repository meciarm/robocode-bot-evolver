package robotevolution;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;


public class GASpinBot_29_3 extends AdvancedRobot { 
 

public void run() { 

while(true) {turnLeft(47);
turnLeft(48);

back(67);
 } 
} 


	public void onScannedRobot(ScannedRobotEvent e) { 
 

fire(2%4);
fire(39%4);
turnGunRight(88);
} 

public void onHitByBullet(HitByBulletEvent e) { 

turnLeft(60);
turnLeft(80);

back(52);
} 

public void onHitWall(HitWallEvent e) { 

fire(68%4);
fire(12%4);
turnRight(9);

} 

public void onHitRobot(HitWallEvent e) { 

ahead(77);
turnLeft(88);
fire(90%4);

} 

}