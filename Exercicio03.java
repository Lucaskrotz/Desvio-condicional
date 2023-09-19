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
public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Infome um valor");
        String sexo = entrada.next();
        
        if(sexo.equals("M")){
        
            System.out.println(" M - Masculino");
        
        } else if (sexo.equals("F")){
        
            System.out.println(" F - Feminino");
        } else {
        
            System.out.print("Sexo invalido");
        }
        
    }
}
