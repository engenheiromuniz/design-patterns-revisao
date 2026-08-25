package strategy;

public class CalculadoraDeFrete {
	
	private EstrategiaFrete estrategia;
	
	public CalculadoraDeFrete(EstrategiaFrete estrategia) {
		this.estrategia = estrategia;
	}
	
	public double calcularFrete(double valorPedido) {
		return estrategia.calcular(valorPedido);
	}
	
	public void setEstrategia(EstrategiaFrete estrategia) {
		this.estrategia = estrategia;
	}

}
