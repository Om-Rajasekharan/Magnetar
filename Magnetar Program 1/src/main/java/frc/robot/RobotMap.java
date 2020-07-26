package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.ScorpionTail;

public class RobotMap {
    public RobotMap(){

    }  
    public static int leftMasterid = 1;
    public static int rightMasterid = 3;
    public static int leftFollowerid = 2;
    public static int rightFollowerid = 4;
    public static int tailMotorid = 6;
    public static int intakeMotorid = 5;
    public static DoubleSolenoid shifter =new DoubleSolenoid(0, 7);
    public static DoubleSolenoid intakePiston =new DoubleSolenoid(2, 5);
    public static DoubleSolenoid catapult =new DoubleSolenoid(1, 6);
    public static DoubleSolenoid catapultRelease =new DoubleSolenoid(3, 4);
    public static TalonSRX leftMaster =new TalonSRX(leftMasterid);
    public static TalonSRX rightMaster =new TalonSRX(rightMasterid);
    public static TalonSRX leftFollower =new TalonSRX(leftFollowerid);
    public static TalonSRX rightFollower =new TalonSRX(rightFollowerid);
    public static TalonSRX tailMotor =new TalonSRX(tailMotorid);
    public static TalonSRX intakeMotor =new TalonSRX(intakeMotorid);




public static DriveTrain driveTrain =new DriveTrain();
public static ScorpionTail scorpionTail =new ScorpionTail();
public static Intake intake =new Intake(); 
}
