import java.util.ArrayList;

public class Priority extends Runable{
    private ArrayList<Process> list;

    public Priority(Simulator simulator){
        list = new ArrayList<Process>();
        this.simulator = simulator;
        current = null;
    }

    public void queue(Process process){
        if(list.isEmpty()){
            list.add(process);
            return;
        }
        Process tmp;
        for(int i = 0; i < list.size(); i++){
            tmp = list.elementAt(i);
            if(tmp.getPriority() > process.getPriority()){
                list.add(i,process);
                return;
            }
        }
        list.add(process);
    }

    public ArrayList<Results> run(){
    }
}
