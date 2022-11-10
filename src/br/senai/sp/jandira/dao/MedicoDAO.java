package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {
     private Medico medico;
    private static ArrayList<Medico> medicos = new ArrayList<>();

    private final static String ARQUIVO = "C:\\Users\\22282080\\JavaProject\\medico.txt";
    private final static String ARQUIVO_TEMP = "C:\\Users\\22282080\\JavaProject\\medico_temp.txt";
    private final static Path PATH = Paths.get(ARQUIVO);
    private final static Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public MedicoDAO(Medico medico) {
        this.medicos.add(medico);
    }

    public MedicoDAO() {

    }
    public static void gravar(Medico medico) {
        medicos.add(medico);

        try {
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            String novoPlanoDeSaude = medico.getMedicoSeparadoPorPontoEVirgula();

            bw.write(novoPlanoDeSaude);
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "");

        }
    }

    public static boolean excluir(Integer codigo) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                medicos.remove(m);
                break;
            }
        }
        atualizarCodigo();
        return false;
    }
     private static void atualizarCodigo(){
         File arquivoAtual = new File(ARQUIVO);
            File arquivoTemp = new File(ARQUIVO_TEMP);
            
            try {
                arquivoTemp.createNewFile();
                
                BufferedWriter bwTemp = Files.newBufferedWriter(PATH_TEMP, 
                        StandardOpenOption.APPEND, 
                        StandardOpenOption.WRITE);
                
                for(Medico m: medicos){
                    bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                    bwTemp.newLine();
                }
                
                bwTemp.close();
                
                arquivoAtual.delete();
                
                arquivoTemp.renameTo(arquivoAtual);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(
                        null, 
                        "Ocorreu um erro ao criar o arquivo", 
                        "Erro", 
                        JOptionPane.ERROR_MESSAGE);
            }
     }
    
    public static Medico getMedico(Integer codigo) {

        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }

    public static void atualizar(Medico medico) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(medico.getCodigo())) {
                medicos.set(medicos.indexOf(m), medico);
                break;
            }
            atualizarCodigo();
        }
    }

    public static ArrayList<Medico> listarTodos() {
        return medicos;
    }
     
    public static void getMedicos() {
        try {
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                Medico novaEspecialidade = new Medico(
                        Integer.valueOf(linhaVetor[0]),
                        linhaVetor[1],
                        linhaVetor[2]);
                medicos.add(novaEspecialidade);
                linha = br.readLine();
            }
            br.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao abrir o arquivo",
                    "Erro de leitura",
                    JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public static DefaultTableModel getTableModel() {

        // Matriz que receberá os planos de saúde
        // que serão utilizados na Tabela (JTable)
        Object[][] dados = new Object[medicos.size()][3];

        // For Each, para extrair cada objeto plano de saúde do
        // arraylist planos e separar cada dado na matriz dados
        int i = 0;
        for (Medico m : medicos) {
            dados[i][0] = m.getCodigo();
            dados[1][1] = m.getNome();
            dados[i][2] = m.getEspecialidades();
            i++;
        }

        // Definir um vetor com os nomes das colulas da tabela
        String[] titulos = {"Código", "Nome do médico", "Especialidade"};

        // Criar o modelo que será utilizado pela JTable 
        // para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }
    
    
}
