package fsm.com.br.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import fsm.com.br.model.Neuronio;
import fsm.com.br.model.Utils;

public class Sinapse {

	public Vector<Neuronio> treinarRede() throws IOException {
		Vector<Integer[]> listaEntradas = new Vector<Integer[]>();
		Vector<Integer[]> listaSaidasDesejadas = new Vector<Integer[]>();
		Vector<String> listaLetras = new Vector<String>();
		
		listaEntradas.add(Utils.A);
		listaSaidasDesejadas.add(Utils.sdA);
		listaLetras.add("A");
		listaEntradas.add(Utils.S);
		listaSaidasDesejadas.add(Utils.sdS);
		listaLetras.add("S");
		listaEntradas.add(Utils.D);
		listaSaidasDesejadas.add(Utils.sdD);
		listaLetras.add("D");
		listaEntradas.add(Utils.F);
		listaSaidasDesejadas.add(Utils.sdF);
		listaLetras.add("F");
		listaEntradas.add(Utils.G);
		listaSaidasDesejadas.add(Utils.sdG);
		listaLetras.add("G");
		listaEntradas.add(Utils.H);
		listaSaidasDesejadas.add(Utils.sdH);
		listaLetras.add("H");
		listaEntradas.add(Utils.J);
		listaSaidasDesejadas.add(Utils.sdJ);
		listaLetras.add("J");
		listaEntradas.add(Utils.K);
		listaSaidasDesejadas.add(Utils.sdK);
		listaLetras.add("K");
		listaEntradas.add(Utils.L);
		listaSaidasDesejadas.add(Utils.sdL);
		listaLetras.add("L");
		listaEntradas.add(Utils.P);
		listaSaidasDesejadas.add(Utils.sdP);
		listaLetras.add("P");

		Neuronio neuronio0 = new Neuronio();
		Neuronio neuronio1 = new Neuronio();
		Neuronio neuronio2 = new Neuronio();
		Neuronio neuronio3 = new Neuronio();


		Vector<Integer> resultadoIteracao = new Vector<Integer>();
		Boolean repetir = false;
		Integer iteracoes = 1;

		for (int y = 0; y < listaEntradas.size(); y++) {
			Utils.writerLog("Letra: " + listaLetras.get(y));
			Utils.writerLog("Ciclo: " + iteracoes);

			Integer contador = 0;

			for (int i = 0; i < listaSaidasDesejadas.get(y).length; i++) {
				if (i == contador) {
					Utils.writerLog("Neuronio 0");
					neuronio0.setSaidaDesejada(listaSaidasDesejadas.get(y)[i]);

					Vector<Integer> entradas = new Vector<Integer>();

					for (int x = 0; x < listaEntradas.get(y).length; x++) {
						entradas.add(listaEntradas.get(y)[x]);
					}

					neuronio0.setEntradas(entradas);
					neuronio0.setSaidaEncontrada(Utils.calcularTeta(Utils
							.calcularResultado(neuronio0)));

					resultadoIteracao.add(neuronio0.getSaidaEncontrada());

					contador++;
					break;
				}
			}

			for (int i = 0; i < listaSaidasDesejadas.get(y).length; i++) {
				if (i == contador) {
					Utils.writerLog("Neuronio 1");
					neuronio1.setSaidaDesejada(listaSaidasDesejadas.get(y)[i]);
					Vector<Integer> entradas = new Vector<Integer>();

					for (int x = 0; x < listaEntradas.get(y).length; x++) {
						entradas.add(listaEntradas.get(y)[x]);
					}

					neuronio1.setEntradas(entradas);
					neuronio1.setSaidaEncontrada(Utils.calcularTeta(Utils
							.calcularResultado(neuronio1)));

					resultadoIteracao.add(neuronio1.getSaidaEncontrada());      

					contador++;
					break;
				}
			}

			for (int i = 0; i < listaSaidasDesejadas.get(y).length; i++) {
				if (i == contador) {
					Utils.writerLog("Neuronio 2");
					neuronio2.setSaidaDesejada(listaSaidasDesejadas.get(y)[i]);
					Vector<Integer> entradas = new Vector<Integer>();

					for (int x = 0; x < listaEntradas.get(y).length; x++) {
						entradas.add(listaEntradas.get(y)[x]);
					}

					neuronio2.setEntradas(entradas);
					neuronio2.setSaidaEncontrada(Utils.calcularTeta(Utils
							.calcularResultado(neuronio2)));

					resultadoIteracao.add(neuronio2.getSaidaEncontrada());

					contador++;
					break;
				}
			}

			for (int i = 0; i < listaSaidasDesejadas.get(y).length; i++) {
				if (i == contador) {
					Utils.writerLog("Neuronio 3");
					neuronio3.setSaidaDesejada(listaSaidasDesejadas.get(y)[i]);
					Vector<Integer> entradas = new Vector<Integer>();

					for (int x = 0; x < listaEntradas.get(y).length; x++) {
						entradas.add(listaEntradas.get(y)[x]);
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

			for (int i = 0; i < listaSaidasDesejadas.get(y).length; i++) {
				saidaDesejada.add(listaSaidasDesejadas.get(y)[i]);
			}

			Vector<Integer> entrada = new Vector<Integer>();

			for (int i = 0; i < listaEntradas.get(y).length; i++) {
				entrada.add(listaEntradas.get(y)[i]);
			}

			if (!saidaDesejada.toString().equals(resultadoIteracao.toString())) {
				Utils.calcularNovosPesos(neuronio0);
				Utils.calcularNovosPesos(neuronio1);
				Utils.calcularNovosPesos(neuronio2);
				Utils.calcularNovosPesos(neuronio3);
				repetir = true;
			}

			if (repetir && (y + 1 == listaEntradas.size())) {
				y = -1;
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
		Utils.writerLog("Iterações: " + (iteracoes));

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
		Utils.writerLog("-----------Pesos Finais------------");		
		for (int x = 0; x < 21;x++){
			Utils.writerLog("Neurônio0: Peso " + x + ": " + neuronio0.getPesos().get(x).toString());
			Utils.writerLog("Neurônio1: Peso " + x + ": " + neuronio1.getPesos().get(x).toString());
			Utils.writerLog("Neurônio2: Peso " + x + ": " + neuronio2.getPesos().get(x).toString());
			Utils.writerLog("Neurônio3: Peso " + x + ": " + neuronio3.getPesos().get(x).toString());
			Utils.writerLog("-------------------------------------------");
		}

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
		Map<String, String> valores = new  HashMap<String, String>();

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

		return (valores.get(valor) == null) ? "Letra não encontrada" : valores
				.get(valor);
	}

}
