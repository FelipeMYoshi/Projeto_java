package fundamentos.operadores;

public class Atribuicao {

    public void exe(){

        int a = 3;
        int b = a;
        int c = a + b;

        int v1 = c += b; // c + b
        int v2 = c -= a; // c - a
        int v3 = c *= b; // c * b
        int v4 = c /= a; // c / a
        int v5 = c %= 2; // sinal de igual redundante


        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);

    }
}
