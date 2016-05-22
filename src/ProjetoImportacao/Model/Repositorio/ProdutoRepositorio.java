/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoImportacao.Model.Repositorio;

import ProjetoImportacao.Model.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VanessaCristine
 */
public class ProdutoRepositorio implements IRepositorio<Produto>{

    private Persistencia pers = new Persistencia();
    
    @Override
    public void Salvar(Produto item) {
        if(item.getIdProduto() == 0)
        {
           Incluir(item);   
        }
        else
        {
            Alterar(item);
        }
    }

    @Override
    public List<Produto> Listar(String[] params) {
        
        ResultSet rs = pers.ExecutaLista("SELECT * FROM PRODUTO");
        
        List<Produto> produtos = new ArrayList<>();
        Produto produto;
        
        try {
            while (rs.next()) {
                
                produto = new Produto();
                produto.setCategoria(rs.getString("Categoria"));
                produto.setIdProduto(rs.getInt("IdProduto"));
                produto.setPreco(rs.getDouble("Preco"));
                produto.setNome(rs.getString("Nome"));
                produto.setUniMedida(rs.getString("UniMedida"));
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return produtos;
    }

    @Override
    public Produto Carregar(int codigo) {
       String sql = "SELECT * FROM PRODUTO where IdProduto=" + codigo; 
       Produto produto = new Produto();
       
       ResultSet rs = pers.ExecutaLista(sql);
       try 
       {
      
       if(rs != null)
       {
           if(rs.next()){
              produto.setCategoria(rs.getString("Categoria"));
              produto.setIdProduto(rs.getInt("IdProduto"));
              produto.setPreco(rs.getDouble("Preco"));
              produto.setNome(rs.getString("Nome"));
              produto.setUniMedida(rs.getString("UniMedida"));
           }
       }
       }
       catch (SQLException ex) {
            Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
       finally{
           try {
               rs.close();
           } catch (SQLException ex) {
               Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
           }
        } 

       return produto;
    }

    @Override
    public void Remover(Produto item) {
       String sql = "DELETE FROM PRODUTO where IdProduto=" + item.getIdProduto(); 
       pers.ExecutaComando(sql);
    }
    
    private void Incluir(Produto item)
    {
        String sql = "INSERT INTO Produto(Nome,Categoria,Preco,UniMedida) VALUES ('" + item.getNome() +"','" + item.getCategoria() +"','" + item.getPreco() +"','" + item.getUniMedida() +"' )";
        pers.ExecutaComando(sql);
    }
    
    private void Alterar(Produto item)
    {
       String sql = "UPDATE PRODUTO SET Nome ='" + item.getNome() +"',Categoria='" + item.getNome() +"',Preco='" + item.getNome() +"',UniMedida='" + item.getNome() + "' where IdProduto=" + item.getIdProduto(); 
       pers.ExecutaComando(sql);
    }
}
