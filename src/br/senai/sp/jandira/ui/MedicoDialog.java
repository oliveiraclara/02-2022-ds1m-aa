/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;

public class MedicoDialog extends javax.swing.JDialog {
    private TipoOperacao tipoOperacao;
    private Medico medico;
    public MedicoDialog(java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            Medico medico) {
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.medico = medico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        labelTitulo1 = new javax.swing.JLabel();
        iconTitulo1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        detalhesMedico = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        textFieldCodigo1 = new javax.swing.JTextPane();
        crm = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        textCrm = new javax.swing.JTextPane();
        nomeDoMedico = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        textNomeDoMedico = new javax.swing.JTextPane();
        labelTelefone = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textTelefone = new javax.swing.JTextPane();
        labelEmail = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        textEmail = new javax.swing.JTextPane();
        labelDataDeNascimento = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        textDataDeNascimento = new javax.swing.JTextPane();
        labelListaDeEspecialidades = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        listaEspecialidades = new javax.swing.JList<>();
        labelEspecialidadesDosMedicos = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        listaMedicos = new javax.swing.JList<>();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonMoverDireita = new javax.swing.JButton();
        buttonMoverEsquerda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(671, 504));
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(null);

        labelTitulo1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        labelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo1.setText("Médico - Adicionar");
        jPanel4.add(labelTitulo1);
        labelTitulo1.setBounds(90, 20, 500, 40);

        iconTitulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/addPlano64.png"))); // NOI18N
        jPanel4.add(iconTitulo1);
        iconTitulo1.setBounds(10, 10, 70, 70);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 670, 80);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMinimumSize(new java.awt.Dimension(630, 370));
        jPanel1.setLayout(null);

        detalhesMedico.setText("Detalhes do Médico:");
        jPanel1.add(detalhesMedico);
        detalhesMedico.setBounds(20, 10, 150, 16);

        labelCodigo.setText("Código:");
        jPanel1.add(labelCodigo);
        labelCodigo.setBounds(20, 50, 50, 16);

        textFieldCodigo1.setEditable(false);
        jScrollPane5.setViewportView(textFieldCodigo1);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(20, 70, 80, 22);

        crm.setText("CRM:");
        jPanel1.add(crm);
        crm.setBounds(110, 50, 80, 16);

        jScrollPane9.setViewportView(textCrm);

        jPanel1.add(jScrollPane9);
        jScrollPane9.setBounds(110, 70, 120, 22);

        nomeDoMedico.setText("Nome do(a) Médico(a):");
        jPanel1.add(nomeDoMedico);
        nomeDoMedico.setBounds(240, 50, 140, 16);

        jScrollPane8.setViewportView(textNomeDoMedico);

        jPanel1.add(jScrollPane8);
        jScrollPane8.setBounds(240, 70, 370, 22);

        labelTelefone.setText("Telefone:");
        jPanel1.add(labelTelefone);
        labelTelefone.setBounds(20, 110, 50, 16);

        jScrollPane4.setViewportView(textTelefone);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(20, 130, 130, 22);

        labelEmail.setText("E-mail:");
        jPanel1.add(labelEmail);
        labelEmail.setBounds(160, 110, 50, 16);

        jScrollPane6.setViewportView(textEmail);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(160, 130, 320, 22);

        labelDataDeNascimento.setText("Data de Nascimento:");
        jPanel1.add(labelDataDeNascimento);
        labelDataDeNascimento.setBounds(490, 110, 120, 16);

        jScrollPane7.setViewportView(textDataDeNascimento);

        jPanel1.add(jScrollPane7);
        jScrollPane7.setBounds(490, 130, 120, 22);

        labelListaDeEspecialidades.setText("Lista de especialidades:");
        jPanel1.add(labelListaDeEspecialidades);
        labelListaDeEspecialidades.setBounds(20, 170, 130, 16);

        listaEspecialidades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane11.setViewportView(listaEspecialidades);

        jPanel1.add(jScrollPane11);
        jScrollPane11.setBounds(20, 190, 150, 146);

        labelEspecialidadesDosMedicos.setText("Especialidades dos médicos:");
        jPanel1.add(labelEspecialidadesDosMedicos);
        labelEspecialidadesDosMedicos.setBounds(260, 170, 160, 16);

        listaMedicos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane10.setViewportView(listaMedicos);

        jPanel1.add(jScrollPane10);
        jScrollPane10.setBounds(260, 190, 150, 146);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCancelar);
        buttonCancelar.setBounds(450, 290, 70, 60);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/save32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar novo plano");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSalvar);
        buttonSalvar.setBounds(540, 290, 70, 60);

        buttonMoverDireita.setToolTipText("Mover especilidade para o médico.");
        buttonMoverDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMoverDireitaActionPerformed(evt);
            }
        });
        jPanel1.add(buttonMoverDireita);
        buttonMoverDireita.setBounds(180, 190, 70, 60);

        buttonMoverEsquerda.setToolTipText("Excluir especialidade do médico.");
        buttonMoverEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMoverEsquerdaActionPerformed(evt);
            }
        });
        jPanel1.add(buttonMoverEsquerda);
        buttonMoverEsquerda.setBounds(180, 270, 70, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 100, 630, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonMoverDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMoverDireitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMoverDireitaActionPerformed

    private void buttonMoverEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMoverEsquerdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMoverEsquerdaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonMoverDireita;
    private javax.swing.JButton buttonMoverEsquerda;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel crm;
    private javax.swing.JLabel detalhesMedico;
    private javax.swing.JLabel iconTitulo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDataDeNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEspecialidadesDosMedicos;
    private javax.swing.JLabel labelListaDeEspecialidades;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JList<String> listaEspecialidades;
    private javax.swing.JList<String> listaMedicos;
    private javax.swing.JLabel nomeDoMedico;
    private javax.swing.JTextPane textCrm;
    private javax.swing.JTextPane textDataDeNascimento;
    private javax.swing.JTextPane textEmail;
    private javax.swing.JTextPane textFieldCodigo1;
    private javax.swing.JTextPane textNomeDoMedico;
    private javax.swing.JTextPane textTelefone;
    // End of variables declaration//GEN-END:variables
}
