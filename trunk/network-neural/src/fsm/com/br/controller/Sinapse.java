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

		Vector<Entry<Integer[], Integer[]>> aux = new Vector<Map.Entry<Integer[], Integer[]>>();

		while (iterator.hasNext()) {
			aux.add(iterator.next());
		}

		Boolean repetir = false;

		for (int y = 0; y < aux.size(); y++) {
			Map.Entry<Integer[], Integer[]> entrada = aux.get(y);

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

					resultado.add(neuronio0.getSaidaEncontrada());

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

					resultado.add(neuronio1.getSaidaEncontrada());

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

					resultado.add(neuronio2.getSaidaEncontrada());

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

					resultado.add(neuronio3.getSaidaEncontrada());

					contador++;
					break;
				}
			}

			Vector<Integer> rs = new Vector<Integer>();

			for (int i = 0; i < entrada.getValue().length; i++) {
				rs.add(entrada.getValue()[i]);
			}

			Vector<Integer> inpt = new Vector<Integer>();

			for (int i = 0; i < entrada.getKey().length; i++) {
				inpt.add(entrada.getKey()[i]);
			}

			if (!rs.toString().equals(resultado.toString())) {
				Utils.calcularNovosPesos(neuronio0);
				Utils.calcularNovosPesos(neuronio1);
				Utils.calcularNovosPesos(neuronio2);
				Utils.calcularNovosPesos(neuronio3);
				repetir = true;
			}

			if (repetir && (y + 1 == aux.size())) {
				y = 0;
				repetir = false;
			}

			System.out.println("Entrada: " + inpt.toString());
			System.out.println("Saida desejada: " + rs.toString());
			System.out.println("Resultado: " + resultado.toString());
			System.out.println("\n");
			resultado.clear();

		}

		System.out.println("Rede neural treinada");

	}

}
