package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico extends Pessoa{
    
    private static int contador = 100;
    private Integer codigo;
    private String crm;
    private String especialidade;
    private LocalDate dataDeNascimento;
    private ArrayList<Especialidade> especialidades;
    
    
    public Medico() {
        atualizarCodigo();
    }

    public Medico(String nome) {
        this.nome = nome;
        atualizarCodigo();
    }

    public Medico(String nome, ArrayList especialidade) {
        this.nome = nome;
        this.especialidades = especialidade;
        atualizarCodigo();
    }

    public Medico(Integer codigo, String nome, String especialidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.especialidade = especialidade;
        this.contador = this.codigo;

    }

    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;

    }
  
//Contrutores da classe
    public Integer getCodigo() {
        return codigo;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Medico.contador = contador;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }
    
    public String getMedicoSeparadoPorPontoEVirgula() {
    String medicoStr = this.codigo + ";" + this.nome  + ";" + this.especialidades;
    return medicoStr;
    }

    public void getEmail(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
