package test;

import dominio.Aluno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TesteGit {
    public static void main(String[] args){
        Aluno aluno = new Aluno("39340986814", 18, "Pedro Augusto") ;

        int x = 10;

        if (x < aluno.getIdade()){
            System.out.println("Menor");
        }

        System.out.println(aluno);


      
    }
}