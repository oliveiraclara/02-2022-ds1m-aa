/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public EspecialidadeDAO() {

    }

    public static void gravar(Especialidade especialidade) {
        especialidades.add(especialidade);
    }
    public static boolean excluir(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                return true;
            }
        }
        return false;
    }
    
    public static void atualizar(Especialidade especialidade){
        for(Especialidade e : especialidades){
            if(e.getCodigo().equals(especialidade.getCodigo())){
                especialidades.set(especialidades.indexOf(e), especialidade);
                break;
            }
        }
    }

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }
        return null;
    }

    public static ArrayList<Especialidade> listarTodos() {
        return especialidades;
    }

    public static void criarEspecialidadesTeste() {
        Especialidade e1 = new Especialidade("Cardiologia", "Cuida do coração");
        Especialidade e2 = new Especialidade("Fisioterapia", "Cuida dos ossos e músculos");
        Especialidade e3 = new Especialidade("Otorrino ", "Cuida do ouvido");
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
}
    public static DefaultTableModel getTableModel() {

        // Matriz que receberá os planos de saúde
        // que serão utilizados na Tabela (JTable)
        Object[][] dados = new Object[especialidades.size()][3];

        // For Each, para extrair cada objeto plano de saúde do
        // arraylist planos e separar cada dado na matriz dados
        int i = 0;
        for (Especialidade p : especialidades) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getNome();
            dados[i][2] = p.getDescricao();
            i++;
        }

        // Definir um vetor com os nomes das colulas da tabela
        String[] titulos = {"Código", "Nome da Especialidade", "Descrição"};

        // Criar o modelo que será utilizado pela JTable 
        // para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;
}
}
