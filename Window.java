import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class Window{
    private JFrame window;
    private JLabel title;
    private ResultsTableGui results;

    public Window(){
        window = new JFrame();
        title = new JLabel();
        results = new ResultsTableGui();
    }

    private void setDefaultWindowsProperties(){
        window.setSize(1600,900);
        window.setLayout(null);
        window.setVisible(true);
        window.getContentPane().setBackground(Color.black);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setDefaultTitleProperties(){
        title.setText("Simulador de Algoritmos Planificadores");
        title.setBounds(0,0,1500,100);
        title.setForeground(Color.white);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setFont(new Font("Mono", Font.BOLD, 36));
    }

    private void setDefaultResultsTableProperties(){
        results.setDefaults();
        results.setBounds(50,500,1500,350);
    }

    private void addWindowsElements(){
        window.add(title);
        window.add(results);
    }

    public void createWindow(){
        setDefaultWindowsProperties();
        setDefaultTitleProperties();
        setDefaultResultsTableProperties();
        addWindowsElements();
    }
}
