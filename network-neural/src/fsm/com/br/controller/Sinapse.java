package fsm.com.br.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

import fsm.com.br.model.Neuronio;
import fsm.com.br.model.Utils;

public class Sinapse {

	public void treinarRede() {
		HashMap<Integer[], Integer[]> resultadosPossiveis = new HashMap<Integer[], Integer[]>();

		resultadosPossiveis.put(Utils.A, Utils.sdA);
		resultadosPossiveis.put(Utils.S, Utils.sdS);
		resultadosPossiveis.put(Utils.D, Utils.sdD);
		resultadosPossiveis.put(Utils.F, Utils.sdF);
		resultadosPossiveis.put(Utils.G, Utils.sdG);
		resultadosPossiveis.put(Utils.H, Utils.sdH);
		resultadosPossiveis.put(Utils.J, Utils.sdJ);
		resultadosPossiveis.put(Utils.K, Utils.sdK);
		resultadosPossiveis.put(Utils.L, Utils.sdL);
		resultadosPossiveis.put(Utils.P, Utils.sdP);

		Vector<Integer> resultado = new Vector<Integer>();

		Neuronio neuronio0 = new Neuronio();
		Neuronio neuronio1 = new Neuronio();
		Neuronio neuronio2 = new Neuronio();
		Neuronio neuronio3 = new Neuronio();

		Set<Entry<Integer[], Integer[]>> set = resultadosPossiveis.entrySet();

		Iterator<Entry<Integer[], Integer[]>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<Integer[], Integer[]> entrada = iterator.next();
			Integer contador = 0;

			for (int i = 0; i < entrada.getValue().length; i++) {
				if (i == contador) {
					neuronio0.setSaidaDesejada(entrada.getValue()[i]);
					Vector<Integer> entradas = new Vector<Integer>();

					for (int x = 0; x < entrada.getKey().length; x++) {
						entradas.add(entrada.getKey()[x]);
					}

					neuronio0.setEntradas(entradas);
					neuronio0.setSaidaEncontrada(Utils.calcularTeta(Utils
							.calcularResultado(neuronio0)));
					
					contador++;
					break;
				}
			}
			
			for (int i = 0; i < entrada.getValue().length; i++) {
				if (i == contador) {
					neuronio1.setSaidaDesejada(entrada.getValue()[i]);
					Vector<Integer> entradas = new Vector<Integer>();

					for (int x = 0; x < entrada.getKey().length; x++) {
						entradas.add(entrada.getKey()[x]);
					}

					neuronio1.setEntradas(entradas);
					neuronio1.setSaidaEncontrada(Utils.calcularTeta(Utils
							.calcularResultado(neuronio1)));
					
					contador++;
					break;
				}
			}
			
			for (int i = 0; i < entrada.getValue().length; i++) {
				if (i == contador) {
					neuronio2.setSaidaDesejada(entrada.getValue()[i]);
					Vector<Integer> entradas = new Vector<Integer>();

					for (int x = 0; x < entrada.getKey().length; x++) {
						entradas.add(entrada.getKey()[x]);
					}

					neuronio2.setEntradas(entradas);
					neuronio2.setSaidaEncontrada(Utils.calcularTeta(Utils
							.calcularResultado(neuronio2)));
					
					contador++;
					break;
				}
			}
			
			for (int i = 0; i < entrada.getValue().length; i++) {
				if (i == contador) {
					neuronio3.setSaidaDesejada(entrada.getValue()[i]);
					Vector<Integer> entradas = new Vector<Integer>();

					for (int x = 0; x < entrada.getKey().length; x++) {
						entradas.add(entrada.getKey()[x]);
					}

					neuronio3.setEntradas(entradas);
					neuronio3.setSaidaEncontrada(Utils.calcularTeta(Utils
							.calcularResultado(neuronio3)));
					
					contador++;
					break;
				}
			}		

		}

	}

}
