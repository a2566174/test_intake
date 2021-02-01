package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.subsystem_intake;
/**
 * An example command that uses an example subsystem.
 */
public class shooter extends CommandBase {
    private subsystem_intake shooter ;
    
    /**
     * Creates a new ExampleCommand.
     *
     * @param subsystem The subsystem used by this command.
     */
    public shooter(subsystem_intake m_shooter) {
    shooter = m_shooter;
    addRequirements(m_shooter);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    shooter.shooter();
 
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
 
  shooter.end3();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}