package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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

        try {
            medicos.add(medico);
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            String novoMedico = medico.getMedicoSeparadoPorPontoEVirgula();

            bw.write(novoMedico);
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERRO");

        }
        medicos.add(medico);
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

    private static void atualizarCodigo() {
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {
            arquivoTemp.createNewFile();

            BufferedWriter bwTemp = Files.newBufferedWriter(PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for (Medico m : medicos) {
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

    public static void getListaMedico() {
        try {
            // abriro arquivo para leitura - LEITOR
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");

                int i = 0;
                ArrayList<Especialidade> especialidades = new ArrayList<>();
                while (linhaVetor.length > i + 6) {
                    especialidades.add(EspecialidadeDAO.getEspecialidade(Integer.valueOf(linhaVetor[6 + i])));
                    i++;
                }

                String[] data = linhaVetor[6].split("/");
                int ano = Integer.parseInt(data[2]);
                int mes = Integer.parseInt(data[1]);
                int dia = Integer.parseInt(data[0]);
                LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

                Medico novoMedico = new Medico(
                        linhaVetor[0],
                        linhaVetor[1],
                        linhaVetor[2],
                        linhaVetor[3],
                        LocalDate.MIN,
                        especialidades);

                linha = br.readLine();
            }
            br.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao abrir o arquivo.",
                    "ERRO",
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
            dados[i][1] = m.getNome();
            dados[i][2] = m.getEspecialidade();
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
