/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoImportacao.Model.Repositorio;

import ProjetoImportacao.Model.Estoque;
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
public class EstoqueRepositorio implements IRepositorio<Estoque> {

    private Persistencia pers = new Persistencia();

    @Override
    public void Salvar(Estoque estoque) {
        if (estoque.getIdEstoque() == 0) {
            Incluir(estoque);
        } else {
            Alterar(estoque);
        }
    }

    @Override
    public List<Estoque> Listar(String[] params) {
        ResultSet rs = pers.ExecutaLista("SELECT * FROM ESTOQUE");

        List<Estoque> lstEstoque = new ArrayList<Estoque>();
        Estoque estoque;

        try {
            while (rs.next()) {
                estoque = new Estoque();
                estoque.setIdEstoque(rs.getInt("IdEstoque"));
                estoque.setQuantidade(rs.getInt("Quantidade"));
                //Seleciona o produto
                ProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();
                estoque.setProduto(produtoRepositorio.Carregar(rs.getInt("IdProduto")));

                lstEstoque.add(estoque);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EstoqueRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(EstoqueRepositorio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lstEstoque;
    }

    @Override
    public Estoque Carregar(int codigo) {
        String sql = "SELECT * FROM ESTOQUE where IdEstoque=" + codigo;
        Estoque estoque = null;

        ResultSet rs = pers.ExecutaLista(sql);
        try {
            if (rs != null) {
                if (rs.next()) {
                    estoque = new Estoque();
                    estoque.setIdEstoque(rs.getInt("IdEstoque"));
                    estoque.setQuantidade(rs.getInt("Quantidade"));
                    //Seleciona o produto
                    ProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();
                    estoque.setProduto(produtoRepositorio.Carregar(rs.getInt("IdProduto")));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(EstoqueRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(EstoqueRepositorio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return estoque;
    }

    public Estoque CarregarEstoquePorProduto(int codigoProduto) {
        String sql = "SELECT * FROM ESTOQUE where IdProduto=" + codigoProduto;
        Estoque estoque = null;

        ResultSet rs = pers.ExecutaLista(sql);
        try {
            if (rs != null) {
                if (rs.next()) {
                    estoque = new Estoque();
                    estoque.setIdEstoque(rs.getInt("IdEstoque"));
                    estoque.setQuantidade(rs.getInt("Quantidade"));
                    //Seleciona o produto
                    ProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();
                    estoque.setProduto(produtoRepositorio.Carregar(rs.getInt("IdProduto")));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(EstoqueRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(EstoqueRepositorio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return estoque;
    }

    @Override
    public void Remover(Estoque item) {
        String sql = "DELETE FROM ESTOQUE where IdEstoque=" + item.getIdEstoque();
        pers.ExecutaComando(sql);
    }

    private void Incluir(Estoque item) {
        Estoque estoque = CarregarEstoquePorProduto(item.getProduto().getIdProduto());
        if (estoque != null) {
            String sql = "INSERT INTO ESTOQUE(IdProduto,Quantidade) VALUES ('" + item.getProduto().getIdProduto() + "','" + item.getQuantidade() + "' )";
            pers.ExecutaComando(sql);
        } else {
            Alterar(item);
        }
    }

    private void Alterar(Estoque item) {
        String sql = "UPDATE ESTOQUE SET IdProduto ='" + item.getProduto().getIdProduto() + "',Quantidade='" + item.getQuantidade() + "' where IdEstoque=" + item.getIdEstoque();
        pers.ExecutaComando(sql);
    }
}
