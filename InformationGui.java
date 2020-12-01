import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;

public class InformationGui extends JPanel{
    private JLabel mesageActual;
    private JLabel mesageCola;
    private JLabel mesageUltimo;
    private JLabel procesoActual;
    private JLabel procesoCola;
    private JLabel procesoUltimo;

    public InformationGui(){
        super();
        mesageActual = new JLabel("Proceso actual:");
        mesageCola = new JLabel("Siguien proceso:");
        mesageUltimo = new JLabel("Ultimo en llegar:");
        procesoActual = new JLabel();
        procesoCola = new JLabel();
        procesoUltimo = new JLabel();
    }

    public void setDefaults(){
        this.setBackground(Color.black);
        mesageActual.setBounds(0,0,200,30);
        mesageCola.setBounds(0,30,200,30);
        mesageUltimo.setBounds(0,60,200,30);
        procesoActual.setBounds(200,0,200,30);
        procesoCola.setBounds(200,30,200,30);
        procesoUltimo.setBounds(200,60,200,30);
        mesageActual.setForeground(Color.white);
        mesageCola.setForeground(Color.white);
        mesageUltimo.setForeground(Color.white);
        procesoActual.setForeground(Color.white);
        procesoCola.setForeground(Color.white);
        procesoUltimo.setForeground(Color.white);
        this.setLayout(null);
        this.add(mesageActual);
        this.add(mesageCola);
        this.add(mesageUltimo);
        this.add(procesoActual);
        this.add(procesoActual);
        this.add(procesoActual);
    }
}
