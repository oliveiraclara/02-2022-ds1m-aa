/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class MedicoDialog extends javax.swing.JDialog {

   private TipoOperacao tipoOperacao;
    private Medico medico;
    
    private DefaultListModel<String> listaDasEspecialidades = new DefaultListModel<>();
    private ArrayList<String> especialidades = new ArrayList<>();
    private ArrayList<Especialidade> especialidadesSelecionadas = EspecialidadeDAO.listarTodos();

    private DefaultListModel<String> listaEspecialidadesMedico = new DefaultListModel<>();
    private ArrayList<String> selecionada = new ArrayList<>();
    private ArrayList<Especialidade> especialidadeSelecionadas = new ArrayList<>();
    
    
    public MedicoDialog(java.awt.Frame parent, boolean modal,
            TipoOperacao tipoOperacao,
            Medico medico){
        
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.medico = medico;
        
      // Preencher os campos, caso o tipo de peracao for ALTERAR
      if (tipoOperacao == tipoOperacao.ALTERAR){
         preencherFormulario();
         
      }   
        
    }
    private void preencherFormulario() {
        labelTitulo.setText("Médico - " + tipoOperacao);
        iconTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar64.png")));
        textFieldCodigo.setText(medico.getCodigo().toString());
        textCrm.setText(medico.getCrm());
        textNomeDoMedico.setText(medico.getNome());
        textTelefone.setText(medico.getTelefone());
        textEmail.setText(medico.getEmail());
        textDataDeNascimento.setText(medico.getDataDeNascimento().toString());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        iconTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        detalhesMedico = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        crm = new javax.swing.JLabel();
        nomeDoMedico = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelDataDeNascimento = new javax.swing.JLabel();
        labelListaDeEspecialidades = new javax.swing.JLabel();
        labelEspecialidadesDosMedicos = new javax.swing.JLabel();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonMoverDireita = new javax.swing.JButton();
        buttonAdicionarEspecialidade = new javax.swing.JButton();
        textEmail = new javax.swing.JTextField();
        textTelefone = new javax.swing.JTextField();
        textFieldCodigo = new javax.swing.JTextField();
        textNomeDoMedico = new javax.swing.JTextField();
        textCrm = new javax.swing.JTextField();
        textDataDeNascimento = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaEspecialidadesDosMedicos = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaEspecialidade = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(671, 504));
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Médico - Adicionar");
        jPanel4.add(labelTitulo);
        labelTitulo.setBounds(90, 20, 500, 40);

        iconTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/addPlano64.png"))); // NOI18N
        jPanel4.add(iconTitulo);
        iconTitulo.setBounds(10, 10, 70, 70);

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

        crm.setText("CRM:");
        jPanel1.add(crm);
        crm.setBounds(110, 50, 80, 16);

        nomeDoMedico.setText("Nome do(a) Médico(a):");
        jPanel1.add(nomeDoMedico);
        nomeDoMedico.setBounds(240, 50, 140, 16);

        labelTelefone.setText("Telefone:");
        jPanel1.add(labelTelefone);
        labelTelefone.setBounds(20, 110, 120, 16);

        labelEmail.setText("E-mail:");
        jPanel1.add(labelEmail);
        labelEmail.setBounds(160, 110, 50, 16);

        labelDataDeNascimento.setText("Data de Nascimento:");
        jPanel1.add(labelDataDeNascimento);
        labelDataDeNascimento.setBounds(490, 110, 120, 16);

        labelListaDeEspecialidades.setText("Lista de especialidades:");
        jPanel1.add(labelListaDeEspecialidades);
        labelListaDeEspecialidades.setBounds(20, 170, 250, 16);

        labelEspecialidadesDosMedicos.setText("Especialidades dos médicos:");
        jPanel1.add(labelEspecialidadesDosMedicos);
        labelEspecialidadesDosMedicos.setBounds(280, 170, 340, 16);

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
        buttonSalvar.setToolTipText("Salvar novo médico");
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

        buttonAdicionarEspecialidade.setToolTipText("Excluir especialidade do médico.");
        buttonAdicionarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadeActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAdicionarEspecialidade);
        buttonAdicionarEspecialidade.setBounds(180, 270, 70, 60);

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });
        jPanel1.add(textEmail);
        textEmail.setBounds(160, 130, 320, 22);

        textTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(textTelefone);
        textTelefone.setBounds(20, 130, 130, 22);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldCodigo);
        textFieldCodigo.setBounds(20, 70, 64, 22);

        textNomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeDoMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(textNomeDoMedico);
        textNomeDoMedico.setBounds(240, 70, 370, 22);
        jPanel1.add(textCrm);
        textCrm.setBounds(110, 70, 110, 22);

        textDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDataDeNascimentoActionPerformed(evt);
            }
        });
        jPanel1.add(textDataDeNascimento);
        textDataDeNascimento.setBounds(490, 130, 120, 22);

        listaEspecialidadesDosMedicos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaEspecialidadesDosMedicos);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(280, 190, 130, 146);

        listaEspecialidade.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(listaEspecialidade);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(20, 190, 130, 146);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 100, 630, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (tipoOperacao == TipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }

    }//GEN-LAST:event_buttonSalvarActionPerformed
    private void atualizar() {
        medico.setNome(textNomeDoMedico.getText());
        medico.setCrm(textCrm.getText());
        medico.setEmail(textEmail.getText());
        medico.setTelefone(textTelefone.getText());

        if (validarCadastro()) {
            MedicoDAO.atualizar(medico);
            JOptionPane.showMessageDialog(
                    null,
                    "Médico atualizado com sucesso",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }

    }

    private boolean validarCadastro() {
        if (textNomeDoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor preencha o nome do médico.",
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (textCrm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor preencha o CRM do médico.",
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (textEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor preencha o e-mail.",
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (textTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor preencha o telefone",
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private void gravar() {
        Medico medico = new Medico();
        medico.setNome(textNomeDoMedico.getText());
        medico.setCrm(textCrm.getText());
        medico.setEmail(textEmail.getText());
        medico.setTelefone(textTelefone.getText());
        medico.setDataDeNascimento(LocalDate.parse(textDataDeNascimento.getText(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        if (validarCadastro()) {
            MedicoDAO.gravar(medico);
            JOptionPane.showMessageDialog(this,
                    "Novo médico gravado com sucesso.",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }
    private void buttonMoverDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMoverDireitaActionPerformed
          java.util.List<String> remove = listaEspecialidade.getSelectedValuesList();
          
          for(String e: remove){
              especialidades.add(e);
          }
          for(Especialidade  e: especialidadesSelecionadas){
              if(remove.contains(e.getNome())){
                  especialidadeSelecionadas.remove(e);
              }
              
          }
          
          listaDasEspecialidades.clear();
          listaDasEspecialidades.addAll(especialidades);
          listaEspecialidadesDosMedicos.setModel(listaDasEspecialidades);
          
          java.util.List<String> excluir = listaEspecialidadesDosMedicos.getSelectedValuesList();
          for(String e: excluir){
              especialidadeSelecionadas.remove(e);
              selecionada.remove(e);
          }
    }//GEN-LAST:event_buttonMoverDireitaActionPerformed

    private void buttonAdicionarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadeActionPerformed
    java.util.List<String>especialidadeMedico = listaEspecialidadesDosMedicos.getSelectedValuesList();
                
        
        for(String e : especialidadeMedico){
            selecionada.add(e);
        }
        for(Especialidade e : especialidadesSelecionadas){
            if(especialidadeMedico.contains(e.getNome())){
                especialidadesSelecionadas.add(e);
            }
        }

        listaEspecialidadesMedico.clear();
        listaEspecialidadesMedico.addAll(selecionada);
        int[] excluir = listaEspecialidadesDosMedicos.getSelectedIndices();
        for(int e : excluir){
            listaDasEspecialidades.remove(e);
            especialidades.remove(e);

        }
    }//GEN-LAST:event_buttonAdicionarEspecialidadeActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void textTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefoneActionPerformed

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textNomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeDoMedicoActionPerformed

    private void textDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDataDeNascimentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidade;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonMoverDireita;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel crm;
    private javax.swing.JLabel detalhesMedico;
    private javax.swing.JLabel iconTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDataDeNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEspecialidadesDosMedicos;
    private javax.swing.JLabel labelListaDeEspecialidades;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listaEspecialidade;
    private javax.swing.JList<String> listaEspecialidadesDosMedicos;
    private javax.swing.JLabel nomeDoMedico;
    private javax.swing.JTextField textCrm;
    private javax.swing.JTextField textDataDeNascimento;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textNomeDoMedico;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration//GEN-END:variables
}
