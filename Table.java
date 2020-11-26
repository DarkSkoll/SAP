import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;

public class Table extends JTable{
    public Table(int rows,int columns){
        super(rows,columns);
    }

    public void setDefaults(){
        this.setEnabled(false);
    }
}
