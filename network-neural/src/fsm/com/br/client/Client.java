package fsm.com.br.client;

import java.util.Vector;

import fsm.com.br.fachada.Fachada;
import fsm.com.br.model.Neuronio;

public class Client {
	public Vector<Neuronio> treinarRede() {
		return Fachada.obterInstancia().treinarRede();
	}

	public String calcularResultado(Integer[] entrada,
			Vector<Neuronio> neuronios) {
		return Fachada.obterInstancia().calcularResultado(entrada, neuronios);
	}
}
