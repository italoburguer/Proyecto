package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Conector {
    private Connection connect;

    public Conector(String url) {

        super();
        connectDB(url);
        
    }

    public ResultSet getReq1DB() {
        String sql = "SELECT SUM(CANTIDAD) AS total,ID_Proyecto, Pagado, Proveedor FROM `COMPRA` WHERE `PAGADO` = 'No' GROUP BY ID_PROYECTO HAVING total > 50";
        return executeQuery(sql);
    }

    public ResultSet getReq2DB() {
        String sql = "SELECT Tipo.Estrato ,Proyecto.Fecha_Inicio, Tipo.Financiable, Proyecto.Porcentaje_Cuota_Inicial FROM Tipo, Proyecto WHERE Proyecto.ID_Tipo = Tipo.ID_Tipo AND Proyecto.Porcentaje_Cuota_Inicial  >=0.3 AND Tipo.Estrato >= 5 AND Tipo.Financiable = 0 ORDER BY Fecha_Inicio ";
        return executeQuery(sql);
    }

    public ResultSet getReq3DB() {
        String sql = "SELECT Proyecto.ID_Proyecto, Compra.Pagado, Proyecto.Clasificacion FROM MaterialConstruccion, Compra, Proyecto WHERE MaterialConstruccion.Importado = 'Si' AND Compra.ID_MaterialConstruccion = MaterialConstruccion.ID_MaterialConstruccion AND Proyecto.ID_Proyecto = Compra.ID_Proyecto AND Compra.Pagado IN ('Parcialmente','No')AND Proyecto.Clasificacion IN ('Apartamento','Apartaestudio') AND Proyecto.Acabados = 'No' GROUP BY Proyecto.ID_Proyecto";
        return executeQuery(sql);
    }
    
    public Connection connectDB(String url) {
        try {
         
        
            connect = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println("e.getMessage()");
        }
        return connect;
    }

    public ResultSet executeQuery(String sql) {
        ResultSet rs = null;
        try {
            Statement stmt = connect.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}