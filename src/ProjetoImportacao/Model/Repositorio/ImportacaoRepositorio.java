/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoImportacao.Model.Repositorio;

import ProjetoImportacao.Model.Estoque;
import ProjetoImportacao.Model.Importacao;
import ProjetoImportacao.Model.MovimentoEstoque;
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
public class ImportacaoRepositorio implements IRepositorio<Importacao>{

    private Persistencia pers = new Persistencia();
    
    @Override
    public void Salvar(Importacao item) {
        
        String sql = "INSERT INTO Importacao(IdProduto,DtEnvio,DtRecebimento,Quantidade,CodBarras,Status) VALUES (" + item.getProduto().getIdProduto()+",'" + item.getDataEnvio()+"','" + item.getDataRecebimento()+"'," + item.getQuantidade() +"','" + item.getCodigoBarras()+"','" + item.getStatus() + "')";
        pers.ExecutaComando(sql);
    }
    
    @Override
    public List<Importacao> Listar(String[] params) {
        
        ResultSet rs = pers.ExecutaLista("SELECT * FROM Importacao Order by dataEnvio");
        
        List<Importacao>  importacoes = new ArrayList<>();
        Importacao importacao;
        
        try {
            while (rs.next()) {
                
                importacao = new Importacao();
                importacao.setCodigoBarras(rs.getInt("CodBarras"));
                importacao.setQuantidade(rs.getInt("Quantidade"));
                importacao.setStatus(rs.getString("Status"));
                importacao.setDataRecebimento(rs.getDate("DtRecebimento"));
                importacao.setDataEnvio(rs.getDate("DtEnvio"));
                importacao.setProduto(new ProdutoRepositorio().Carregar(rs.getInt("IdProduto")));
                importacoes.add(importacao);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImportacaoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ImportacaoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return importacoes;
    }

    @Override
    public Importacao Carregar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remover(Importacao item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
