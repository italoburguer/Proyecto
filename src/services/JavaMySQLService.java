package services;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import  java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import java.sql.Statement;

public class JavaMySQLService {

    private Connection connect;
    private String url;
    private String user;
    private String password;

    public

    public void getDBProperties(){
        try {
            InputStream ins = new FileInputStream("./data/db.properties");
            Properties prop = new Properties();
        prop.load(ins);
        url = prop.getProperty("url");
        user = prop.getProperty("user");
        password = prop.getProperty("password");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }
    
    public void connectDB(){

        try {
            connect = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void insertUser(String nombre){

    String sql = "INSERT INTO `users`( `name`, `user_status`) VALUES ("+nombre+",1)";
    Statement stmt = connect.createStatement();
    stmt.executeUpdate(sql);
    }
    
}
public void getUsersDB() {
    ResultSet rs = null;
    String sql = "SELECT * FROM users";
    Statement stmt = connect.createStatement();
    
}
