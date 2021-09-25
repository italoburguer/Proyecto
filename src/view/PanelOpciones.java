package view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.GridLayout;

public class PanelOpciones extends JPanel{
    public static final String BTN_SALDO = "VER SALDO";
    public static final String BTN_CARGAR = "CARGAR";

    private JButton btnSaldo;
    private JButton btnCargar;

    public PanelOpciones(Interfaz interfaz) {
        super();
        setLayout(new GridLayout(1,2));
        setBorder(new TitledBorder("Opciones"));
        btnSaldo = new JButton();
        btnCargar = new JButton();

        add(btnCargar);
        add(btnSaldo);
        
    }
}
