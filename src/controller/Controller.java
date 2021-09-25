package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Owner;
import services.JavaMySQLService;

public class Controller {
    
    private ArrayList<Owner> owners;

    public Controller() {
        super();
        owners = new ArrayList<>();
        dbservice = new JavaMySQLService();
        checkDBConnection();

    }

    public ArrayList<Owner> getOwners() {
        return owners;
    }
    public void checkDBConnection(){
        if (dbService.getConnect().isValid(30)){
            fillUserData(dbservice.getUsersDB());
        }
    }

    public void fillUserData(ResultSet rs){

        try {
            while (rs.next()){
                Owner owner;
                try {
                    owner = new Owner(rs.getString("name"));
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                owners.add(owner);

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void addOwner(String nombre) {
        Owner cliente = new Owner(nombre);
        owners.add(cliente);
        dbService.insertUser(nombre);
    }

    public String listarClientes(){
        String listado = "";
        for (Owner cliente : owners) {
            listado += "Nombre: "+cliente.getNombre() + "\n";
        }
        return listado;
    }
    

}
