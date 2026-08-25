package strategy;

public class FreteRapido implements EstrategiaFrete{

	@Override
	public double calcular(double valorPedido) {
		
		return valorPedido * 0.15 + 20;
	}
}
