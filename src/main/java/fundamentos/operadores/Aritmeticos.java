package fundamentos.operadores;

public class Aritmeticos {

    public void executar(){

        System.out.println(2 + 3);

        var x = 35.56;
        double y = 2.2;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);


        int a = 8;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (double) b);

        System.out.println(8 % 3);
        System.out.println(a % b);

        System.out.println(x + y - a * b);

    }

}
