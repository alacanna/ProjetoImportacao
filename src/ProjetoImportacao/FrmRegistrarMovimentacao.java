/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoImportacao;

import ProjetoImportacao.Model.Estoque;
import ProjetoImportacao.Model.Produto;
import ProjetoImportacao.Model.Repositorio.EstoqueRepositorio;
import ProjetoImportacao.Model.Repositorio.ProdutoRepositorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author VanessaCristine
 */
public class FrmRegistrarMovimentacao extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmRegistrarMovimentacao
     */
    public FrmRegistrarMovimentacao() {
        initComponents();
        preencheView();
        Util.carregarProduto(cmbProduto, new ProdutoRepositorio());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloPagina = new javax.swing.JLabel();
        PProduto = new javax.swing.JPanel();
        lblTipoMov = new javax.swing.JLabel();
        cmbTipoMov = new javax.swing.JComboBox<>();
        lblQte = new javax.swing.JLabel();
        txtQte = new javax.swing.JTextField();
        lblProduto = new javax.swing.JLabel();
        cmbProduto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox<>();
        txtEstoqueAtual = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);

        lblTituloPagina.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloPagina.setForeground(new java.awt.Color(102, 102, 255));
        lblTituloPagina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjetoImportacao/RegistrarMovimentacao.jpg"))); // NOI18N
        lblTituloPagina.setToolTipText("");

        PProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimentação Estoque"));

        lblTipoMov.setText("Tipo Movimentação:");

        cmbTipoMov.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Saída", "Perda" }));
        cmbTipoMov.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbTipoMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoMovActionPerformed(evt);
            }
        });

        lblQte.setText("Quantidade:");

        txtQte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQteActionPerformed(evt);
            }
        });

        lblProduto.setText("Selecione o Produto:");

        jLabel1.setText("País:");

        cmbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brasil", "Chile" }));
        cmbPais.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaisActionPerformed(evt);
            }
        });

        txtEstoqueAtual.setText("Estoque atual :");

        javax.swing.GroupLayout PProdutoLayout = new javax.swing.GroupLayout(PProduto);
        PProduto.setLayout(PProdutoLayout);
        PProdutoLayout.setHorizontalGroup(
            PProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoMov)
                    .addComponent(cmbTipoMov, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PProdutoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(PProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblProduto)
                    .addComponent(cmbProduto, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQte)
                    .addComponent(txtQte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(txtEstoqueAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        PProdutoLayout.setVerticalGroup(
            PProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PProdutoLayout.createSequentialGroup()
                        .addComponent(lblProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblQte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PProdutoLayout.createSequentialGroup()
                        .addComponent(lblTipoMov)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipoMov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstoqueAtual)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTituloPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTituloPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnSalvar))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void cmbPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPaisActionPerformed

    private void txtQteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQteActionPerformed

    private void cmbTipoMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoMovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoMovActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        int quantidade = 0;
        try {
            quantidade = Integer.parseInt(txtQte.getText());
            // TODO add your handling code here:
            Estoque estoque = new Estoque();
            estoque.setQuantidade(Integer.parseInt(txtQte.getText()));
            estoque.setProduto((Produto) cmbProduto.getSelectedItem());

            EstoqueRepositorio rep = new EstoqueRepositorio();
            rep.Salvar(estoque);
            Limpar();
            JOptionPane.showMessageDialog(null, "Movimentação realizada com sucesso!");
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "Por favor digite uma quantidade válida!");
        }

    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PProduto;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbPais;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JComboBox<String> cmbTipoMov;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQte;
    private javax.swing.JLabel lblTipoMov;
    private javax.swing.JLabel lblTituloPagina;
    private javax.swing.JLabel txtEstoqueAtual;
    private javax.swing.JTextField txtQte;
    // End of variables declaration//GEN-END:variables

    private void Limpar() {
        txtQte.setText("");
        cmbProduto.setSelectedIndex(0);
        cmbTipoMov.setSelectedIndex(0);
        cmbPais.setSelectedIndex(0);
    }

    private void preencheView() {
        cmbProduto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("IdProduto "+ ((Produto)cmbProduto.getSelectedItem()).getIdProduto());
                System.out.println("Estoque "+ new EstoqueRepositorio().Listar(null).toString());

                
                EstoqueRepositorio repEstoque = new EstoqueRepositorio();
                Estoque estoque = repEstoque.CarregarEstoquePorProduto(((Produto) cmbProduto.getSelectedItem()).getIdProduto());

                if (estoque != null) {
                    txtEstoqueAtual.setText("Estoque atual: " + String.valueOf(estoque.getQuantidade()));
                }

            }
        });
    }

}
