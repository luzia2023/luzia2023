package Escola;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Escola {
    public static void main(String[] args) {
        
    
    Aluno luzia = new Aluno();

    luzia.setNome("Luzia Almeida");
    luzia.setIdade(30);

    System.out.println("O nome do aluno é: "+ luzia.getNome());
    System.out.println("A idade do aluno é: "+ luzia.getIdade());
    
    /*

    int n1 = 8;
    int n2 = 6;
    double media;

    media = (n1 + n2)/2;

    System.out.println("O media do aluno é : "+ media);

    */

    int n1;
    int n2;
    double media;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Insera n1");
    n1 = entrada.nextInt();
    
    System.out.println("Insira n2");
    n2 = entrada.nextInt();

    media = (n1 + n2)/2;

    System.out.println("Media: "+ media);
       



        
        
    
    
    
}
}
