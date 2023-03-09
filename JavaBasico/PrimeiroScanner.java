package cursoEmVideo;
import java.util.Scanner;

public class PrimeiroScanner {
    public static void main(String [] args){
        System.out.println("Digite seu nome");
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade");
        Scanner idade = new Scanner(System.in);
        int idades = idade.nextInt();
        if (idades > 18)
            System.out.println("olá " + nome + " Você é de maior");
        else
            System.out.println(nome + " Você é de menor");

    }
    
}
