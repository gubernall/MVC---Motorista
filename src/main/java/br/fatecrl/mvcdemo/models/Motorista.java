package br.fatecrl.mvcdemo.models;

public class Motorista {
    private String id;
    private String nome;
    private String classificacao;
    private String placa;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Motorista(String id, String nome, String classificacao, String placa) {
        this.id = id;
        this.nome = nome;
        this.classificacao = classificacao;
        this.placa = placa;
    }
}
