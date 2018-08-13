
package br.com.app_arquitetura.dal;
import java.sql.*;
/**
 *
 * @author gardh
 */
public class Modulo_conexao {
    
    // faz a conexao com banco mysql
    public static Connection conector(){
        java.sql.Connection cnx = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/usuario"+"?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String senha = "";

        try {
            Class.forName(driver);
            cnx = DriverManager.getConnection(url,user,senha);
            return cnx;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }
}
