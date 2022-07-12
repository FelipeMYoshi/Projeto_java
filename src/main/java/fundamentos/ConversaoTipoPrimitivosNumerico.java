package fundamentos;

public class ConversaoTipoPrimitivosNumerico {

    public void executar(){

        double a = 1; // implícita
        System.out.println(a);

        float b = (float)1.01234567891011; // explícita(CAST)
        System.out.println(b);

        int c = 340;
        byte d = (byte)c; // explícita(CAST)
        System.out.println(d);

        double e = 1.99999999;
        int f = (int) e; // explícita(CAST)
        System.out.println(f);

    }
}
