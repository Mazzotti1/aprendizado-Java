package loops;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int soma = 0;

    System.out.println("Digite o primeiro número: ");
    int numero1 = scan.nextInt();

    System.out.println("Digite o segundo número: ");
    int numero2 = scan.nextInt();

        for (int i = numero1; i < numero2 + 1; i++) {
            System.out.println(i);
            soma = soma + i;
        }
        System.out.println("Soma total dos números é:" + soma);

        scan.close();
}

}
