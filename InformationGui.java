import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;

public class InformationGui extends JPanel{
    private JLabel mesageActual;
    private JLabel mesageCola;
    private JLabel mesageUltimo;
    private JLabel tiempo;
    private JLabel procesoActual;
    private JLabel procesoCola;
    private JLabel procesoUltimo;
    private JLabel conteoTiempo;

    public InformationGui(){
        super();
        mesageActual = new JLabel("Proceso actual:");
        mesageCola = new JLabel("Siguien proceso:");
        mesageUltimo = new JLabel("Ultimo en llegar:");
        tiempo = new JLabel("Tiempo:");
        procesoActual = new JLabel();
        procesoCola = new JLabel();
        procesoUltimo = new JLabel();
        conteoTiempo = new JLabel();
    }

    public void setLabelActual(String actual){
        procesoActual.setText(actual);
    }

    public void setLabelCola(String cola){
        procesoCola.setText(cola);
    }

    public void setLabelUltimo(String ultimo){
        procesoUltimo.setText(ultimo);
    }

    public void setLabelTiempo(String tiempo){
        conteoTiempo.setText(tiempo);
    }

    public void setDefaults(){
        this.setBackground(Color.black);
        mesageActual.setBounds(0,0,200,30);
        mesageCola.setBounds(0,30,200,30);
        mesageUltimo.setBounds(0,60,200,30);
        tiempo.setBounds(0,90,200,30);
        procesoActual.setBounds(200,0,200,30);
        procesoCola.setBounds(200,30,200,30);
        procesoUltimo.setBounds(200,60,200,30);
        conteoTiempo.setBounds(200,90,200,30);
        mesageActual.setForeground(Color.white);
        mesageCola.setForeground(Color.white);
        mesageUltimo.setForeground(Color.white);
        tiempo.setForeground(Color.white);
        procesoActual.setForeground(Color.white);
        procesoCola.setForeground(Color.white);
        procesoUltimo.setForeground(Color.white);
        conteoTiempo.setForeground(Color.white);
        this.setLayout(null);
        this.add(mesageActual);
        this.add(mesageCola);
        this.add(mesageUltimo);
        this.add(tiempo);
        this.add(procesoActual);
        this.add(procesoActual);
        this.add(procesoActual);
        this.add(conteoTiempo);
    }
}
