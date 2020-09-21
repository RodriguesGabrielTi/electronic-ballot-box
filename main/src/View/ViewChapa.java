/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Chapa;
import model.dao.ChapaDAO;

/**
 *
 * @author santi
 */
public class ViewChapa extends javax.swing.JFrame {

    /**
     * Creates new form ViewChapa
     */
    public ViewChapa() {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) jTChapas.getModel();
        jTChapas.setRowSorter(new TableRowSorter(modelo));
        
        setExtendedState(MAXIMIZED_BOTH);

        readJTable();
        jButtonDesbloqueio.setVisible(false);
    }
    
    public void LimpaTudo() {
        txtnumero.setText("");
        txtnome.setText("");     
    }
    
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTChapas.getModel();
        modelo.setNumRows(0);
        ChapaDAO pdao = new ChapaDAO();

        for (Chapa c : pdao.read()) {
            modelo.addRow(new Object[]{
                c.getNome(),
                c.getNumero(),
                c.getFuncao(),
            });

        }

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTchapas = new javax.swing.JScrollPane();
        jTChapas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jButtonDesbloqueio = new javax.swing.JButton();
        jComboFuncao = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chapas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/partidos.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Candidato");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(548, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(547, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTchapas.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTchapas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTchapasKeyReleased(evt);
            }
        });

        jTChapas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do candidato", "Número", "Função"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTChapas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTChapasMouseClicked(evt);
            }
        });
        jTChapas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTChapasKeyReleased(evt);
            }
        });
        jTchapas.setViewportView(jTChapas);

        jPanel3.setPreferredSize(new java.awt.Dimension(380, 325));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nome da candidato");

        txtnome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/btn-excluir.png"))); // NOI18N
        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/btn-novo.png"))); // NOI18N
        jButton2.setText("Novo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/btn-salvar.png"))); // NOI18N
        jButton3.setText("Atualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Função");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Número do candidato");

        txtnumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });

        jButtonDesbloqueio.setBackground(new java.awt.Color(0, 153, 0));
        jButtonDesbloqueio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDesbloqueio.setText("DESBLOQUEAR O CAMPO DE TEXTO");
        jButtonDesbloqueio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesbloqueioActionPerformed(evt);
            }
        });

        jComboFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Líder", "Vice", "Secretário" }));
        jComboFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboFuncaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnome)
                    .addComponent(txtnumero)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(384, 384, 384)
                                .addComponent(jLabel4))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDesbloqueio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboFuncao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jButtonDesbloqueio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTchapas)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTchapas, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/iconfinder_203_CircledBack_183320 (1).png"))); // NOI18N
        jMenu1.setText("voltar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTChapas.getSelectedRow() != -1) {
            
            Chapa p = new Chapa();
            ChapaDAO dao = new ChapaDAO();

            p.setNumero((int)jTChapas.getValueAt(jTChapas.getSelectedRow(), 1));
            dao.delete(p);
            readJTable();
            jButtonDesbloqueio.setVisible(false);
            txtnumero.setEnabled(true);
            LimpaTudo();
        }else{
            JOptionPane.showMessageDialog(null,"Selecione um aluno para excluir");
        }              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Chapa p = new Chapa();
        ChapaDAO dao = new ChapaDAO();
        int i=JOptionPane.showConfirmDialog(null, "O Número da chapa não poderá ser modificado depois da inserção, deseja prosseguir?");
        if (i==0){
            p.setNome(txtnome.getText());
            p.setNumero(Integer.parseInt(txtnumero.getText()));
            p.setFuncao((String) jComboFuncao.getSelectedItem());
            dao.create(p);
            readJTable();
            jButtonDesbloqueio.setVisible(false);
            txtnumero.setEnabled(true);
            LimpaTudo();
        }else{
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        if (jTChapas.getSelectedRow() != -1) {
            
            Chapa p = new Chapa();
            ChapaDAO dao = new ChapaDAO();

            p.setNome(txtnome.getText());
            p.setNumero(Integer.parseInt(txtnumero.getText()));
            p.setFuncao((String) jComboFuncao.getSelectedItem());
            dao.update(p);
            readJTable();
            jButtonDesbloqueio.setVisible(false);
            txtnumero.setEnabled(true);
            LimpaTudo();
            
        }   
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed
    
    private void jTchapasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTchapasKeyReleased
       
    }//GEN-LAST:event_jTchapasKeyReleased

    private void jTChapasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTChapasKeyReleased
        
    }//GEN-LAST:event_jTChapasKeyReleased

    private void jTChapasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTChapasMouseClicked
        if (jTChapas.getSelectedRow() != -1) {

            txtnome.setText(jTChapas.getValueAt(jTChapas.getSelectedRow(), 0).toString());
            txtnumero.setText(jTChapas.getValueAt(jTChapas.getSelectedRow(), 1).toString());
            jComboFuncao.setSelectedItem(jTChapas.getValueAt(jTChapas.getSelectedRow(), 2).toString());
            jButtonDesbloqueio.setVisible(true);
            txtnumero.setEnabled(false);
        }
         
    }//GEN-LAST:event_jTChapasMouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        new ViewPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
       new ViewPrincipal().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jButtonDesbloqueioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesbloqueioActionPerformed
        JOptionPane.showMessageDialog(null, "Não é possível atualizar o número da chapa. Apenas é possível, excluindo a chapa e cadastrando-a novamente", "Campo Desbloqueado", JOptionPane.WARNING_MESSAGE);
        jTChapas.getSelectionModel().clearSelection();
        jButtonDesbloqueio.setVisible(false);
        txtnumero.setEnabled(true);
        LimpaTudo();
    }//GEN-LAST:event_jButtonDesbloqueioActionPerformed

    private void jComboFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboFuncaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboFuncaoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewChapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewChapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewChapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewChapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewChapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonDesbloqueio;
    private javax.swing.JComboBox<String> jComboFuncao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTable jTChapas;
    private javax.swing.JScrollPane jTchapas;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
}
