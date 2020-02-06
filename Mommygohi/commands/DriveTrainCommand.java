//package ?;

import edu.wpi.first.wpilibj.command.Command;
//import Robot

public class DriveTrainCommand extends Command {
  
  public DriveTrainCommand(){
    requires(Robot.DriveTrainSub);
  }
  
  protected void initialize(){
    
  }
  
  protected void execute(){
    Robot.DriveTrainSub.arcadeDrive(Robot.oi.Driver.getRawAxis(1), Robot.oi.Driver.getRawAxis(4));
  }
  
  protected boolean isFinished(){
    return false;
  }
  
  protected void end(){
    
  }
  
  protected void interrupted(){
    
  }
}
