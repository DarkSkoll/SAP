import java.util.ArrayList;

public class Simulator{
    public ArrayList<Process> procesos;
    public int time;
    public Process current;
    public Runable algoritmo;

    public Simulator(ArrayList<Process> procesos){
        this.procesos = procesos;
        time = 0;
        current = null;
    }

    public void compute(){
        time++;
        if(current == null) return;
        current.compute();
    }

    public void ordenarPorLlegada(){
        int min;
        Process tmp;
        for(int i = 0; i < procesos.size(); i++){
            min = i;
            for(int j = i; j < procesos.size(); j++){
                if(procesos.get(j).getArriveTime() < procesos.get(min).getArriveTime()){
                    min = j;
                }
            }
            tmp = procesos.set(i,procesos.get(min));
            procesos.set(min,tmp);
        }
    }

    public void recibirProcesos(){
        Process tmp;
        for(int i = 0; i < procesos.size(); i++){
            tmp = procesos.get(i);
            if(tmp.getArriveTime() == time){
                algoritmo.encolar(tmp);
            }
        }
    }

    public boolean isFinish(){
        Process tmp;
        for(int i = 0; i < procesos.size(); i++){
            tmp = procesos.get(i);
            if(!tmp.isDone()) return false;
        }
        return true;
    }

    public void calcularResultados(){
        float output = 0;
        float response = 0;
        float waste = 0;
        float penalty = 0;
        float wait = 0;
        Process tmp;
        for(int i = 0; i < procesos.size(); i++){
            tmp = procesos.get(i);
            tmp.calculate();
            output += tmp.getOutput();
            response += tmp.getResponse();
            waste += tmp.getWaste();
            penalty += tmp.getPenalty();
            wait += tmp.getWait();
        }
        procesos.add(new Process("Total",output,response,waste,penalty,wait));
        output /= (procesos.size()-1);
        response /= (procesos.size()-1);
        waste /= (procesos.size()-1);
        penalty /= (procesos.size()-1);
        wait /= (procesos.size()-1);
        procesos.add(new Process("Promedio",output,response,waste,penalty,wait));
    }

    public void reset(){
        current = null;
        time = 0;
        for(int i = 0; i < procesos.size(); i++){
            procesos.get(i).reset();
        }
    }

    public void start(){
        reset();
        algoritmo = new FCFS(this);
        algoritmo.run();
        calcularResultados();
    }
}
