import java.util.ArrayList;

public abstract class Runable{
    public Process current;
    public Simulator simulator;

    public abstract ArrayList<Results> run();
    public abstract void queue(Process process);
}
