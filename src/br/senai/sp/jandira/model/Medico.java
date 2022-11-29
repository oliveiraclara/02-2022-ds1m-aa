/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
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
    
    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Medico.contador = contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getMedicoSeparadoPorPontoEVirgula() {
        String especialidadeStr = this.codigo + ";" + this.nome + ";" + this.especialidade;
        return especialidadeStr;
    }
    
}
