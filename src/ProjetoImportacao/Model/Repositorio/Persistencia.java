/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoImportacao.Model.Repositorio;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author VanessaCristine
 */
public class Persistencia {

private static Statement stm;      
    
private static Connection _conexao; 

private void GetConexao() 
{
    if(_conexao == null)
    {
    /*try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
    }
    catch (ClassNotFoundException e)
    {
        JOptionPane.showMessageDialog(null, "Impossível carregar o Driver 'sun.jdbc.odbc.JdbcOdbcDriver'");
        System.exit(0);
    }*/
     try
    {
      String stringCnn = "jdbc:ucanaccess://ControlaEstoque.accdb";
      _conexao = DriverManager.getConnection(stringCnn, "", "");
      stm = _conexao.createStatement();
  }
    catch (SQLException sqle)
    {
        JOptionPane.showMessageDialog(null, "Problema ao conectar, o caminho do banco deve ser C:\\DB\\ControlaEstoque.accdb");
        System.exit(0);
    }
    }
 } 
 
private void Desconectar()
{
    try
    {
        _conexao.close();
        _conexao = null;
    }
    catch (SQLException sqle)
    {
        JOptionPane.showMessageDialog(null, "Problema ao desconectar!");
        System.exit(0);
    }
}

public void ExecutaComando(String sqlString)
{
    try
    {   GetConexao();
        stm.execute(sqlString);
    }
    catch (SQLException sqle)
    {
        JOptionPane.showMessageDialog(null, "Erro ao executar comando");
        System.exit(0);
    }
    finally 
    {
        Desconectar(); 
    }
}
public ResultSet ExecutaLista(String sqlString)
{
    try
    {   GetConexao();
        return stm.executeQuery(sqlString);
    }
    catch (SQLException sqle)
    {
        JOptionPane.showMessageDialog(null, "Erro ao executar lista comando");
        System.exit(0);
        return null;
    }
    finally
    {
        Desconectar();
    }
   
}

}

  