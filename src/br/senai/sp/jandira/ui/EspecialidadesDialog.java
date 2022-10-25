/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;

public class EspecialidadesDialog extends javax.swing.JDialog {
    private TipoOperacao tipoOperacao;
    private Especialidade especialidade;
    public EspecialidadesDialog(java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            Especialidade especialidade) {
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.especialidade = especialidade;
        //Preencher o campos caso o tipo de operação for ALTERAR
        if(tipoOperacao == TipoOperacao.ALTERAR){
            preencherFormulario();
        }
    }
    private void preencherFormulario(){
        labelTitulo1.setText("Planos de Saúde - " + tipoOperacao);
        iconTitulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar64.png")));
        textFieldCodigo.setText(especialidade.getCodigo().toString());
        textNomeDaEspecialidade.setText(especialidade.getNome());
        textDescricao.setText(especialidade.getDescricao());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo1 = new javax.swing.JLabel();
        iconTitulo1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelDescricao = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelNomeDaEspecialidade = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescricao = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        textFieldCodigo = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        textNomeDaEspecialidade = new javax.swing.JTextPane();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        labelDetalhesDaEspecialidade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        labelTitulo1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        labelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo1.setText("Especialidades - Adicionar");
        jPanel1.add(labelTitulo1);
        labelTitulo1.setBounds(90, 20, 500, 40);

        iconTitulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/addPlano64.png"))); // NOI18N
        jPanel1.add(iconTitulo1);
        iconTitulo1.setBounds(10, 10, 70, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 670, 80);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(630, 300));
        jPanel2.setLayout(null);

        labelDescricao.setText("Descrição:");
        jPanel2.add(labelDescricao);
        labelDescricao.setBounds(20, 160, 80, 16);

        labelCodigo.setText("Código:");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(20, 50, 50, 16);

        labelNomeDaEspecialidade.setText("Nome:");
        jPanel2.add(labelNomeDaEspecialidade);
        labelNomeDaEspecialidade.setBounds(20, 100, 50, 16);

        jScrollPane1.setViewportView(textDescricao);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 180, 260, 22);

        textFieldCodigo.setEditable(false);
        jScrollPane2.setViewportView(textFieldCodigo);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(20, 70, 80, 22);

        jScrollPane3.setViewportView(textNomeDaEspecialidade);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(20, 120, 260, 22);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(450, 230, 70, 60);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/save32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar novo plano");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(540, 230, 70, 60);

        labelDetalhesDaEspecialidade.setText("Detalhes da Especialidade:");
        jPanel2.add(labelDetalhesDaEspecialidade);
        labelDetalhesDaEspecialidade.setBounds(20, 10, 150, 16);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 110, 630, 300);

        setBounds(0, 0, 687, 453);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed

        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
 if(tipoOperacao == TipoOperacao.ADICIONAR){
            gravar();
        }else{
            atualizar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed
    private void atualizar(){
        especialidade.setNome(textNomeDaEspecialidade.getText());
        especialidade.setDescricao(textDescricao.getText());
        
        if(validarCadastro()){
            EspecialidadeDAO.atualizar(especialidade);
            JOptionPane.showMessageDialog(
                null, 
                "Especialidade atualizada com sucesso", 
                "Plano de Saúde", 
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
        
    }
    private void gravar(){
        Especialidade especialidade = new Especialidade();
        especialidade.setNome(textNomeDaEspecialidade.getText());
        especialidade.setDescricao(textDescricao.getText());

        if (validarCadastro()){
            EspecialidadeDAO.gravar(especialidade);
            JOptionPane.showMessageDialog(this,
                    "Especialidade gravada com sucesso.",
                    "Especialiadades.",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
    }
    }            
    
    private boolean validarCadastro(){
        if (textNomeDaEspecialidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor preencha o nome da especialidade.",
                    "Especialidades",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (textDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor preencha a descrição da especialidade.",
                    "Especialidades",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel iconTitulo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelDetalhesDaEspecialidade;
    private javax.swing.JLabel labelNomeDaEspecialidade;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JTextPane textDescricao;
    private javax.swing.JTextPane textFieldCodigo;
    private javax.swing.JTextPane textNomeDaEspecialidade;
    // End of variables declaration//GEN-END:variables
}
