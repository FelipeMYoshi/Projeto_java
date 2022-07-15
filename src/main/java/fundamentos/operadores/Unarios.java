package fundamentos.operadores;

public class Unarios {

    public void exe(){

        int a = 1;
        int a1 = 1;
        int b = 2;
        int b1 = 2;

        // pós fixada
        a++; //a = a + 1 (incremento)
        a1--; //a = a - 1 (decremento)

        System.out.println(a);
        System.out.println(a1);

        // pré fixada

        ++b; // b = b + 1
        --b1; // b = b - 1

        System.out.println(b);
        System.out.println(b1);

        System.out.println(++a == b--); // o pré-fixo incrementa antes da comparação e o pós-fixo depois da commraração
        System.out.println(a == b);

        System.out.println(a);
        System.out.println(b);

    }

}
