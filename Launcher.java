import java.util.ArrayList;

public class Launcher{
    public static void main(String[] args) {
        Loader cargador = new Loader("ejercicio1.txt");
        Window ventana = new Window();
        ventana.createWindow();
        ArrayList<Process> procesos = null;
        try{
            procesos = cargador.cargarProcesos();
        }catch(Exception e){
            System.out.println("Error al cargar archivo");
        }
        if(procesos == null) return;
        Simulator simulador = new Simulator(procesos);
        for(int i = 0; i < procesos.size(); i++){
            System.out.println(procesos.get(i).toString());
        }
        simulador.ordenarPorLlegada();
        for(int i = 0; i < procesos.size(); i++){
            System.out.println(procesos.get(i).toString());
        }
        simulador.start();
        for(int i = 0; i < procesos.size(); i++){
            procesos.get(i).imprimir();
        }
    }
}
