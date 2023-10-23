import java.util.Scanner;

public class Array {
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

      /*   int[] pessoa = new int[4];


        System.out.println(pessoa[0]);
        
         for (int i = 0; i < 4; i++) {
            System.out.println("Digite um numero");
            pessoa[i] = teclado.nextInt();
        }
 */

        int [] numeros = new int[5];

        numeros[0] = 819972315;
         numeros[1] = 8199723;
          numeros[2] = 81997;
           numeros[3] = 819;
            numeros[4] = 8;

         for(int contado = 0; contado < numeros.length; contado++){
            System.out.println(numeros[contado]);
        }

            for(int o : numeros){
                System.out.println(o);
            }
        
        teclado.close();
    }
}
