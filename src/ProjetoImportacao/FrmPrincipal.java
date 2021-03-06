/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoImportacao;

/**
 *
 * @author VanessaCristine
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarPedido
     */
    public FrmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        Cadastrar = new javax.swing.JMenu();
        CadastraProdutosMenuItem = new javax.swing.JMenuItem();
        Importacao = new javax.swing.JMenu();
        EnvioMenuItem = new javax.swing.JMenuItem();
        RecebimentoMenuItem = new javax.swing.JMenuItem();
        RastreamentoMenuItem = new javax.swing.JMenuItem();
        Estoque = new javax.swing.JMenu();
        MovEstoqueMenuItem = new javax.swing.JMenuItem();
        RelatorioMenuItem = new javax.swing.JMenuItem();
        MovEstoqueMenuItem1 = new javax.swing.JMenuItem();
        Sobre = new javax.swing.JMenu();
        Sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        setForeground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        menuBar.setFont(menuBar.getFont());

        Cadastrar.setMnemonic('f');
        Cadastrar.setText("Cadastrar");

        CadastraProdutosMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        CadastraProdutosMenuItem.setMnemonic('s');
        CadastraProdutosMenuItem.setText("Produto");
        CadastraProdutosMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastraProdutosMenuItemMouseClicked(evt);
            }
        });
        CadastraProdutosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastraProdutosMenuItemActionPerformed(evt);
            }
        });
        Cadastrar.add(CadastraProdutosMenuItem);

        menuBar.add(Cadastrar);

        Importacao.setMnemonic('e');
        Importacao.setText("Importação");

        EnvioMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        EnvioMenuItem.setMnemonic('t');
        EnvioMenuItem.setText("Envio (CHL)");
        EnvioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnvioMenuItemActionPerformed(evt);
            }
        });
        Importacao.add(EnvioMenuItem);

        RecebimentoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        RecebimentoMenuItem.setMnemonic('y');
        RecebimentoMenuItem.setText("Recebimento (BR)");
        RecebimentoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecebimentoMenuItemActionPerformed(evt);
            }
        });
        Importacao.add(RecebimentoMenuItem);

        RastreamentoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        RastreamentoMenuItem.setText("Rastreamento");
        RastreamentoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RastreamentoMenuItemActionPerformed(evt);
            }
        });
        Importacao.add(RastreamentoMenuItem);

        menuBar.add(Importacao);

        Estoque.setText("Estoque");

        MovEstoqueMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        MovEstoqueMenuItem.setText("Registrar Movimentação");
        MovEstoqueMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovEstoqueMenuItemActionPerformed(evt);
            }
        });
        Estoque.add(MovEstoqueMenuItem);

        RelatorioMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        RelatorioMenuItem.setText("Relatório");
        RelatorioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioMenuItemActionPerformed(evt);
            }
        });
        Estoque.add(RelatorioMenuItem);

        MovEstoqueMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        MovEstoqueMenuItem1.setText("Histório Movimentação");
        MovEstoqueMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovEstoqueMenuItem1ActionPerformed(evt);
            }
        });
        Estoque.add(MovEstoqueMenuItem1);
        MovEstoqueMenuItem1.getAccessibleContext().setAccessibleName("Histórico Movimentação");

        menuBar.add(Estoque);

        Sobre.setMnemonic('h');
        Sobre.setText("Sobre");
        Sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SobreMouseClicked(evt);
            }
        });
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreActionPerformed(evt);
            }
        });
        menuBar.add(Sobre);

        Sair.setText("Sair");
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairMouseClicked(evt);
            }
        });
        menuBar.add(Sair);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RecebimentoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebimentoMenuItemActionPerformed
        RemoveTela();
