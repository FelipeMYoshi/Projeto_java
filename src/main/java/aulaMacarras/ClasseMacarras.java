package aulaMacarras;

public class ClasseMacarras {
    private String soma(float num1, float num2){
    String resultado = "";
    try{
       resultado =  String.valueOf(num1 / num2);
    }catch (Exception e){
        resultado = e.toString();
    }
        return resultado;
    }

    public void executar (){
        System.out.println(soma(1f, 2f));
    }
}
