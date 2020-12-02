import java.util.ArrayList;

public class SJF extends Runable{
    private ArrayList<Process> list;

    public SJF(Simulator simulator){
        this.simulator = simulator;
        list = new ArrayList<Process>();
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
            if(tmp.getDuration() > process.getDuration()){
                list.add(i,process);
                return;
            }
        }
        list.add(process);
    }

    public ArrayList<Results> run(){
    }
}
