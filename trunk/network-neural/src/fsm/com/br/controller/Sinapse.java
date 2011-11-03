package fsm.com.br.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

import fsm.com.br.model.Neuronio;
import fsm.com.br.model.Utils;

public class Sinapse {

	public Vector<Neuronio> treinarRede() throws IOException {
		HashMap<Integer[], Integer[]> hashMapLetras = new HashMap<Integer[], Integer[]>();

		hashMapLetras.put(Utils.A, Utils.sdA);
		hashMapLetras.put(Utils.S, Utils.sdS);
		hashMapLetras.put(Utils.D, Utils.sdD);
		hashMapLetras.put(Utils.F, Utils.sdF);
		hashMapLetras.put(Utils.G, Utils.sdG);
		hashMapLetras.put(Utils.H, Utils.sdH);
		hashMapLetras.put(Utils.J, Utils.sdJ);
		hashMapLetras.put(Utils.K, Utils.sdK);
		hashMapLetras.put(Utils.L, Utils.sdL);
		hashMapLetras.put(Utils.P, Utils.sdP);

		Neuronio neuronio0 = new Neuronio();
		Neuronio neuronio1 = new Neuronio();
		Neuronio neuronio2 = new Neuronio();
		Neuronio neuronio3 = new Neuronio();

		Set<Entry<Integer[], Integer[]>> set = hashMapLetras.entrySet();
		Iterator<Entry<Integer[], Integer[]>> iterator = set.iterator();
		Vector<Entry<Integer[], Integer[]>> resultadosEsperados = new Vector<Map.Entry<Integer[], Integer[]>>();

		while (iterator.hasNext()) {
			resultadosEsperados.add(iterator.next());
		}

		Vector<Integer> resultadoIteracao = new Vector<Integer>();
		Boolean repetir = false;
		Integer iteracoes = 1;

		for (int y = 0; y < resultadosEsperados.size(); y++) {
			Utils.writerLog("Ciclo: " + iteracoes);

			Map.Entry<Integer[], Integer[]> resultadoPossivel = resultadosEsperados
					.get(y);

			Integer contador = 0;

			for (int i = 0; i < resultadoPossivel.getValue().length; i++) {
				if (i == contador) {
					Utils.writerLog("Neuronio 0");
					neuronio0.setSaidaDesejada(resultadoPossivel.getValue()[i]);

					Vector<Integer> entradas = new Vector<Integer>();

					for (int x = 0; x < resultadoPossivel.getKey().length; x++) {
						entradas.add(resultadoPossivel.getKey()[x]);
					}

					neuronio0.setEntradas(entradas);
					neuronio0.setSaidaEncontrada(Utils.calcularTeta(Utils
							.calcularResultado(neuronio0)));

					resultadoIteracao.add(neuronio0.getSaidaEncontrada());

					contador++;
					break;
				}
			}

			for (int i = 0; i < resultadoPossivel.getValue().length; i++) {
				if (i == contador) {
					Utils.writerLog("Neuronio 1");
					neuronio1.setSaidaDesejada(resultadoPossivel.getValue()[i]);
					Vector<Integer> entradas = new Vector<Integer>();

					for (int x = 0; x < resultadoPossivel.getKey().length; x++) {
						entradas.add(resultadoPossivel.getKey()[x]);
					}

					neuronio1.setEntradas(entradas);
					neuronio1.setSaidaEncontrada(Utils.calcularTeta(Utils
							.calcularResultado(neuronio1)));

					resultadoIteracao.add(neuronio1.getSaidaEncontrada());

					contador++;
					break;
				}
			}

			for (int i = 0; i < resultadoPossivel.getValue().length; i++) {
				if (i == contador) {
					Utils.writerLog("Neuronio 2");
					neuronio2.setSaidaDesejada(resultadoPossivel.getValue()[i]);
					Vector<Integer> entradas = new Vector<Integer>();

					for (int x = 0; x < resultadoPossivel.getKey().length; x++) {
						entradas.add(resultadoPossivel.getKey()[x]);
					}

					neuronio2.setEntradas(entradas);
					neuronio2.setSaidaEncontrada(Utils.calcularTeta(Utils
							.calcularResultado(neuronio2)));

					resultadoIteracao.add(neuronio2.getSaidaEncontrada());

					contador++;
					break;
				}
			}

			for (int i = 0; i < resultadoPossivel.getValue().length; i++) {
				if (i == contador) {
					Utils.writerLog("Neuronio 3");
					neuronio3.setSaidaDesejada(resultadoPossivel.getValue()[i]);
					Vector<Integer> entradas = new Vector<Integer>();

					for (int x = 0; x < resultadoPossivel.getKey().length; x++) {
						entradas.add(resultadoPossivel.getKey()[x]);
					}

					neuronio3.setEntradas(entradas);
					neuronio3.setSaidaEncontrada(Utils.calcularTeta(Utils
							.calcularResultado(neuronio3)));

					resultadoIteracao.add(neuronio3.getSaidaEncontrada());

					contador++;
					break;
				}
			}

			Vector<Integer> saidaDesejada = new Vector<Integer>();

			for (int i = 0; i < resultadoPossivel.getValue().length; i++) {
				saidaDesejada.add(resultadoPossivel.getValue()[i]);
			}

			Vector<Integer> entrada = new Vector<Integer>();

			for (int i = 0; i < resultadoPossivel.getKey().length; i++) {
				entrada.add(resultadoPossivel.getKey()[i]);
			}

			if (!saidaDesejada.toString().equals(resultadoIteracao.toString())) {
				Utils.calcularNovosPesos(neuronio0);
				Utils.calcularNovosPesos(neuronio1);
				Utils.calcularNovosPesos(neuronio2);
				Utils.calcularNovosPesos(neuronio3);
				repetir = true;
			}

			if (repetir && (y + 1 == resultadosEsperados.size())) {
				y = 0;
				repetir = false;
			}

			Utils.writerLog("Entrada: " + entrada.toString());
			Utils.writerLog("Saida desejada: " + saidaDesejada.toString());
			Utils.writerLog("Resultado: " + resultadoIteracao.toString());
			Utils.writerLog("\n");
			resultadoIteracao.clear();

			iteracoes++;

		}

		Utils.writerLog("Rede neural treinada");
		Utils.writerLog("Itera›es: " + (iteracoes));

		Vector<Integer> clear = new Vector<Integer>();
		neuronio0.setEntradas(clear);
		neuronio1.setEntradas(clear);
		neuronio2.setEntradas(clear);
		neuronio3.setEntradas(clear);

		Vector<Neuronio> retorno = new Vector<Neuronio>();
		retorno.add(neuronio0);
		retorno.add(neuronio1);
		retorno.add(neuronio2);
		retorno.add(neuronio3);

		return retorno;
	}

	public String calcularResultado(Integer[] entrada,
			Vector<Neuronio> neuronios) throws IOException {
		String resultado = "";

		for (int i = 0; i < neuronios.size(); i++) {

			Vector<Integer> inputs = new Vector<Integer>();

			for (int j = 0; j < entrada.length; j++) {
				inputs.add(entrada[j]);
			}

			neuronios.get(i).setEntradas(inputs);

			resultado = resultado
					+ Utils.calcularTeta(Utils.calcularResultado(neuronios
							.get(i)));
		}

		return resultado;
	}

	public String resultadoPossivel(String valor) {
		HashMap<String, String> valores = new HashMap<String, String>();

		valores.put(Utils.saidaA, "A");
		valores.put(Utils.saidaS, "S");
		valores.put(Utils.saidaD, "D");
		valores.put(Utils.saidaF, "F");
		valores.put(Utils.saidaG, "G");
		valores.put(Utils.saidaH, "H");
		valores.put(Utils.saidaJ, "J");
		valores.put(Utils.saidaK, "K");
		valores.put(Utils.saidaL, "L");
		valores.put(Utils.saidaP, "P");

		return (valores.get(valor) == null) ? "Letra n‹o encontrada" : valores
				.get(valor);
	}

}
