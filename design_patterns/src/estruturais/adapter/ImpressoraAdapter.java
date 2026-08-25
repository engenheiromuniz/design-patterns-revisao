package estruturais.adapter;

public class ImpressoraAdapter implements Impressora{
	
	private ImpressoraAntiga impressoraAntiga;
	
	public ImpressoraAdapter(ImpressoraAntiga impressoraAntiga) {
		this.impressoraAntiga = impressoraAntiga;
	}

	@Override
	public void imprimir(String texto) {
		// TODO Auto-generated method stub
		impressoraAntiga.imprimirTextoAntigo(texto);
		
	}

}
