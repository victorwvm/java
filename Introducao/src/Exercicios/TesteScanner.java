package Exercicios;

import java.util.Scanner;

public class TesteScanner {
    static void main() {
        System.out.println("Quantos anos voce tem?");
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        System.out.println("Voce tem: "+x+ " anos");

        sc.close();
    }

}
