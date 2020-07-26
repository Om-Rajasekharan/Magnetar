package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.NeutralMode;

public class RobotConfig {
    public RobotConfig(){

    }
    public static void setStartingConfig(){
        RobotMap.leftMaster.setInverted(false);
        RobotMap.rightMaster.setInverted(true);
       RobotMap.leftFollower.set(ControlMode.Follower,RobotMap.leftMasterid);
        RobotMap.leftFollower.setInverted(InvertType.FollowMaster);
       RobotMap.rightFollower.set(ControlMode.Follower,RobotMap.rightMasterid);
        RobotMap.rightFollower.setInverted(InvertType.FollowMaster);
        RobotMap.leftMaster.setNeutralMode(NeutralMode.Coast);
        RobotMap.rightMaster.setNeutralMode(NeutralMode.Coast);
        RobotMap.leftFollower.setNeutralMode(NeutralMode.Coast);
        RobotMap.rightFollower.setNeutralMode(NeutralMode.Coast);
    }
} 