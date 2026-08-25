package strategy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valorPedido = 250.00;
		
		CalculadoraDeFrete calculadora = new CalculadoraDeFrete(new FreteRapido());
		System.out.println("Frete Rápido: "+calculadora.calcularFrete(valorPedido));
		
		calculadora.setEstrategia(new FreteEconomico());
		System.out.println("Frete Econômico: "+calculadora.calcularFrete(valorPedido));
		
		calculadora.setEstrategia(new FreteGratis());
		System.out.println("Frete Grátis: "+calculadora.calcularFrete(valorPedido));

	}

}
