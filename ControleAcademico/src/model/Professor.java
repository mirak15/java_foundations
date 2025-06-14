package model;

public class Professor {
    private String nome;
    private String endereco;
    private int idade;
    private String cpf;
    private String atuacao;

    public Professor(String nome, String endereco, int idade, String cpf, String atuacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.cpf = cpf;
        this.atuacao = atuacao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getAtuacao() {
        return atuacao;
    }
    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }

    @Override
    public String toString() {
        return "Professor [nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + ", cpf=" + cpf + ", atuacao=" + atuacao + "]";
    }  

    public void visualizar(){
        System.out.println();
    }
}
