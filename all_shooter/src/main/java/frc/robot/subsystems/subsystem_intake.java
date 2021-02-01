package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;


public class subsystem_intake extends SubsystemBase {
    /** Creates a new ExampleSubsystem. */
   private final WPI_VictorSPX motor = new WPI_VictorSPX(3);
   private final WPI_VictorSPX motor1 = new WPI_VictorSPX(1);
   private final WPI_VictorSPX motor4 = new WPI_VictorSPX(4);  
   private final WPI_VictorSPX motor5 = new WPI_VictorSPX(5);  
    public void shooter2 () {
      motor1.set(ControlMode.PercentOutput,-0.8);
    }
    public void shooter(){
      motor5.set(ControlMode.PercentOutput,-0.8);
      motor4.set(ControlMode.PercentOutput,0.8);
    }
    public void intake(){
      motor.set(ControlMode.PercentOutput,-0.8);
    }
    public void end1(){
      motor.set(ControlMode.PercentOutput,-0.0);
    }
    public void end2(){
      motor1.set(ControlMode.PercentOutput,-0.0);
    }
    public void end3(){
      motor4.set(ControlMode.PercentOutput,-0.0);
      motor5.set(ControlMode.PercentOutput,-0.0);
    }
}
