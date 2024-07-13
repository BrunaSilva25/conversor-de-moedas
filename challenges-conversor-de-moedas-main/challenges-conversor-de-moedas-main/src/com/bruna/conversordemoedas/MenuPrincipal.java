package com.bruna.conversordemoedas;

import java.util.Scanner;



public class MenuPrincipal {
    public MenuPrincipal(){
        Scanner scanner = new Scanner(System.in);
        Scanner leituraNomeCliente = new Scanner(System.in);
        System.out.println("Prezado(a) cliente, informe o seu nome: ");
        String nomeCliente = leituraNomeCliente.nextLine();
        System.out.println("Olá, " + nomeCliente + ", utilize o nosso " +
                "Conversor de Moedas através do menu abaixo:");

       new ExecutaMenuPrincipal();
    }
}