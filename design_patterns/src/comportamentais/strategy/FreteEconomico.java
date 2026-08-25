package comportamentais.strategy;
public class FreteEconomico implements EstrategiaFrete {

	@Override
	public double calcular(double valorPedido) {
		// TODO Auto-generated method stub
		return valorPedido * 0.05 + 5;
	}

}
