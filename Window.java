import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class Window{
    private JFrame window;
    private Table table;
    private JLabel title;

    public Window(){
        window = new JFrame();
        table = new Table(6,20);
        title = new JLabel("Simulador de Algoritmo de Planificación SAP");
    }

    private void setDefaultWindowsProperties(){
        window.setSize(1600,900);
        window.setLayout(null);
        window.setVisible(true);
        window.getContentPane().setBackground(Color.black);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setTableProperties(){
        table.setDefaults();
        table.setBounds(20,110,1560,300);
        table.setEnabled(false);
    }

    private void setDefaultTitleProperties(){
        title.setBounds(0,20,1600,100);
        title.setForeground(Color.white);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setFont(new Font("Mono", Font.BOLD, 36));
    }

    private void addWindowsElements(){
        window.add(title);
        window.add(table);
    }

    public void createWindow(){
        setDefaultWindowsProperties();
        setTableProperties();
        setDefaultTitleProperties();
        addWindowsElements();
    }
}
