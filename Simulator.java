import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Simulator{
    public ArrayList<Process> procesos;
    public int time;
    public Process current;
    private Process total;
    private Process promedio;
    private Runable algoritmo;
    private InformationGui info;
    private TableTimeGui timeTable;
    private ResultsTableGui resultados;

    public Simulator(ArrayList<Process> procesos){
        this.procesos = procesos;
        time = 0;
        current = null;
        promedio = null;
        total = null;
    }

    public void setInfo(InformationGui info){
        this.info = info;
    }

    public void setTimeTable(TableTimeGui timeTable){
        this.timeTable = timeTable;
    }

    public void setResultados(ResultsTableGui resultados){
        this.resultados = resultados;
    }

    public void compute(){
        time++;
        if(current == null) return;
        current.compute();
        timeTable.table.setValueAt(current.getId(),2,((time-1)*2+1));
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
        String cell = " ";
        for(int i = 0; i < procesos.size(); i++){
            tmp = procesos.get(i);
            if(tmp.getArriveTime() == time){
                cell += tmp.getId()+" ";
                algoritmo.encolar(tmp);
            }
        }
        timeTable.table.setValueAt(cell,0,time*2);
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
        total = new Process("Total",output,response,waste,penalty,wait);
        output /= (procesos.size()-1);
        response /= (procesos.size()-1);
        waste /= (procesos.size()-1);
        penalty /= (procesos.size()-1);
        wait /= (procesos.size()-1);
        promedio = new Process("Promedio",output,response,waste,penalty,wait);
    }

    public void reset(){
        current = null;
        promedio = null;
        total = null;
        time = 0;
        for(int i = 0; i < procesos.size(); i++){
            procesos.get(i).reset();
        }
    }

    public void imprimir(){
        String[] tmp;
        for(int i = 0; i < procesos.size(); i++){
            tmp = procesos.get(i).imprimir();
            for(int j = 0; j < tmp.length; j++){
                resultados.table.setValueAt(tmp[j],i,j);
            }
        }
        tmp = total.imprimir();
        for(int i = 0; i < tmp.length; i++){
            resultados.table.setValueAt(tmp[i],procesos.size(),i);
        }
        tmp = promedio.imprimir();
        for(int i = 0; i < tmp.length; i++){
            resultados.table.setValueAt(tmp[i],procesos.size()+1,i);
        }
    }

    public void start(String opcion){
        reset();
        switch(opcion){
            case Nombres.fcfs:
                System.out.println("FCFS");
                algoritmo = new FCFS(this,info);
                break;
            default:
                System.out.println("Test");
                return;
        }
        algoritmo.run();
        calcularResultados();
        imprimir();
    }
}
