package fundamentos.operadores;

public class DesafioLogicos {

    public void executar(){
        // Criar exercício com com hipótese se trabalhar nos dois serviços compra a TV de 50"
        //e toma sorvete

        boolean job1 = true;
        boolean job2 = true;

        boolean buyTV50 = job1 && job2;
        boolean buyTV32 = job1 ^ job2;
        boolean buyIceCream = job1 || job2;
        boolean notBuyIceCream = !buyIceCream;

        System.out.println("Comprou a TV de 50\"" + " = " + buyTV50);
        System.out.println("Comprou a TV de 32\"" + " = " + buyTV32);
        System.out.println("Comprou sorvete? " + " = " + buyIceCream);
        System.out.println("Não comprou sorvete? " + " = " + notBuyIceCream);

    }
}
