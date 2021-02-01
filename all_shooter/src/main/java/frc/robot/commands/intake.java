package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.subsystem_intake;

/**
 * An example command that uses an example subsystem.
 */
public class intake extends CommandBase {
  private subsystem_intake intake ;

    public intake(subsystem_intake m_intake) {
    intake = m_intake;
    addRequirements(m_intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intake.intake();
    }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
   
  intake.end1();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}