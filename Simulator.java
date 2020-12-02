import java.util.ArrayList;

public class Simulator{
    private int time;
    private ArrayList<Process> procesos;
    private ArrayList<Results> resultados;
    private Runable algoritmo;

    public Simulator(ArrayList<Process> processes){
        this.procesos = procesos;
        time = 0;
    }

    public int getTime(){
        return time;
    }

    public void orderProcessByArriveTime(){
        int min;
        Process tmp;
        for(int i = 0; i < procesos.size(); i++){
            min = i;
            for(int j = 0; j < procesos.size(); j++){
                if(procesos.get(j).getArriveTime() < procesos.get(min).getArriveTime()){
                    min = j;
                }
            }
            tmp = procesos.get(i);
            procesos.set(i,procesos.get(min));
            procesos.set(min,tmp);
        }
    }

    public void compute(Process process){
        time++;
        process.compute();
    }

    public void start(){
    }

    /*public void selectAlgorithm(int option){
        switch(option){
            case 1:
                algorithm = new FCFC(this);
                break;
            case 2:
                algorithm = new SJF(this);
                break;
            case 3:
                algorithm = new SRT(this);
                break;
            case 4:
                algorithm = new RoundRobin(this);
                break;
            case 5:
                algorithm = new Priority(this);
                break;
            case default:
                algorithm = null;
                break;
        }
    }*/
}
