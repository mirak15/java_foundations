package main;
import model.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
    /*Input de informações do aluno */
        Aluno aluno = new Aluno();
        aluno.setNome("Matheus");   
        aluno.setEndereco("Bairro Alto");
        aluno.setIdade(18);
        aluno.setMatricula(1);
    /*Input de informações do aluno2. */
        Aluno aluno2 = new Aluno("Pedro", "Cohab2", 30, 2);

        /*System.out.println(aluno);*/

    /*Ele está encaminhando as informações do método visualizar aluno do Aluno.java*/
        aluno.visualizar();
    /*Linha para quebrar a visualização entre ambos alunos.  */
        System.out.println();
    /*Está encaminhando as informações do método visaulizar aluno2 do Aluno.java */
        aluno2.visualizar();
    }
   
}
