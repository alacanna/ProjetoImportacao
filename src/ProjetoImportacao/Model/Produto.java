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
public class Produto {
    
    private int idProduto;

    public int getIdProduto() {
        return idProduto;
    }
    
      public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    private String nome;

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    private String categoria;

    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    private double preco;

    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    private String uniMedida;

    public String getUniMedida() {
        return uniMedida;
    }
    
    public void setUniMedida(String uniMedida) {
        this.uniMedida = uniMedida;
    }
    
        private String codigoBarras;

    public String getCodigoBarras() {
        return codigoBarras;
    }
    
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    
    @Override
    public String toString()
    {
        return getNome().toString();
    }
}
