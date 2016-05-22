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
 */
public interface IRepositorio<T> {
    
    public void Salvar(T item);
    
    public List<T> Listar(String[] params);
    
    public T Carregar(int codigo);
    
    public void Remover(T item);
}
