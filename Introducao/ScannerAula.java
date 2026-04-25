package Introducao;

import java.util.Scanner;

public class ScannerAula {
    static void main() {

        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " +x);

        sc.close();
    }
}
