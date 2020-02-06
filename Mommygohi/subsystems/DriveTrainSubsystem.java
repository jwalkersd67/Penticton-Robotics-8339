//package ?;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.robot.RobotMap;

public class DriveTrainSubsystem extends Subsystem {
  Talon leftFrontMotor, rightFrontMotor, leftBackMotor, rightBackMotor;
  RobotDrive drive;
  
  public DriveTrain() {
    leftFrontMotor = new Talon(RobotMap.leftFrontTalon);
    rightFrontMotor = new Talon(RobotMap.rightFrontTalon);
    leftBackMotor = new Talon(RobotMap.leftBackTalon);
    rightBackMotor = new Talon(RobotMap.rightBackTalon);
    
    drive = new RobotDrive(leftFrontMotor, leftBackMotor, rightFrontMotor, rightBackMotor);
  }
  
  public void arcadeDrive(double x, double y){
    drive.arcadeDrive(x, y)
  }
  
  public void iniDefaultCommand(){
    setDefaultCommand(new DriveTrainCommand());
  }
}
