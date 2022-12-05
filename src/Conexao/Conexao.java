package Conexao;

import java.sql.*;
/**
 *
 * @author teclab
 */
public class Conexao {
   public static Connection conectar(){
       Connection conexao;
       String driver ="com.mysql.cj.jdbc.Driver";
       String url = "jdbc:mysql://localhost:3306/ordem_servico?useTimezone=true&serverTimezone=UTC&useSSL=false";
       String user ="root";
       String passWord = "root";
       try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, passWord);
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }
   } 
   }
