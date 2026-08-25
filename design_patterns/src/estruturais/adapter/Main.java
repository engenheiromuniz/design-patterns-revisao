package estruturais.adapter;

public class Main {
	
	public static void main(String[] args) {
		
		ImpressoraAntiga impressoraAntiga = new ImpressoraAntiga();
		Impressora impressora = new ImpressoraAdapter(impressoraAntiga);
		
		impressora.imprimir("Relatório Mensal de vendas.\nImplementação André MUNIZ.");
	}

}
