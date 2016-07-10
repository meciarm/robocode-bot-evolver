# robocode-bot-evolver
This is simple JAVA program for evolving RoboCode bots with Evolutionary Algorithms (only GA implemented so far, but you can easily implement other EA).

I made this project in haste for my homework in Evolutionary Robotics, but I decided to push it here since someone might find it useful one day.

# To run project as it is you need to: 

0. have 5-15 min 
1. download RoboCode from http://robocode.sourceforge.net/
2. download and install Eclipse (!you need JAVA JDK due to specification of RoboCode!)
3. change variables to corresponding RoboCode folder in your system
    - `EvolRobot.BattleRunner._robocodeEngineLocation`
    - `EvolRobot.BotCompiler._path`
    - `EvolRobot.BotCompiler._package`
    - `EvolRobot.BotCompiler._jar` 
4. change `Project->Properties->Java Build Path->robocode.jar->Edit...` to corresponding `robocode.jar` in your system
5. add your training enemies in `EvolRobot.Runner._defaultOpponents` (!don't forget to write bots name with the package!)
6. set name for your bots in `EvolRobot.Runner.main` method
7. run project

# To implement your own EA you need to:

0. get project working (look up)
1. extend abstract class `EvolRobot.Bot` (see class `GABot.GA_Bot`)
2. extend abstract class `EvolRobot.BotMaster` (see class `GABot.GA_Master`)
3. adjust `EvolRobot.Runner.main` method to use your `BotMaster`

# Additional information

During development I used Win7, jdk1.8.0_31, robocode1.9.2.5 

I used some source code and inspiration from following projects: 

* https://github.com/tbh1/robocode-gp
* https://github.com/SaBart/robo_jgap
