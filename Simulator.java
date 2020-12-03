import java.util.ArrayList;

public class Simulator{
    public ArrayList<Process> procesos;
    private ArrayList<Results> resultados;
    private int time;
    private Process current;

    public Simulator(ArrayList<Process> procesos){
        this.procesos = procesos;
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

    public void calcularPromedio(){
        float output = 0;
        float response = 0;
        float waste = 0;
        float penalty = 0;
        float wait = 0;
        Results tmp;
        for(int i = 0; i < resultados.size(); i++){
            tmp = resultados.get(i);
            output += tmp.getOutput();
            response += tmp.getResponse();
            waste += tmp.getWaste();
            penalty += tmp.getPenalty();
            wait += tmp.getWait();
        }
        resultados.add(new Results("Total",output,response,waste,penalty,wait));
        output /= resultados.size();
        response /= resultados.size();
        waste /= resultados.size();
        penalty /= resultados.size();
        wait /= resultados.size();
        resultados.add(new Results("Promedio",output,response,waste,penalty,wait));
    }

    public void reset(){
        current = null;
        time = 0;
        resultados = new ArrayList<Results>();
        for(int i = 0; i < procesos.size(); i++){
            procesos.get(i).reset();
        }
    }
}
