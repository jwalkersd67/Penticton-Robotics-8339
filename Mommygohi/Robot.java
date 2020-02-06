//package ?;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.IterativeRobot;
//import DriveTrainSystem

public class Robot extends IterativeRobot {
  public static final DriveTrainSubsystem DriveTrainSub = new DriveTrainSubsystem();
  //public static OI oi;
  
  @Override
  public void robotInit(){
    oi = new OI();
  }
  
  @Override
  public void disabledInit(){
    
  }
  
  @Override
  public void disabledPeriodic(){
    Scheduler.getInstance().run();
  }
  
}
