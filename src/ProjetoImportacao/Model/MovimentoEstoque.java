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
public class MovimentoEstoque {
    
    private int idMovimentoEstoque;

    public int getIdMovimentoEstoque() {
        return idMovimentoEstoque;
    }
     public void setIdMovimentoEstoque(int idMovimentoEstoque)
     {
        this.idMovimentoEstoque = idMovimentoEstoque;
    }
    
    private Estoque estoque;

    public Estoque getEstoque() {
        return estoque;
    }
    
    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
    
    private String tipoMovimentacao;

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }
    
    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }
    
    private String pais;

    public String getPais() {
        return pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    private Importacao importacao;

    public Importacao getImportacao() {
        return importacao;
    }
    
    public void setImportacao(Importacao importacao) {
        this.importacao = importacao;
    }
    
    private String data;

    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
}
