import java.util.ArrayList;

public class FCFS implements Runable{
    private ArrayList<Process> cola;
    private Simulator simulador;

    public FCFS(Simulator simulador){
        this.simulador = simulador;
        cola = new ArrayList<Process>();
    }

    public void encolar(Process proceso){
        cola.add(proceso);
    }

    public void run(){
        do{
            simulador.recibirProcesos();
            if(simulador.current == null && !cola.isEmpty()){
                simulador.current = cola.remove(0);
                simulador.current.setStartTime(simulador.time);
            }
            simulador.compute();
            if(simulador.current != null){
                if(simulador.current.isDone()){
                    simulador.current.setEndTime(simulador.time);
                    simulador.current = null;
                }
            }
        }while(!simulador.isFinish());
    }
}
