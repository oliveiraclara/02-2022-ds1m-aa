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

    private void atualizarCodigo() {
        this.codigo = contador;
        contador++;
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


    
}
