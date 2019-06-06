/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemachamados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bruno
 */
public class Conexao {
    
    public static Connection con = null;
    
    public static void Conectar(){
         
        System.out.println("Conectando...");
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://149.56.248.166/aluno_aula","aluno_aluno","anhanguera");
            System.out.println("Conectado.");
        } 
        
        catch(ClassNotFoundException ex){
            System.out.println("Classe não encontrada");
        } 
        
        catch(SQLException e){
            System.out.println("e");
            throw new RuntimeException(e);
        }
        
    }
    
}
