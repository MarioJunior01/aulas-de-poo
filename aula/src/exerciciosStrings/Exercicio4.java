package exerciciosStrings;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("digite uma palavra ou uma frase");
        
        Scanner lerTeclado = new Scanner(System.in);
        
        String palavraFrase = new String(lerTeclado.nextLine());

        System.out.println(palavraFrase.toLowerCase());

        lerTeclado.close();

    }

}
