/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import javax.swing.text.StyleContext.SmallAttributeSet;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotMap;

public class Drive extends CommandBase {
  private double power;
  public Drive(double pow) { 
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    power = pow;
  }

  // Called just before this Command runs the first time
  public void initialize() {
    RobotMap.rightMaster.set(ControlMode.PercentOutput,power);
    RobotMap.leftMaster.set(ControlMode.PercentOutput,power); 

  }

  // Called repeatedly when this Command is scheduled to run
  public void execute() {
    //SmartDashboard.putNumber("targetTime", targetTime);
    //SmartDashboard.putNumber("Time",Timer.getFPGATimestamp());
    //SmartDashboard.putBoolean("true", Timer.getFPGATimestamp()>targetTime);
  }

  // Make this return true when this Command no longer needs to run execute()
  public boolean isFinished() {
    return true;
    //return Timer.getFPGATimestamp() > targetTime;
  }

  // Called once after isFinished returns true
  public void end() {
    //System.out.println("hellow");
    //RobotMap.rightMaster.set(ControlMode.PercentOutput,0);
    //RobotMap.leftMaster.set(ControlMode.PercentOutput,0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  public void interrupted() {
  }
}
