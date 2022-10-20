/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import javax.swing.JTable;
public class EspecialidadesPanel extends javax.swing.JPanel {
    
    public EspecialidadesPanel() {
        initComponents();
        criarTabelaEspecialidades();
        criarTabelaEspecialidades();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollTableEspecialidades = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonExcluirPlanoDeSaude = new javax.swing.JButton();
        buttonAlterarPlanoDeSaude = new javax.swing.JButton();
        buttonAdicionarPlanoDeSaude = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setPreferredSize(new java.awt.Dimension(945, 370));
        setLayout(null);

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollTableEspecialidades.setViewportView(tableEspecialidades);

        add(scrollTableEspecialidades);
        scrollTableEspecialidades.setBounds(20, 40, 905, 240);

        buttonExcluirPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete.png"))); // NOI18N
        buttonExcluirPlanoDeSaude.setToolTipText("Excluir plano de saúde selecionado");
        buttonExcluirPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonExcluirPlanoDeSaude);
        buttonExcluirPlanoDeSaude.setBounds(700, 294, 70, 60);

        buttonAlterarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png"))); // NOI18N
        buttonAlterarPlanoDeSaude.setToolTipText("Editar plano de saúde selecionado");
        buttonAlterarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonAlterarPlanoDeSaude);
        buttonAlterarPlanoDeSaude.setBounds(780, 294, 70, 60);

        buttonAdicionarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add.png"))); // NOI18N
        buttonAdicionarPlanoDeSaude.setToolTipText("Adicionar plano de saúde");
        buttonAdicionarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonAdicionarPlanoDeSaude);
        buttonAdicionarPlanoDeSaude.setBounds(860, 294, 70, 60);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Especialidades");
        add(jLabel3);
        jLabel3.setBounds(20, 10, 180, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPlanoDeSaudeActionPerformed
        
    }//GEN-LAST:event_buttonExcluirPlanoDeSaudeActionPerformed

    private void buttonAlterarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarPlanoDeSaudeActionPerformed
        
    }//GEN-LAST:event_buttonAlterarPlanoDeSaudeActionPerformed

    private void buttonAdicionarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarPlanoDeSaudeActionPerformed
        
    }//GEN-LAST:event_buttonAdicionarPlanoDeSaudeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarPlanoDeSaude;
    private javax.swing.JButton buttonAlterarPlanoDeSaude;
    private javax.swing.JButton buttonExcluirPlanoDeSaude;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane scrollTableEspecialidades;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables
    private void criarTabelaEspecialidades(){
        tableEspecialidades.setModel(EspecialidadeDAO.getTableModel());
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(300);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(300);
        
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);
        tableEspecialidades.setDefaultEditor(Object.class, null);
        
    }
}
