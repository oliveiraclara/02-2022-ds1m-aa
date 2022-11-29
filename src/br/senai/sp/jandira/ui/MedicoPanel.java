/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author 22282080
 */
public class MedicoPanel extends javax.swing.JPanel {
    int linha;

    public MedicoPanel() {
        initComponents();
        criarTabelaMedico();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        scrollTablePlanosDeSaude = new javax.swing.JScrollPane();
        tableMedico = new javax.swing.JTable();
        buttonExcluirPlanoDeSaude = new javax.swing.JButton();
        buttonAlterarPlanoDeSaude = new javax.swing.JButton();
        buttonAdicionarPlanoDeSaude = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setPreferredSize(new java.awt.Dimension(945, 370));
        setLayout(null);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Médico");
        add(jLabel3);
        jLabel3.setBounds(20, 10, 180, 20);

        tableMedico.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollTablePlanosDeSaude.setViewportView(tableMedico);

        add(scrollTablePlanosDeSaude);
        scrollTablePlanosDeSaude.setBounds(20, 40, 905, 240);

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
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAlterarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarPlanoDeSaudeActionPerformed
        linha = tableMedico.getSelectedRow();
        if (linha != -1) {
            editar();
            criarTabelaMedico();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione o médico que você deseja alterar",
                    "Médico",
                    JOptionPane.WARNING_MESSAGE);
            criarTabelaMedico();
        }
        
    }//GEN-LAST:event_buttonAlterarPlanoDeSaudeActionPerformed

    private void buttonAdicionarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarPlanoDeSaudeActionPerformed
    MedicoDialog medicoDialog = new MedicoDialog(
                null,
                true,
                TipoOperacao.ADICIONAR,
                null);
        medicoDialog.setVisible(true);
        criarTabelaMedico();
    }//GEN-LAST:event_buttonAdicionarPlanoDeSaudeActionPerformed

    private void buttonExcluirPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPlanoDeSaudeActionPerformed
      linha = tableMedico.getSelectedRow();
        if (linha != -1) {
            excluir();
            criarTabelaMedico();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione o médico que você deseja excluir",
                    "Médico",
                    JOptionPane.WARNING_MESSAGE);
            criarTabelaMedico();
        }
    }//GEN-LAST:event_buttonExcluirPlanoDeSaudeActionPerformed
     private void editar() {
        Medico medico = MedicoDAO.getMedico(getCodigoSelecionado());
        MedicoDialog medicoDialog = new MedicoDialog(
                null,
                true,
                TipoOperacao.ALTERAR,
                medico);
        medicoDialog.setVisible(true);
    }

    private void excluir() { 
        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão do médico?",
                "Médico",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (resposta == 0) {
            String codigoStr = tableMedico.getValueAt(linha, 0).toString();
            Integer codigo = Integer.valueOf(codigoStr);
           MedicoDAO.excluir(codigo);
            criarTabelaMedico();
        }
    }

    private Integer getCodigoSelecionado() {
        String codigoStr = tableMedico.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarPlanoDeSaude;
    private javax.swing.JButton buttonAlterarPlanoDeSaude;
    private javax.swing.JButton buttonExcluirPlanoDeSaude;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane scrollTablePlanosDeSaude;
    private javax.swing.JTable tableMedico;
    // End of variables declaration//GEN-END:variables
private void criarTabelaMedico() {

        tableMedico.setModel(MedicoDAO.getTableModel());

        // Desativar o redimensionamento da JTable
        tableMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Definir a largura de cada coluna
        tableMedico.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedico.getColumnModel().getColumn(1).setPreferredWidth(300);
        tableMedico.getColumnModel().getColumn(2).setPreferredWidth(300);

        // Impedir/bloquear a movimentação das colunas
        tableMedico.getTableHeader().setReorderingAllowed(false);

        // Bloquear edição das células
        tableMedico.setDefaultEditor(Object.class, null);

    }
}
