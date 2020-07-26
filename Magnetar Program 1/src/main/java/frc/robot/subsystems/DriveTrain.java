package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.OI;
import frc.robot.RobotMap;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */

   public static OI oi = new OI();

  public DriveTrain() {
      


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void teleopPeriodic(){

      tankDrive();
  }
  public void tankDrive(){
    double turn;
    double leftPower;
    double rightPower;
    double finalRight;
    double finalLeft;
 
    if(Math.abs(oi.driverController.getRawAxis(4)) > 0.1) {
      turn = (oi.driverController.getRawAxis(4));
    }
    else {
        turn = 0; 
    }
    leftPower = OI.driverController.getRawAxis(1)-turn;
    rightPower = OI.driverController.getRawAxis(1)+turn;
    if(Math.abs(leftPower) > 1){
      finalRight = rightPower / Math.abs(leftPower);
      finalLeft = leftPower / Math.abs(leftPower);
    }
    else if(Math.abs(rightPower) > 1){
      finalRight = rightPower / Math.abs(rightPower);
      finalLeft = leftPower / Math.abs(rightPower);
    }
    else{
      finalRight = rightPower;
      finalLeft = leftPower;
    }
    
    
  
      if(Math.abs(oi.driverController.getRawAxis(1)) > 0.1) {
          RobotMap.rightMaster.set(ControlMode.PercentOutput,finalRight);
          RobotMap.leftMaster.set(ControlMode.PercentOutput,finalLeft);
      }
      else {
          RobotMap.rightMaster.set(ControlMode.PercentOutput,turn);
          RobotMap.leftMaster.set(ControlMode.PercentOutput,-turn);
      }
      if(OI.driverController.getBumper(Hand.kLeft)){
       RobotMap.shifter.set(Value.kForward);
      }
      else if(OI.driverController.getBumper(Hand.kRight)){
        RobotMap.shifter.set(Value.kReverse);
      }
      

     
      }


      


      
      }
      

      