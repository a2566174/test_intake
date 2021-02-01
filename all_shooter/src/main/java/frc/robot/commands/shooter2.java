package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.subsystem_intake;

/**
 * An example command that uses an example subsystem.
 */
public class shooter2 extends CommandBase {
  private subsystem_intake shooter2 ;

    public shooter2(subsystem_intake m_shooter2) {
    shooter2 = m_shooter2;
    addRequirements(m_shooter2);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      //button2
      shooter2.shooter2();
   
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
   shooter2.end2();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}