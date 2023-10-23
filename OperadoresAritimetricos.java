//Operadores Aritimetricos.

import java.util.Scanner;

public class OperadoresAritimetricos {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    
    int numero = 2, numero2 = 5,
    soma = numero + numero2, sub = numero - numero2,
    multi = numero * numero2, divisao = numero / numero2;

    System.out.printf("A soma do numero %d, com o numero %d é de %d \n", numero, numero2, soma);
    System.out.printf("A multiplicação do numero %d, com o numero %d é de %d \n", numero, numero2, multi);
    System.out.printf("A subtração do numero %d, com o numero %d é de %d \n", numero, numero2, sub);
    System.out.printf("A divisão do numero %d, com o numero %d é de %d \n", numero, numero2, divisao);


    int n1, n2;
    System.out.println("Digite um número");
    n1 = teclado.nextInt();
    System.out.println("Digite outro número");
    n2 = teclado.nextInt();

    int resto = n1 % n2;

    System.out.printf("o resto da divisão de %d e de %d é igual a %d", n1, n2, resto);

    teclado.close();
    }

public class OperadoresDeIgualdade{
    public static void main(String[] args){

        /*== Igual
         != diferente
        */

        /*
         * && Duas ou mais expresões devem ser Verdadeiras.
         * || Uma das Operações devem ser verdadeiras.
         * 
         */



    }
}
}




