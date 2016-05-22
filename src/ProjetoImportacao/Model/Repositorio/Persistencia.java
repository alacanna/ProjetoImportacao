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
 * Classe para conexao com o banco de dados.
 */
public class Persistencia {

private static Statement stm;      
    
private static Connection _conexao; 

//Metodo que retorna a conexao com o bd access
private void GetConexao() 
{
    //valida se conexao ja existe
    if(_conexao == null)
    {
     try
    {
      String stringCnn = "jdbc:ucanaccess://ControlaEstoque.accdb";
      _conexao = DriverManager.getConnection(stringCnn, "", "");
      stm = _conexao.createStatement();
  }
    catch (SQLException sqle)
    {
        JOptionPane.showMessageDialog(null, "Problema ao conectar, o  banco deve estar na raiz da pasta do executavel, se estiver tente novamente.");
        System.exit(0);
    }
    }
 } 
 
//Fecha a conexao com a base de dados
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

//Metodo para execucao das intrucoes SQL "INSERT" e "UPDATE"
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
    finally // para garantir o fechamento da conexao
    {
        Desconectar(); 
    }
}
 //Metodo para execucao das intrucoes SQL "SELECT", retornando um result set.
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
    finally // garantir o fechamento da conexao
    {
        Desconectar();
    }
   
}

}

  