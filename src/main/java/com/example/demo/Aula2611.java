package com.example.demo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aula2611 {

    public static void teste(){

        // Saída de dados
        System.out.println("Açai com banana");

        // Criação de objeto
        Pessoa p1 = new Pessoa();
        
        // Criação de objeto de entrada de dados
        Scanner teclado = new Scanner(System.in);
        
        // Saída de dados - orientação ao usuário
        System.out.println("Entre com uma idade: ");
        
        // Atribuição de dados via teclado - Entrada de Dados pelo teclado
        p1.idade = teclado.nextInt();

        // Saída de dados
        System.out.println("A idade digitada foi " + p1.idade);
        
        // Chamada de Métodos
        p1.falar("sozinho");
        
        System.out.println(p1.falar());
        

    }

    
}

class Pessoa{
    // Atributos
    String nome;
    int idade;
    
    // Métodos
    public void falar(String parametro){
        System.out.println("Falando ...." + parametro);
    }
    
    public String falar(){
        return "Falando com retorno...";
    }
}