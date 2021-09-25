package view;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controller.Controller;

public class Interfaz extends JFrame implements ActionListener {
    private PanelOpciones panelOpciones;
    private PanelClientes panelClientes;
    private Controller controlador;
public Interfaz() {
    super();
    setSize(600,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Wallet");
    setLayout(new BorderLayout());
    panelOpciones = new PanelOpciones(this);
    panelClientes = new PanelClientes(this);

    controlador = new Controller;

    add(panelOpciones, BorderLayout.SOUTH);
    add(panelOpciones, BorderLayout.CENTER);
    add(panelOpciones);
}

    public static void main(String[] args) {
        Interfaz i = new Interfaz();
        i.setVisible(true);

    }

    public void updateListClientes(){
        panelClientes.updateListClientes(controlador.getlist)
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
