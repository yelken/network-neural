package fsm.com.br.fachada;

import java.util.Vector;

import fsm.com.br.model.Neuronio;
import fsm.com.br.view.ViewSinapse;

public class Fachada {
	private static Fachada instancia;

	private ViewSinapse viewSinapse;

	public static Fachada obterInstancia() {
		if (instancia == null) {
			instancia = new Fachada();
		}

		return instancia;
	}

	private void init() {
		if (viewSinapse == null) {
			viewSinapse = new ViewSinapse();
		}
	}

	public Fachada() {
		init();
	}

	public Vector<Neuronio> treinarRede() {
		return viewSinapse.treinarRede();
	}

	public String calcularResultado(Integer[] entrada,
			Vector<Neuronio> neuronios) {
		return viewSinapse.calcularResultado(entrada, neuronios);
	}
}
