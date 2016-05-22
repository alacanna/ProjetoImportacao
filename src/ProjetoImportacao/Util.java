/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoImportacao;

import ProjetoImportacao.Model.Produto;
import ProjetoImportacao.Model.Repositorio.IRepositorio;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author VanessaCristine
 * Clase auxiliar, para reaproveitamento de codigo e funcoes genericas.
 * 
 */
public class Util<T> {
    //Formatando as datas para o formato dd/MM/yyyy HH:mm.
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    //Faz o carregamento do combo a partir do classe.
    public static <T> void carregarProduto(JComboBox comboBox, IRepositorio<T> rep) {
        List<T> items = rep.Listar(null);
        items.stream().forEach((p) -> {
            comboBox.addItem(p);
        });
    }

}
