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
public class MovimentoEstoqueRepositorio implements IRepositorio<MovimentoEstoque>{

    private Persistencia pers = new Persistencia();
    
    @Override
    public void Salvar(MovimentoEstoque item) {
        
        if(item.getImportacao() == null)
        {
            Importacao imp = new Importacao();
            imp.setIdImportacao(0);
            item.setImportacao(imp);
        }
        String sql = "INSERT INTO MovimentacaoEstoque(IdEstoque,TipoMovimentacao,Pais,Quantidade,Data,IdImportacao) VALUES (" + item.getEstoque().getIdEstoque() +",'" + item.getTipoMovimentacao() +"','" + item.getPais() +"','" + item.getQuantidade() +"','" + item.getData() +"'," + item.getImportacao().getIdImportacao()+ ")";
        pers.ExecutaComando(sql);
        
        EstoqueRepositorio repEstoque = new EstoqueRepositorio();
        Estoque estoque = new Estoque();
        estoque.setIdEstoque(item.getEstoque().getIdEstoque());
        estoque.setProduto(item.getEstoque().getProduto());
        estoque.setPais(item.getPais());
        
        switch(item.getTipoMovimentacao().toUpperCase())
        {
            case "ENTRADA":
                estoque.setQuantidade(item.getQuantidade());
                break;
            case "SAÍDA":
            case "PERDA":
                estoque.setQuantidade(-item.getQuantidade());
                break;
        }
        repEstoque.Salvar(estoque);
    }
    
    
    @Override
    public List<MovimentoEstoque> Listar(String[] params) {
        
        ResultSet rs = pers.ExecutaLista("SELECT * FROM MovimentacaoEstoque Order by IdMov");
        
        List<MovimentoEstoque>  movimentacoes = new ArrayList<>();
        MovimentoEstoque movimentacao;
        
        try {
            while (rs.next()) {
                
                movimentacao = new MovimentoEstoque();
                movimentacao.setTipoMovimentacao(rs.getString("TipoMovimentacao"));
                movimentacao.setQuantidade(rs.getInt("Quantidade"));
                movimentacao.setPais(rs.getString("Pais"));
                movimentacao.setImportacao(new ImportacaoRepositorio().Carregar(rs.getInt("IdImportacao")));
                movimentacao.setIdMovimentoEstoque(rs.getInt("IdMov"));
                movimentacao.setEstoque(new EstoqueRepositorio().Carregar(rs.getInt("IdEstoque")));
                movimentacao.setData(rs.getString("data"));
                movimentacoes.add(movimentacao);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MovimentoEstoqueRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(MovimentoEstoqueRepositorio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return movimentacoes;
    }

    @Override
    public MovimentoEstoque Carregar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remover(MovimentoEstoque item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