//Nome da Classe do Formulário
        FrmRegistrarRecebimento FrmRegistrarRecebimento = new FrmRegistrarRecebimento();

        //Abre Formulário na Página
        Desktop.add(FrmRegistrarRecebimento);
        FrmRegistrarRecebimento.setVisible(true);
    }//GEN-LAST:event_RecebimentoMenuItemActionPerformed

    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SairMouseClicked

    private void EnvioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnvioMenuItemActionPerformed
        RemoveTela();
        //Nome da Classe do Formulário
        FrmRegistrarEnvio FrmRegistrarEnvio = new FrmRegistrarEnvio();

        //Abre Formulário na Página
        Desktop.add(FrmRegistrarEnvio);
        FrmRegistrarEnvio.setVisible(true);
    }//GEN-LAST:event_EnvioMenuItemActionPerformed

    private void CadastraProdutosMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastraProdutosMenuItemMouseClicked

    }//GEN-LAST:event_CadastraProdutosMenuItemMouseClicked

    private void CadastraProdutosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastraProdutosMenuItemActionPerformed
        RemoveTela();
//Nome da Classe do Formulário
        FrmCadastrarProduto FrmCadastrarProduto = new FrmCadastrarProduto();

        //Abre Formulário na Página
        Desktop.add(FrmCadastrarProduto);
        FrmCadastrarProduto.setVisible(true);
    }//GEN-LAST:event_CadastraProdutosMenuItemActionPerformed

    private void MovEstoqueMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovEstoqueMenuItemActionPerformed
        RemoveTela();
        //Nome da Classe do Formulário
        FrmRegistrarMovimentacao FrmRegistrarMovimentacao = new FrmRegistrarMovimentacao();

        //Abre Formulário na Página
        Desktop.add(FrmRegistrarMovimentacao);
        FrmRegistrarMovimentacao.setVisible(true);
    }//GEN-LAST:event_MovEstoqueMenuItemActionPerformed

    private void RelatorioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioMenuItemActionPerformed
        RemoveTela();
//Nome da Classe do Formulário
        FrmRelatorio FrmRelatorio = new FrmRelatorio();

        //Abre Formulário na Página
        Desktop.add(FrmRelatorio);
        FrmRelatorio.setVisible(true);
    }//GEN-LAST:event_RelatorioMenuItemActionPerformed

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed

    }//GEN-LAST:event_SobreActionPerformed

    private void SobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SobreMouseClicked
        RemoveTela();
        //Nome da Classe do Formulário
        FrmSobre FrmSobre = new FrmSobre();

        //Abre Formulário na Página
        Desktop.add(FrmSobre);
        FrmSobre.setVisible(true);
    }//GEN-LAST:event_SobreMouseClicked

    private void RastreamentoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RastreamentoMenuItemActionPerformed
        RemoveTela();
        //Nome da Classe do Formulário
        FrmRastreamento FrmRastreamento = new FrmRastreamento();

        //Abre Formulário na Página
        Desktop.add(FrmRastreamento);
        FrmRastreamento.setVisible(true);
    }//GEN-LAST:event_RastreamentoMenuItemActionPerformed

    private void MovEstoqueMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovEstoqueMenuItem1ActionPerformed
        // TODO add your handling code here:
        RemoveTela();
        //Nome da Classe do Formulário
        FrmHistoricoMovimentacao frmHistoricoMovimentacao = new FrmHistoricoMovimentacao();

        //Abre Formulário na Página
        Desktop.add(frmHistoricoMovimentacao);
        frmHistoricoMovimentacao.setVisible(true);
    }//GEN-LAST:event_MovEstoqueMenuItem1ActionPerformed
    public void RemoveTela() {
        Desktop.removeAll();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadastraProdutosMenuItem;
    private javax.swing.JMenu Cadastrar;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem EnvioMenuItem;
    private javax.swing.JMenu Estoque;
    private javax.swing.JMenu Importacao;
    private javax.swing.JMenuItem MovEstoqueMenuItem;
    private javax.swing.JMenuItem MovEstoqueMenuItem1;
    private javax.swing.JMenuItem RastreamentoMenuItem;
    private javax.swing.JMenuItem RecebimentoMenuItem;
    private javax.swing.JMenuItem RelatorioMenuItem;
    private javax.swing.JMenu Sair;
    private javax.swing.JMenu Sobre;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
