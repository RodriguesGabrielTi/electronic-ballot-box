/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Eleitor;
import model.dao.EleitorDAO;

/**
 *
 * @author santi
 */
public class ViewEleitor extends javax.swing.JFrame {

    
    public ViewEleitor() {
        
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) jTEleitores.getModel();
        jTEleitores.setRowSorter(new TableRowSorter(modelo));
        
        setExtendedState(MAXIMIZED_BOTH);
        
        readJTable();
        jButtonDesbloqueio.setVisible(false);
    }
    
    public void LimpaTudo() {
        txtMatricula.setText("");
        txtNome.setText("");
        txtCurso.getSelectedItem();
        jComboAno.getSelectedItem();
    }

    
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTEleitores.getModel();
        modelo.setNumRows(0);
        EleitorDAO pdao = new EleitorDAO();

        for (Eleitor c : pdao.read()) {
            String voto="";
            if (c.getConfVoto()==1){
                voto="Votou";
            }else{
                voto="Não votou";
            }
            modelo.addRow(new Object[]{
                c.getMatricula(),
                c.getNome(),
                c.getSerie(),
                c.getCurso(),
                voto
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboAno = new javax.swing.JComboBox<>();
        txtCurso = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonDesbloqueio = new javax.swing.JButton();
        jTEleitor = new javax.swing.JScrollPane();
        jTEleitores = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eleitor");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eleitor.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Eleitor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Matrícula");

        txtMatricula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        try{
            javax.swing.text.MaskFormatter matricula = new javax.swing.text.MaskFormatter("#######");

            txtMatricula = new javax.swing.JFormattedTextField(matricula);
        }catch(Exception e){
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nome");

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Curso");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Série");

        jComboAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º", "2º", "3º" }));
        jComboAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboAnoActionPerformed(evt);
            }
        });

        txtCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administração", "Finanças", "Informática", "Redes" }));
        txtCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCursoActionPerformed(evt);
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

        jLabel5.setText("(três primeiros nomes)");

        jButtonDesbloqueio.setBackground(new java.awt.Color(0, 153, 0));
        jButtonDesbloqueio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDesbloqueio.setText("DESBLOQUEAR O CAMPO DE TEXTO");
        jButtonDesbloqueio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesbloqueioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMatricula)
                    .addComponent(txtNome)
                    .addComponent(jComboAno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCurso, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDesbloqueio)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButtonDesbloqueio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboAno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jTEleitor.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTEleitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTEleitorMouseClicked(evt);
            }
        });
        jTEleitor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTEleitorKeyReleased(evt);
            }
        });

        jTEleitores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Série", "Curso", "Votação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTEleitores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTEleitoresMouseClicked(evt);
            }
        });
        jTEleitores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTEleitoresKeyReleased(evt);
            }
        });
        jTEleitor.setViewportView(jTEleitores);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTEleitor, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTEleitor))
                .addContainerGap())
        );

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

    private void jComboAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboAnoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        int verifiInserMat= txtMatricula.getText().length();
        int verifiInserNom= txtNome.getText().trim().length();
        if (verifiInserMat==7){
            Eleitor p = new Eleitor();
            EleitorDAO dao = new EleitorDAO();       
            p.setNome(txtNome.getText());
            p.setMatricula(Integer.parseInt(txtMatricula.getText()));
            p.setCurso(txtCurso .getSelectedItem().toString());
            p.setSerie(jComboAno.getSelectedItem().toString());
            dao.create(p);
            readJTable();
            LimpaTudo();
        }else{
            JOptionPane.showMessageDialog(null, "Campo da matrícula incorreto", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
        if (verifiInserNom==0){
            JOptionPane.showMessageDialog(null, "Campo 'Nome' está vazio", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
        readJTable();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        int verifiInserMat= txtMatricula.getText().length();
        int verifiInserNom= txtNome.getText().trim().length();
        
        if (verifiInserMat==7){           
            if (jTEleitores.getSelectedRow() != -1) {
            
            Eleitor p = new Eleitor();
            EleitorDAO dao = new EleitorDAO();

            p.setNome(txtNome.getText());
            p.setMatricula((int)jTEleitores.getValueAt(jTEleitores.getSelectedRow(), 0));
            p.setCurso(txtCurso.getSelectedItem().toString());
            p.setSerie(jComboAno.getSelectedItem().toString());
            dao.update(p);
            readJTable();
            LimpaTudo();
            
            }      
        }else{
            JOptionPane.showMessageDialog(null, "Campo da matrícula incorreto", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
        
        if (verifiInserNom==0){
            JOptionPane.showMessageDialog(null, "Campo 'Nome' está vazio", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
       

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTEleitores.getSelectedRow() != -1) {
            
            Eleitor p = new Eleitor();
            EleitorDAO dao = new EleitorDAO();

            p.setMatricula((int)jTEleitores.getValueAt(jTEleitores.getSelectedRow(), 0));
            dao.delete(p);
            readJTable();
            LimpaTudo();
            
        }else{
            JOptionPane.showMessageDialog(null,"Selecione um aluno para excluir");
        }
        readJTable();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCursoActionPerformed
        int indiceDoCombo = txtCurso .getSelectedIndex();
        String textoDoCurso = txtCurso .getSelectedItem().toString();
    }//GEN-LAST:event_txtCursoActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        new ViewPrincipal().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jTEleitoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTEleitoresMouseClicked
        if (jTEleitores.getSelectedRow() != -1) {

            txtMatricula.setText(jTEleitores.getValueAt(jTEleitores.getSelectedRow(), 0).toString());
            txtNome.setText(jTEleitores.getValueAt(jTEleitores.getSelectedRow(), 1).toString());
            jComboAno.setSelectedItem(jTEleitores.getValueAt(jTEleitores.getSelectedRow(), 2).toString());
            txtCurso.setSelectedItem(jTEleitores.getValueAt(jTEleitores.getSelectedRow(), 3).toString());

        }
        txtMatricula.setEnabled(false);
        jButtonDesbloqueio.setVisible(true);
    }//GEN-LAST:event_jTEleitoresMouseClicked

    private void jTEleitoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEleitoresKeyReleased
        
       
        
    }//GEN-LAST:event_jTEleitoresKeyReleased

    private void jTEleitorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEleitorKeyReleased

    }//GEN-LAST:event_jTEleitorKeyReleased

    private void jTEleitorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTEleitorMouseClicked
        
    }//GEN-LAST:event_jTEleitorMouseClicked

    private void jButtonDesbloqueioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesbloqueioActionPerformed
        JOptionPane.showMessageDialog(null, "Não é possível atualizar a matrícula. Apenas é possível, excluindo o aluno e cadastrando-o novamente", "Campo Desbloqueado", JOptionPane.WARNING_MESSAGE);
        jTEleitores.getSelectionModel().clearSelection();
        jButtonDesbloqueio.setVisible(false);
        txtMatricula.setEnabled(true);
        LimpaTudo();
    }//GEN-LAST:event_jButtonDesbloqueioActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewEleitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEleitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEleitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEleitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEleitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonDesbloqueio;
    private javax.swing.JComboBox<String> jComboAno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jTEleitor;
    private javax.swing.JTable jTEleitores;
    private javax.swing.JComboBox<String> txtCurso;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
