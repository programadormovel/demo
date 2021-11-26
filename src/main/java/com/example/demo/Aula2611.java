package com.example.demo;

import javax.swing.JOptionPane;

public class Aula2611 {

    public static void teste(){

        System.out.println("teste");

        Pessoa p = new Pessoa();
        p.nome = "Adão";
        p.idade = 18;

        System.out.println(p.nome);
        System.out.println(p.idade);

    }

    
}

class Pessoa{
    String nome;
    int idade;
}