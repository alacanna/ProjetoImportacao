/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoImportacao.Model.Repositorio;

import java.util.List;

/**
 *
 * @author VanessaCristine
 * @param <T>
 * Interface para a persistencia dos metodos comum da base de dados.
 */
public interface IRepositorio<T> {
    
    //Metodo salvar
    public void Salvar(T item);
    
    //Metodo para listar 
    public List<T> Listar(String[] params);
    
    //Metodo para Carregar
    public T Carregar(int codigo);
    
    //Metodo para remover
    public void Remover(T item);
}
