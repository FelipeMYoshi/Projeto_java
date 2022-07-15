package fundamentos.operadores;

public class Ternario {

    public void exe(){

        double mean = 4.6;
        String parcialResult = mean >= 5.0 ? "recuperation." : "failed.";
        String result = mean >= 7.0 ? "approved." : parcialResult;

        System.out.println("The student is " + result);

        double grade = 7.5;
        boolean goodBehavior = false;
        boolean passed = grade >= 7;
        boolean getDiscount = goodBehavior && passed;
        String discAlloewd = getDiscount ? "yes!" : "no, sorry!";

        System.out.printf("Tem desconto? %s", discAlloewd); // possibilidade de usar format por ser String

    }
}
