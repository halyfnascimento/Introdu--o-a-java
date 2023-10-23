import java.lang.reflect.Array;
import java.util.Scanner;
public class App{



public static void main(String[] args){

    int a = 2;
    String nome = "kaleo";
    double preco = 2.5;
    boolean ggwp = true;
    char letra = 'S';
    int escolha;

    String sobrenome;

    int numero = 5;

    Scanner teclado = new Scanner(System.in);
    sobrenome = teclado.next();

    escolha = teclado.nextInt();


System.out.printf("Seu nome é %s, e seu sobrenome é %s.", nome, sobrenome);
System.out.println(" ");
if (a == 2){
    System.out.println("Vc acertou");
}
else{
    System.out.println("Vc errou");
}
 if(ggwp == true){
    System.out.println("Parabens");
 }
 else{
    System.out.println("Vc falhou");
 }

switch (escolha) {
    case 1:
        System.out.println("Janeiro");
        break;
    case 2: System.out.println("Fevereiro");   

    default:
    System.out.println("Opção invalida");
        break;
}

for(int cont = 0; cont <= 10; cont++){
    System.out.println(numero * cont);

} 

int contado = 0;
do{
    System.out.println(numero * contado);
    contado++;
}while(contado <= 10);

int contado2 = 0;
while(contado2 <= 10){
    System.out.println(numero * contado2);
    contado2++;
}


teclado.close();
}
}
