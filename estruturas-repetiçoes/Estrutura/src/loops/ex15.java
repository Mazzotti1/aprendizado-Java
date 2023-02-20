package loops;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maior = 0;
        int soma = 0;
        int count = 0;
        int numero;


        do {
            System.out.println("Digite 5 números");
             numero = scan.nextInt();

            soma = soma + numero;

            if(numero > maior) maior = numero;

            count++;
        } while (count < 5 );
        System.out.println("O maior número é o: " + maior);
        System.out.println("Média: " + (soma / 5));
        scan.close();
    }
}
