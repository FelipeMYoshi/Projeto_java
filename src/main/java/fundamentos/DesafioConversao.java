package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public void executar(){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite os três ultimos salários: \n");
        System.out.print("Digite salário 1: \n");
        String valor1 = teclado.next().replace(",", ".");

        System.out.print("Digite salário 2: \n");
        String valor2 = teclado.next().replace(",", ".");

        System.out.print("Digite salário 3: \n");
        String valor3 = teclado.next().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double soma = salario1 + salario2 + salario3;
        double media = soma / 3;

        System.out.println("A média dos salários é : " + media);

        teclado.close();
    }
}
