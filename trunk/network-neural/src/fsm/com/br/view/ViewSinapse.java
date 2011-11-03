package fsm.com.br.view;

import java.io.IOException;
import java.util.Vector;

import fsm.com.br.controller.Sinapse;
import fsm.com.br.model.Neuronio;

public class ViewSinapse {

	private Sinapse sinapse;

	public ViewSinapse() {
		if (this.sinapse == null) {
			this.sinapse = new Sinapse();
		}
	}

	public Vector<Neuronio> treinarRede() throws IOException {
		return sinapse.treinarRede();
	}

	public String calcularResultado(Integer[] entrada,
			Vector<Neuronio> neuronios) throws IOException {
		return sinapse.resultadoPossivel(sinapse.calcularResultado(entrada, neuronios));
	}
}
