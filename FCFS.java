import java.util.ArrayList;
import java.util.AbstractQueue;

public class FCFS extends Runable{
    private AbstractQueue<Process> queue;

    public FCFS(Simulator simulator){
        this.simulator = simulator;
        queue = new AbstractQueue<Process>();
        current = null;
    }

    public void queue(Process process){
        queue.add(process);
    }

    public ArrayList<Results> run(){
    }
}
