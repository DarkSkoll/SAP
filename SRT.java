import java.util.ArrayList;

public class SRT extends Runable{
    private ArrayList<Process> queue;

    public RoundRobin(Simulator simulator){
        this.simulator = simulator;
        queue = new ArrayList<Process>();
        current = null;
    }

    public void queue(Process process){
        if(queue.isEmpty()){
            queue.add(process);
            return;
        }
        if(current != null && (current.getDuration()-current.getCpuTime()) > process.getDuration()){
            queue.add(0,current);
            current = process;
            return;
        }
        Process tmp;
        for(int i = 0; i < queue.size(); i++){
            tmp = queue.elementAt(i);
            if((tmp.getDuration()-tmp.getCpuTime()) > process.getDuration()){
                queue.add(i,process);
                return;
            }
        }
        queue.add(process);
    }

    public ArrayList<Results> run(){
    }
}
