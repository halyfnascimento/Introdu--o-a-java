import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class list2{
    /**
     * @param args
     */
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);

        List<String> Lista_String = new ArrayList<String>();
        List<Integer> Lista_Int = new ArrayList<Integer>();

        Lista_String.add("Kaleo");
        Lista_String.add("Kaly");
        Lista_String.add("Charllene");
        Lista_String.add("Jorge");
        Lista_String.add("Janaina");

        System.out.println(Lista_String);

        Lista_String.remove(0);

        System.out.println(Lista_String);

        Lista_String.set(0, "Kaleandra");

        System.out.println(Lista_String);

      
        //Lista ordenada, alfabeticamente.
        Collections.sort(Lista_String);

            for(String i : Lista_String){
                System.out.println(i);

                teclado.close();
            }
        }

    
     /*    int n;
for (int i = 0; i < 5; i++){
        System.out.println("Digite alguns numeros");
        n = teclado.nextInt();
        Lista_Int.add(n);
}

        for(int valor : Lista_Int){
           System.out.println(valor); 
        }
     */
    }
