import java.util.ArrayList;

public class Launcher{
    public static void main(String[] args) {
        Loader cargador = new Loader("ejercicio1.txt");
        ArrayList<Process> procesos = null;
        try{
            procesos = cargador.cargarProcesos();
        }catch(Exception e){
            System.out.println("Error al cargar archivo");
        }
        if(procesos == null) return;
    }
}
