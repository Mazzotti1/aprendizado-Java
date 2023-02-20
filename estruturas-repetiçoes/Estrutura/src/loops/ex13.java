package loops;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int A; //3%
        int B; //1.5%
        double taxaCrescimentoA;
        double taxaCrescimentoB;

        do {
            System.out.print("Informe quantos habitantes tem a cidade A: ");
            A = scan.nextInt();
        } while (A < 0 || A > 80000);


        do {
            System.out.print("Informe quantos habitantes tem a cidade B: ");
            B = scan.nextInt();

        } while (B < 80000 || B > 200000);

        do {
            System.out.print("Informe a taxa de crescimento habitacional da cidade A  : ");
            taxaCrescimentoA = scan.nextDouble();

        } while ( taxaCrescimentoA < 0 );

        do {
            System.out.print("Informe a taxa de crescimento habitacional da cidade B  : ");
            taxaCrescimentoB = scan.nextDouble();

        } while ( taxaCrescimentoB < 0 );



        int anos = 0;


        while (A <= B){

            A += (int) (A * taxaCrescimentoA / 100);
            B += (int) (B * taxaCrescimentoB / 100);
            anos++;
        }
        System.out.println("Levará " + anos + " anos para a população de A ultrapassar ou igualar a população de B.");
        scan.close();
    }
}
