package ex;

import java.util.Scanner;

public class EsempioScanner {

    // Riscriviamo un metodo avarage ma con una complicazione non indifferente,
    // l'imput dati verrà da scanner di input tastiera

    public static void main(String[] args) {
        System.out.println("Please insert the amount of number:");
        int numero_valori = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numero_valori = scanner.nextInt();
                break;
            } else {
                System.out.println("Not valid digit");
            }
        }
        System.out.println("Please insert all numbers:");
        double[] toCalculate = new double[numero_valori];
        double total = 0;
        for (int i = 0; i < numero_valori; i++) {
            if (scanner.hasNextDouble()) {
                toCalculate[i] = scanner.nextDouble();
                total += toCalculate[i];
            } else {
                System.out.println("Not valid digit");
            }
        }
        scanner.close();
        double result = total / numero_valori;
        System.out.println("The average value is " + result);

    }

}
