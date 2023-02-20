package loops;

import java.util.Scanner;

public class ex12 {
    private static final boolean F = false;
    private static final boolean M = true;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

        do {
            System.out.print("Digite o nome (maior que 3 caracteres): ");
            nome = scan.nextLine();
        } while (nome.length() < 3);

        do {
            System.out.print("Digite a idade (entre 0 e 150): ");
            idade = scan.nextInt();
            scan.nextLine();
        } while (idade < 0 || idade > 150);


        do {
            System.out.print("Digite o salário (maior que zero): ");
            salario = scan.nextDouble();
            scan.nextLine();
        } while (salario <= 0);


        do {
            System.out.print("Digite o sexo (f/m): ");
            sexo = scan.nextLine().charAt(0);
        } while (sexo != 'f' && sexo != 'm');


        do {
            System.out.print("Digite o estado civil (s/c/v/d): ");
            estadoCivil = scan.nextLine().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        // Exibe as informações fornecidas
        System.out.println("\nInformações fornecidas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);

    }
}


