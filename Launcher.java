import java.util.ArrayList;

public class Launcher{
    public static void main(String[] args) {
        ArrayList<Process> procesos = null;
        /*ResultsTableGui pardo;
        TableTimeGui toto;
        InformationGui toe;*/
        Process proceso;
        Simulator test = new Simulator(procesos);
        Window window = new Window(test);
        window.createWindow();
    }
}
