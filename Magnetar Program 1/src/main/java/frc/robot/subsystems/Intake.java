/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.OI;
import frc.robot.RobotMap;

public class Intake extends SubsystemBase {
  /**
   * Creates a new Intake.
   */
  public Intake() {

  }

  @Override
  public void periodic() {
    
    
    // This method will be called once per scheduler run
  }
  public void teleopPeriodic() {
    if(OI.driverController.getRawAxis(3) > 0.5){
      RobotMap.intakePiston.set(Value.kReverse);
      RobotMap.intakeMotor.set(ControlMode.PercentOutput, 0.8);
    }
    else if(OI.driverController.getRawAxis(2) > 0.5){
      RobotMap.intakeMotor.set(ControlMode.PercentOutput, -0.5);
    }
    else {
      RobotMap.intakePiston.set(Value.kForward);
      RobotMap.intakeMotor.set(ControlMode.PercentOutput, 0);
    }

  }
}
