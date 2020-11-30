import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;

public class Window{
    private JFrame window;
    private JLabel title;
    private JLabel mensajeUltimo;
    private JLabel mensajeCola;
    private JLabel mensajeActual;
    private JLabel procesoUltimo;
    private JLabel procesoCola;
    private JLabel procesoActual;
    private JTable calculos;

    public Window(){
        window = new JFrame();
        title = new JLabel("Simulador de Algoritmo de Planificación SAP");
        mensajeUltimo = new JLabel("Ultimo Proceso en Llegar: ");
        mensajeCola = new JLabel("Siguiente Proceso en Pasar: ");
        mensajeActual = new JLabel("Proceso Actual: ");
        procesoUltimo = new JLabel();
        procesoCola = new JLabel();
        procesoActual = new JLabel();
        calculos = new JTable(8,10);
    }

    private void setDefaultWindowsProperties(){
        window.setSize(1600,900);
        window.setLayout(null);
        window.setVisible(true);
        window.getContentPane().setBackground(Color.black);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setDefaultTitleProperties(){
        title.setBounds(0,20,1600,100);
        title.setForeground(Color.white);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setFont(new Font("Mono", Font.BOLD, 36));
    }

    private void setDefaultMensajesProperties(){
        mensajeUltimo.setBounds(50,130,300,130);
        mensajeUltimo.setForeground(Color.white);
        mensajeUltimo.setFont(new Font("Mono",Font.BOLD,16));
        mensajeCola.setBounds(50,130,300,90);
        mensajeCola.setForeground(Color.white);
        mensajeCola.setFont(new Font("Mono",Font.BOLD,16));
        mensajeActual.setBounds(50,130,300,50);
        mensajeActual.setForeground(Color.white);
        mensajeActual.setFont(new Font("Mono",Font.BOLD,16));
        procesoUltimo.setBounds(350,130,300,130);
        procesoUltimo.setForeground(Color.white);
        procesoUltimo.setFont(new Font("Mono",Font.BOLD,16));
        procesoCola.setBounds(350,130,300,90);
        procesoCola.setForeground(Color.white);
        procesoCola.setFont(new Font("Mono",Font.BOLD,16));
        procesoActual.setBounds(350,130,300,50);
        procesoActual.setForeground(Color.white);
        procesoActual.setFont(new Font("Mono",Font.BOLD,16));
    }

    private void setDefaultCalculosProperties(){
        calculos.setEnabled(false);
        calculos.setBounds(50,420,1500,400);
        calculos.setRowHeight(50);
        calculos.setPreferredScrollableViewportSize(new Dimension(1500,400));
        calculos.setFillsViewportHeight(true);
        calculos.setValueAt("Proceso",0,0);
        calculos.setValueAt("Tiempo Llegada",0,1);
        calculos.setValueAt("Duración de Ráfaga",0,2);
        calculos.setValueAt("Tiempo de Arranque",0,3);
        calculos.setValueAt("Tiempo de Finalización",0,4);
        calculos.setValueAt("Tiempo de Retorno",0,5);
        calculos.setValueAt("Tiempo de Respuesta",0,6);
        calculos.setValueAt("Tasa de Desperdicio",0,7);
        calculos.setValueAt("Tasa de Penalización",0,8);
        calculos.setValueAt("Tiempo de Espera",0,9);
    }

    private void addWindowsElements(){
        window.add(title);
        window.add(mensajeUltimo);
        window.add(mensajeCola);
        window.add(mensajeActual);
        window.add(calculos);
    }

    public void createWindow(){
        setDefaultWindowsProperties();
        setDefaultTitleProperties();
        setDefaultMensajesProperties();
        setDefaultCalculosProperties();
        addWindowsElements();
    }
}
