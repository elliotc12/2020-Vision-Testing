package frc.commands;

import edu.wpi.first.wpilibj.command.Command;

public class PrintValCommand extends Command {

    String value;

    public PrintValCommand(String value) {
        
        this.value = value;
    }

    @Override
    protected void initialize() {
        System.out.println("Initializing");
    }

    @Override
    protected void execute() {
        System.out.println(value);
    }

    @Override
    protected boolean isFinished() {
        return true;
    }
}
