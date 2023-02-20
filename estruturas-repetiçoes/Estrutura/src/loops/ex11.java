package loops;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


      String nome;
      String senha;


        do {
            System.out.print("Digite seu nome: ");
            nome = scan.next();
            System.out.print("Digite sua senha: ");
            senha = scan.next();

            if (nome.equals(senha)) {
                System.out.println("Senha não pode ser igual ao nome do usuário");
            }
        } while (nome.equals(senha));
        System.out.println("\n Login realizado com sucesso!");
        scan.close();
    }
}
