package br.senai.sp.jandira.model;

public class Especialidade {

    private String nome;
    private String descricao;
    public Integer codigo;
    private static int contador = 100;

    public Especialidade() {
        atualizarCodigo();
    }

    public Especialidade(String nome) {
        this.nome = nome;
        atualizarCodigo();
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        atualizarCodigo();
    }

    public Especialidade(Integer codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.contador = this.codigo;

    }

    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;

    }
    // Métodos de acesso getters and setters

    public Integer getCodigo() {
        return codigo;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean getQuantidade() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getEspecialidadeSeparadaPorPontoEVirgula() {
        String especialidadeStr = this.codigo + ";" + this.nome + ";" + this.descricao;
        return especialidadeStr;
    }

}
