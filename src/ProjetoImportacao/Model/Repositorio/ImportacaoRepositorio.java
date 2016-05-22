/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoImportacao.Model.Repositorio;

import ProjetoImportacao.Model.Estoque;
import ProjetoImportacao.Model.Importacao;
import ProjetoImportacao.Model.MovimentoEstoque;
import ProjetoImportacao.Util;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author VanessaCristine
 */
public class ImportacaoRepositorio implements IRepositorio<Importacao> {

    private Persistencia pers = new Persistencia();

    @Override
    public void Salvar(Importacao item) {

        item.setDataRecebimento(item.getDataEnvio());

        String sql = "INSERT INTO Importacao(IdProduto,DtEnvio,DtRecebimento,Quantidade,CodBarras,Status) VALUES (" + item.getProduto().getIdProduto() + ",'" + item.getDataEnvio() + "','" + item.getDataRecebimento() + "','" + item.getQuantidade() + "','" + item.getCodigoBarras() + "','" + item.getStatus() + "')";
        pers.ExecutaComando(sql);

        ResultSet rs = pers.ExecutaLista("SELECT IdImport from Importacao where CodBarras = '" + +item.getCodigoBarras() + "'");

        try {
            if (rs.next()) {
                item.setIdImportacao(rs.getInt("IdImport"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImportacaoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }

        MovimentoEstoqueRepositorio repMov = new MovimentoEstoqueRepositorio();
        EstoqueRepositorio repEstoque = new EstoqueRepositorio();
        MovimentoEstoque movEstoque = new MovimentoEstoque();

        movEstoque.setData(Util.sdf.format(new Date()));
        movEstoque.setPais("CHL");
        movEstoque.setQuantidade(item.getQuantidade());
        movEstoque.setTipoMovimentacao("Saída");
        movEstoque.setImportacao(item);
        movEstoque.setEstoque(repEstoque.CarregarEstoquePorProduto(item.getProduto().getIdProduto(), "CHL"));
        repMov.Salvar(movEstoque);
    }

    public boolean Alterar(Importacao item) {
       
        if (item.getStatus().equalsIgnoreCase("Enviado")) {
            
            item.setStatus("Recebido");
            String sql = "UPDATE Importacao SET Status= '" + item.getStatus() + "' where CodBarras=" + item.getCodigoBarras();
            System.out.println("Query " + sql);
            pers.ExecutaComando(sql);

            MovimentoEstoque movimentoEstoque = new MovimentoEstoque();
            movimentoEstoque.setData(Util.sdf.format(new Date()));
            movimentoEstoque.setTipoMovimentacao("ENTRADA");
            movimentoEstoque.setPais("BR");

            Estoque estoque = new Estoque();
            estoque.setProduto(item.getProduto());

            movimentoEstoque.setEstoque(estoque);
            movimentoEstoque.setQuantidade(item.getQuantidade());

            MovimentoEstoqueRepositorio movimentoEstoqueRepositorio = new MovimentoEstoqueRepositorio();
            movimentoEstoqueRepositorio.Salvar(movimentoEstoque);
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Código de barras já foi recebido!");
            return false;
        }

    }

    @Override
    public List<Importacao> Listar(String[] params) {

        ResultSet rs = pers.ExecutaLista("SELECT * FROM Importacao Order by status");

        List<Importacao> importacoes = new ArrayList<>();
        Importacao importacao;

        try {
            while (rs.next()) {

                importacao = new Importacao();
                importacao.setCodigoBarras(rs.getInt("CodBarras"));
                importacao.setQuantidade(rs.getInt("Quantidade"));
                importacao.setStatus(rs.getString("Status"));
                importacao.setDataRecebimento(rs.getString("DtRecebimento"));
                importacao.setDataEnvio(rs.getString("DtEnvio"));
                importacao.setProduto(new ProdutoRepositorio().Carregar(rs.getInt("IdProduto")));
                importacao.setIdImportacao(rs.getInt("IdImport"));
                importacoes.add(importacao);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImportacaoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
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
        String sql = "SELECT * FROM Importacao where IdImport=" + codigo;
        Importacao importacao = new Importacao();
        ResultSet rs = pers.ExecutaLista(sql);
        try {

            if (rs != null) {
                if (rs.next()) {
                importacao.setCodigoBarras(rs.getInt("CodBarras"));
                importacao.setQuantidade(rs.getInt("Quantidade"));
                importacao.setStatus(rs.getString("Status"));
                importacao.setDataRecebimento(rs.getString("DtRecebimento"));
                importacao.setDataEnvio(rs.getString("DtEnvio"));
                importacao.setProduto(new ProdutoRepositorio().Carregar(rs.getInt("IdProduto")));
                importacao.setIdImportacao(rs.getInt("IdImport"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return importacao;

    }

    public Importacao CarregarPeloCodigoDeBarras(int codigoBarras) {
        String sql = "SELECT * FROM Importacao where CodBarras=" + codigoBarras;
        Importacao importacao = new Importacao();
        ResultSet rs = pers.ExecutaLista(sql);
        try {

            if (rs != null) {
                if (rs.next()) {
                    importacao.setCodigoBarras(rs.getInt("CodBarras"));
                    importacao.setQuantidade(rs.getInt("Quantidade"));
                    importacao.setDataRecebimento(rs.getString("DtRecebimento"));

                    importacao.setStatus(rs.getString("Status"));
                    importacao.setDataEnvio(rs.getString("DtEnvio"));

                    importacao.setProduto(new ProdutoRepositorio().Carregar(rs.getInt("IdProduto")));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return importacao;

    }

    @Override
    public void Remover(Importacao item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
