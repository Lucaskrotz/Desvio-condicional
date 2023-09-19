/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desviocondicionalexemploo;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Exercicio04 {

    public static void main(String[] args) {

        String usuario = "Lucas";
        String senha = "12345";

        Scanner entrada = new Scanner(System.in);

        int valorConta = 5000;

        System.out.println("Digite o nome de  usuario ");
        String usuarioId = entrada.next();

        System.out.println("Digite a sua senha aqui: ");
        String senhaId = entrada.next();

        if (usuarioId.equals(usuario) && senhaId.equals(senha)) {
            System.out.println("Usario logado com sucesso");
            System.out.println("Quais opcões voce Deseja");
            System.out.println("S -  Saque");
            System.out.println("D - Deposito");
            System.out.println("M - Monstar Saldo Conta");
            String opcoes = entrada.next();

            if (opcoes.equalsIgnoreCase("S")) {

                System.out.println("Digite o valor para fazer o saque");
                int saque = entrada.nextInt();
                
                if(saque <= valorConta){
                valorConta = valorConta - saque;
                              
                System.out.println("o valor de saque é de " + saque + " Agora o valor total de sua conta é de " + valorConta);
                
                } else {
                 
                    System.out.println("Saldo insuficiente");
                    
                }
                
                System.out.println("Sistem encerrado com sucesso");
                
            } else if (opcoes.equalsIgnoreCase("D")) {

                System.out.println("Digite o valor para deposito");
                int deposito = entrada.nextInt();

                valorConta = valorConta + deposito;

                System.out.println(" o valor de deposito foi de " + deposito + " Agora o valor total de sua conta é de " + valorConta);
                
                System.out.println("Sistem encerrado com sucesso");

            } else if (opcoes.equalsIgnoreCase("M")) {

                System.out.println("o valor da sua conta é de " + valorConta);  
                
                System.out.println("Sistem encerrado com sucesso");
            } 

        } else {

            System.out.println("O nome e a senha estao Incorretos");

        } 

    }

}
