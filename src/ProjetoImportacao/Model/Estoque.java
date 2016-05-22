/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoImportacao.Model;

/**
 *
 * @author VanessaCristine
 */
public class Estoque {
    
    private int idEstoque;

    public int getIdEstoque() {
        return idEstoque;
    }
    
    public void setIdEstoque(int idEstoque){
        this.idEstoque = idEstoque;
    }
    
    private Produto produto;

    public Produto getProduto() {
        return produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
