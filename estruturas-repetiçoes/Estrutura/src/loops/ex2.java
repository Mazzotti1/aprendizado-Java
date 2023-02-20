package loops;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Me de uma nota de 0 a 10: ");
        nota = scan.nextInt();
        while(nota > 10 || nota < 0 ){

            System.out.println("Nota inválida! Digite novamente:");
            nota = scan.nextInt();



        }
            System.out.println("Continua aqui...");



    }
}

