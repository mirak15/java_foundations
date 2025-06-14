package ui;

import javax.swing.JOptionPane;

public class CadastrarProfessorGUI {
    public static void executar() throws Exception{
    String nome = JOptionPane.showInputDialog("digite o seu nome:");
    String endereco = JOptionPane.showInputDialog("digite o seu endereco:");
    String idadeString = JOptionPane.showInputDialog("digite o sua idade:");
    int idade = Integer.parseInt(idadeString);
    String cpf = JOptionPane.showInputDialog("digite seu cpf:");
    }
}
