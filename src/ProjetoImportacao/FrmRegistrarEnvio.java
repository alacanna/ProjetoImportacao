/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoImportacao;
import ProjetoImportacao.Model.Importacao;
import ProjetoImportacao.Model.Produto;
import ProjetoImportacao.Model.Repositorio.ImportacaoRepositorio;
import ProjetoImportacao.Model.Repositorio.ProdutoRepositorio;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author VanessaCristine
 */
public class FrmRegistrarEnvio extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmRegistrarEnvio
     */
    public FrmRegistrarEnvio() {
        initComponents();
        Util.carregarProduto(cmbProduto, new ProdutoRepositorio());
        GerarCodigoBarras();
        txtData.setEnabled(false);
       
        txtData.setText(Util.sdf.format(new Date()));
        
    }

    public void GerarCodigoBarras() {
        // Determia as numeros que poderão estar no codigo de barras  
        String numeros = "1234567890";

        Random random = new Random();

        String armazenaChaves = "";

        int index = -1;

        for (int i = 0; i < 5; i++) {
            index = random.nextInt(numeros.length());
            armazenaChaves += numeros.substring(index, index + 1);
        }

        txtCodBarras.setText(armazenaChaves);
        txtCodBarras.setEnabled(false);
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
        txtQte = new javax.swing.JTextField();
        lblQte = new javax.swing.JLabel();
        lblCodBarras = new javax.swing.JLabel();
        txtCodBarras = new javax.swing.JTextField();
        cmbProduto = new javax.swing.JComboBox<>();
        lblProduto = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lblCodBarras1 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btRegistrar = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setTitle("Registrar Envio (CHL)");
        setToolTipText("");
        setName("Registrar Envio"); // NOI18N

        lblTituloPagina.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloPagina.setForeground(new java.awt.Color(102, 102, 255));
        lblTituloPagina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjetoImportacao/RegistrarEnvio.jpg"))); // NOI18N
        lblTituloPagina.setToolTipText("");

        PProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtQte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQteActionPerformed(evt);
            }
        });

        lblQte.setText("Quantidade:");

        lblCodBarras.setText("Cód. de Barras:");

        txtCodBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodBarrasActionPerformed(evt);
            }
        });

        lblProduto.setText("Selecione o Produto:");

        lblCodBarras1.setText("Data Envio:");

        javax.swing.GroupLayout PProdutoLayout = new javax.swing.GroupLayout(PProduto);
        PProduto.setLayout(PProdutoLayout);
        PProdutoLayout.setHorizontalGroup(
            PProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PProdutoLayout.createSequentialGroup()
                        .addGroup(PProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodBarras))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodBarras1)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PProdutoLayout.createSequentialGroup()
                        .addGroup(PProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProduto)
                            .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQte)
                            .addComponent(txtQte, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PProdutoLayout.setVerticalGroup(
            PProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PProdutoLayout.createSequentialGroup()
                        .addComponent(lblQte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PProdutoLayout.createSequentialGroup()
                        .addGroup(PProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodBarras)
                            .addComponent(lblCodBarras1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btRegistrar.setText("Registrar");
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 172, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(PProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTituloPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btRegistrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQteActionPerformed

    private void txtCodBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodBarrasActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtQte.setText("");
        txtCodBarras.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        // TODO add your handling code here:
        
        if(txtQte.getText() != "" && txtQte.getText() != "0")
        {
        Importacao importa = new Importacao();
        
        importa.setCodigoBarras(Integer.parseInt(txtCodBarras.getText()));
 
        importa.setDataEnvio(txtData.getText());
        
        ImportacaoRepositorio rep = new ImportacaoRepositorio();
        
        Produto p = (Produto)cmbProduto.getSelectedItem();
        importa.setProduto(p);
        importa.setQuantidade(Integer.parseInt(txtQte.getText()));
        importa.setStatus("Enviado");
        
        rep.Salvar(importa);
        }
    }//GEN-LAST:event_btRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PProduto;
    private javax.swing.JButton btRegistrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<Produto> cmbProduto;
    private javax.swing.JLabel lblCodBarras;
    private javax.swing.JLabel lblCodBarras1;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQte;
    private javax.swing.JLabel lblTituloPagina;
    private javax.swing.JTextField txtCodBarras;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQte;
    // End of variables declaration//GEN-END:variables
}
