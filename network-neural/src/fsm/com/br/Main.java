package fsm.com.br;

import java.util.Vector;

import fsm.com.br.controller.Sinapse;
import fsm.com.br.model.Neuronio;
import fsm.com.br.model.Utils;

public class Main {

	public static void main(String[] args) {
		Sinapse sinapse = new Sinapse();
		
		Integer[] teste = {Utils.bia, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 1, 1, 1, 1, 1 };
		
		Vector<Neuronio> aux =  sinapse.treinarRede();
		
		
		System.out.println(sinapse.calcularResultado(teste, aux));
		
	}
}
