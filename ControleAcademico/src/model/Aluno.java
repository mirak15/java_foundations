package model;

public class Aluno {
    private String nome;
    private String endereco;
    private int idade;
    private int matricula;

    /*Entrelaça uma conexão com aluno na classe App.java */
    public Aluno(){}

public Aluno(String nome, String endereco, int idade, int matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.matricula = matricula;
    }

    /*Função e método: Getters & Setters */
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
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
/*Método To String:  */
    @Override
    public String toString() {
        return "Aluno" + "nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + ", matricula=" + matricula + "";
    }

    /*Método visualizar, para entregar as informações no App.java ultilizando Sysout */
    public void visualizar(){
        System.out.println("Aluno" );
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Idade: " + idade);
        System.out.println("Número de Marícula: " + matricula);
     }
}



   
