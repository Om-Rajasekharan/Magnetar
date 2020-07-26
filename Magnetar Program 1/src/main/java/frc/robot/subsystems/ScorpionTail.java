/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import java.util.concurrent.TimeUnit;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.OI;
import frc.robot.RobotMap;

public class ScorpionTail extends SubsystemBase {
  private boolean time = true;
  private double startTime;
  private boolean disabled = false;
  /**
   * Creates a new ScorpionTail.
   */
  public ScorpionTail() {

  }

  @Override
  public void periodic() {
  
  }
    // This method will be called once per scheduler run
  

    public void teleopPeriodic(){
      if (Math.abs(RobotMap.tailMotor.getStatorCurrent()) < 15 ) {
        if (OI.driverController.getAButton()) {
          RobotMap.tailMotor.set(ControlMode.PercentOutput, -0.3);
  
        } else if (OI.driverController.getYButton()) {
          RobotMap.tailMotor.set(ControlMode.PercentOutput, 0.3);
        }
  
        else {
          RobotMap.tailMotor.set(ControlMode.PercentOutput, 0);
  
        }
        SmartDashboard.putNumber("Tail Amperage", RobotMap.tailMotor.getStatorCurrent());
      } else if (disabled) {
        RobotMap.tailMotor.set(ControlMode.PercentOutput, 0);
        try {
          TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
      else {
        disabled = !disabled;
      }
        SmartDashboard.putNumber("Time",Timer.getFPGATimestamp());
        SmartDashboard.putBoolean("True or False", time);
        if(OI.driverController.getBButtonPressed()){ 
          time = false;
          startTime = Timer.getFPGATimestamp();
        }
        if(time==false &&Timer.getFPGATimestamp() - startTime > 1 ){
          System.out.println("hi");
  
          time = true;

}
    }
  }