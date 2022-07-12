package fundamentos;

public class TiposPrimitivos {

    public void executar(){

        //Informações de funcionário

        //Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 12345;
        long pontosAcumulados = 3_234_845_223L; // "L" declara que o literal é um Long que é um range maior que "int"

        //Tipos numéricos reais
        float salario = 11_445.44F; // "F" declara o literal float
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipos booleano
        boolean estaDeFerias = false; // ou true

        //Tipo caractere
        char status = 'A'; // "A" utilizado para abreviar "ATIVO"

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Numero de viagens
        System.out.println(numeroDeVoos / 2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);
        System.out.println(id + " ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);

    }
}
