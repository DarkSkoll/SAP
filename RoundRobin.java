import java.util.ArrayList;
import java.util.Stack;

public class RoundRobin extends Runable{
    private Stack<Process> stack;
    private int quantum;

    public RoundRobin(Simulator simulator){
        this.simulator = simulator;
        stack = new Stack<Process>();
        current = null;
        quantum = 0;
    }

    public void setQuantum(int quantum){
        this.quantum = quantum;
    }

    public void queue(Process process){
        stack.push(process);
    }

    public ArrayList<Results> run(){
    }
}
