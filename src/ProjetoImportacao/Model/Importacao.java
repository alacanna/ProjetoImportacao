/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoImportacao.Model;

import java.util.Date;

/**
 *
 * @author VanessaCristine
 */
public class Importacao {
    
    private int idImportacao;

    public int getIdImportacao() {
        return idImportacao;
    }
    
    public void setIdImportacao(int idImportacao) {
        this.idImportacao = idImportacao;
    }

    private Date dataEnvio;

    public Date getDataEnvio() {
        return dataEnvio;
    }
    
    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }
    
    private Date dataRecebimento;

    public Date getDataRecebimento() {
        return dataRecebimento;
    }
    
    public void setDataRecebimento(Date dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
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
    
    private String status;

    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
}
