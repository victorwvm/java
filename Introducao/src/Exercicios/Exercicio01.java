package Exercicios;

public class Exercicio01 {
    public static void main(String[] args) {

        String prodcut1 = "Computer";
        String prodcut2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, wich price is $ %.2f%n", prodcut1, price1);
        System.out.printf("%s, wich price is $ %.2f%n", prodcut2, price2);
        System.out.println("");
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.println("");
        System.out.printf("Measue with eight decimal places: %f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}