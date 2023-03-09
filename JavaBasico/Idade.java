import java.util.Scanner;

public class Idade {
    public static void main (String[] args){
        System.out.println("Em que ano estamos?");
        Scanner scan = new Scanner(System.in);
        int anoAtual = Integer.parseInt(scan.nextLine());
        System.out.println("Em que ano você nasceu?");
        Scanner ano = new Scanner(System.in);
        int anonasc = Integer.parseInt(ano.nextLine());
        int idade = (anoAtual - anonasc);
        System.out.println("Sua idade é " + idade);

    }
}
