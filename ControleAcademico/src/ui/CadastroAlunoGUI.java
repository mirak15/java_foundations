package ui;

import java.io.PrintWriter;

import javax.swing.JOptionPane;

import model.Aluno;

public class CadastroAlunoGUI {
    public static void executar() throws Exception{
        String nome = JOptionPane.showInputDialog("digite o nome:");
        String endereco = JOptionPane.showInputDialog("digite o endereço:");
        String idadeString = JOptionPane.showInputDialog("digite sua idade:");
        int idade = Integer.parseInt(idadeString);
        String matriculaString = JOptionPane.showInputDialog("digite o numero de sua matricula:");
        int matricula = Integer.parseInt(matriculaString);

        Aluno aluno = new Aluno(nome, endereco, idade, matricula);
        /*aluno.visualizar();*/

        /* Persistencia de dados em arquivos - .txt */
        PrintWriter saida = new PrintWriter("alunos.txt");
        saida.println("nome, endereco, idade, matricula");
        saida.println(aluno.getNome() + ", " + aluno.getEndereco() + ", " + aluno.getIdade() + ", " + aluno.getMatricula());
        saida.close();
        

    }
}
