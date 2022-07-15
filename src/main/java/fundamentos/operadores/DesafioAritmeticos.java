package fundamentos.operadores;

public class DesafioAritmeticos {

    public void executar(){

        /* Ex:
        int a = 3 * 4 - 10;
        int b = (int) Math.pow(a, 3);
        double c = Math.pow(a, 3);

        System.out.println(b);

         */

        int a = 6 * (3 + 2);
        int b = 3 * 2;
        double x = Math.pow(a, 2) / b;
        System.out.println(x);

        int c = (((1 - 5) * (2 - 7)) / 2);
        double y = Math.pow(c, 2);
        System.out.println(y);

        double d = x - y;
        double z = Math.pow(d, 3);
        System.out.println(z);

        double res = z / (Math.pow(c, 3));
        System.out.println(res);


    }
}
