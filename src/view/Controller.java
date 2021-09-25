package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Controller {
    private ArrayList<Req1> req1s;
    private ArrayList<Req2> req2s;
    private ArrayList<Req3> req3s;
    private Conector conectorDB;

    public Controller(String url) {
        super();
        this.req1s = new ArrayList<>();
        this.req2s = new ArrayList<>();
        this.req3s = new ArrayList<>();
        conectorDB = new Conector(url);
        
    
     } public void req1() { 
        ResultSet consulta1 = conectorDB.getReq1DB();
        try {
            while(consulta1.next()){
                Req1 requerimiento1 = new Req1(consulta1.getInt("total"),consulta1.getInt("ID_Proyecto"),consulta1.getString("pagado"),consulta1.getString("Proveedor"));
                req1s.add(requerimiento1);
            }
        } catch (SQLException e) {
            System.out.println("ruta del error");
            e.printStackTrace();
        }
           } 
           public void req2() {
            ResultSet resultado2 = conectorDB.getReq2DB();
            try {
                while(resultado2.next()){
                    Req2 requerimiento2 = new Req2(resultado2.getInt("estrato"),resultado2.getString("Fecha_Inicio"),resultado2.getInt("financiable"),resultado2.getDouble("Porcentaje_Cuota_Inicial"));
                    req2s.add(requerimiento2);
                }
            } catch (SQLException e) {
                System.out.println("ruta del error");
                e.printStackTrace();
            }
    
        }
        public void req3() {
            ResultSet resultado3 = conectorDB.getReq3DB();
            try {
                while(resultado3.next()){
                    Req3 requerimiento3 = new Req3(resultado3.getInt("ID_Proyecto"), resultado3.getString("Pagado"), resultado3.getString("Clasificacion"));
                    req3s.add(requerimiento3); 
                }
            } catch (SQLException e) {
                System.out.println("ruta del error");
                e.printStackTrace();
            }
        }
       

    
    public void printReq1() {
        for (Req1 req1 : req1s) {
            System.out.println(req1);
        }
    }

    public void printReq2() {
        for (Req2 req2 : req2s) {
            System.out.println(req2);
        }
    }

    public void printReq3() {
        for (Req3 req3 : req3s) {
            System.out.println(req3);
        }
    }

}


