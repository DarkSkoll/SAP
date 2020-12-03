import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window implements ActionListener{
    private JFrame window;
    private JLabel title;
    private ResultsTableGui results;
    private TableTimeGui time;
    private InformationGui info;
    private JComboBox<String> selector;
    private JButton start;
    private Simulator simulador;

    public Window(Simulator simulador){
        window = new JFrame();
        title = new JLabel();
        results = new ResultsTableGui();
        time = new TableTimeGui();
        info = new InformationGui();
        selector = new JComboBox<String>();
        start = new JButton("Iniciar");
        this.simulador = simulador;
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
        title.setBounds(0,0,1600,100);
        title.setForeground(Color.white);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setFont(new Font("Mono", Font.BOLD, 36));
    }

    private void setDefaultSelectorProperties(){
        selector.setBounds(200,200,200,30);
        selector.addItem(Nombres.fcfs);
        selector.addItem(Nombres.sjf);
        selector.addItem(Nombres.srt);
        selector.addItem(Nombres.roundRobin);
        selector.addItem(Nombres.prioridades);
    }

    private void setDefaultStartProperties(){
        start.setBounds(400,400,200,30);
        start.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Hola");
        System.out.println(selector.getSelectedItem().toString());
    }

    private void setDefaultResultsTableProperties(){
        results.setDefaults();
        results.setBounds(50,500,1500,350);
    }

    private void setDefaultTimeProperties(){
        time.setDefaults();
        time.setBounds(850,125,700,108);
    }

    private void setDefaultInfoProperties(){
        info.setDefaults();
        info.setBounds(850,250,700,108);
    }

    private void addWindowsElements(){
        window.add(title);
        window.add(results);
        window.add(time);
        window.add(info);
        window.add(selector);
        window.add(start);
    }

    public void createWindow(){
        setDefaultWindowsProperties();
        setDefaultTitleProperties();
        setDefaultResultsTableProperties();
        setDefaultTimeProperties();
        setDefaultInfoProperties();
        setDefaultStartProperties();
        setDefaultSelectorProperties();
        addWindowsElements();
    }
}
