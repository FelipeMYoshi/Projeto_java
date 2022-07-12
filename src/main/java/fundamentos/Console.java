package fundamentos;

import java.util.Scanner;

public class Console {

    public void executar(){

        System.out.print("Bom"); // print normal
        System.out.print(" dia!\n\n");

        System.out.println("Bom"); // print na linha
        System.out.println("dia!");

        // print formatado ou .format. "%n" salta uma linha
        System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
        // print fomatado com 1 casa deciamal "%.1f"
        System.out.printf("Salário: %.1f%n", 1234.5678);
        // print fomatado com string "%s"
        System.out.printf("Nome: %s%n", "Felipe");

        // Scanner no sentido de fazer a leitura
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: \n");
        String nome = teclado.nextLine(); //nextLine salva a variavel string digitada

        System.out.print("Digite seu sobrenome: \n");
        String sobrenome = teclado.nextLine();

        System.out.print("Digite sua idade: \n");
        int idade = teclado.nextInt(); // nextInt para variáveis int


        System.out.printf("\nNome: %s %s %d anos", nome, sobrenome, idade);

        teclado.close();



    }

}
