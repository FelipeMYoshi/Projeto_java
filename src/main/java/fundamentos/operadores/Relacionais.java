package fundamentos.operadores;

public class Relacionais {

    public void exe(){

        int a = 97;
        int b = 'a';

        System.out.println(a == b);

        System.out.println(3 > 4);
        System.out.println(3 >= 4);
        System.out.println(3 < 8);
        System.out.println(30 <= 8);
        System.out.println(30 != 7);

        double grade = 7.5;
        boolean goodBehavior = true;
        boolean passed = grade >= 7;
        boolean getDescount = goodBehavior && passed;

        System.out.println("Tem desconto? " + getDescount);

    }

}
