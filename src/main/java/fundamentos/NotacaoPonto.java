package fundamentos;

public class NotacaoPonto {

    public void executar(){

        String s = "Bom dia Felipe";
        System.out.println(s);

        s = s.replace("Felipe", "Senhor");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Pi".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X"
                .replace("X", "Lipe")
                .toUpperCase()
                .concat("!!");
        System.out.println(y);

    }
}
