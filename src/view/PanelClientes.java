package view;
import javax.swing.JList;
import javax.swing.JPanel;

public class PanelClientes extends JPanel {

    private Interfaz interfaz;

    private JList<String> listaClientes;

    public PanelClientes(Interfaz i){
super();
interfaz = i;
String[] nombres = {"Juan","Ana","Pedro"};
listaClientes = new JList<>(nombres);
add(listaClientes);

    }

    
}
 