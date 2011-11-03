package fsm.com.br.client;

import java.io.IOException;
import java.util.Vector;

import fsm.com.br.fachada.Fachada;
import fsm.com.br.model.Neuronio;

public class Client {
	public Vector<Neuronio> treinarRede() throws IOException {
		return Fachada.obterInstancia().treinarRede();
	}

	public String calcularResultado(Integer[] entrada,
			Vector<Neuronio> neuronios) throws IOException {
		return Fachada.obterInstancia().calcularResultado(entrada, neuronios);
	}
}
