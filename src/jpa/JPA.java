/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import entidades.Aluno;

/**
 *
 * @author User
 */
public class JPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
       /* 
        aluno.setNome("jose");
        aluno.setMatricula("1234");
        aluno.setMedia(10);
        System.out.print(aluno.toString());
        */
       /*
        aluno.excluir(151L);
        System.out.print("Aluno exluído com sucesso");
        */
       
        aluno = aluno.consultar(101L);
        aluno.setMedia(5);
        aluno.alterar();
        
        System.out.print(aluno.toString());    
            
    }
    
}
