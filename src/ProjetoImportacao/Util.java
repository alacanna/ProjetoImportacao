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
 */
public class Util<T> {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public static <T> void carregarProduto(JComboBox comboBox, IRepositorio<T> rep) {
        List<T> items = rep.Listar(null);
        items.stream().forEach((p) -> {
            comboBox.addItem(p);
        });
    }

}
