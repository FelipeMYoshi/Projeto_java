package fundamentos.operadores;

public class Logicos {

    public void executar(){

        boolean cond1 = true;
        boolean cond2 = 3 > 7;

        System.out.println("Exemplos");
        System.out.println(cond1 && cond2);
        System.out.println(cond1 && !cond2);
        System.out.println(cond1 || cond2);
        System.out.println(cond1 ^ cond2);
        System.out.println(!cond1);
        System.out.println(!!cond1);
        System.out.println(!cond2);

        System.out.println("Tabela verdade E ou &&");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("Tabela verdade OU ou ||");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("Tabela verdade OU EXCLUSIVO ou (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("Tabela verdade NOT");
        System.out.println(!true);
        System.out.println(!false);



    }

}
