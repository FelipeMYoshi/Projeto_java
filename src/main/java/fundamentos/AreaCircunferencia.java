package fundamentos;

public class AreaCircunferencia {

	public void executar (){
		double raio = 3.4;//double é flutuante
		final double pi = 3.14159;//final é imutável

		double area = pi * raio * raio;//fórmula da área

		System.out.println(area); //imprime o resultado

		raio = 10;
		area = pi * raio * raio;
		System.out.println("Area = " + area + "m2.");

	}
}
