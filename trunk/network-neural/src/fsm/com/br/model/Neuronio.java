package fsm.com.br.model;

import java.util.Vector;

public class Neuronio {
	private Vector<Integer> entradas;
	private Vector<Integer> pesos;
	private Integer saidaDesejada;
	private Integer saidaEncontrada;
	private Integer posicao;

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public Neuronio() {
		this.pesos = new Vector<Integer>();

		for (int i = 0; i < Utils.entradas; i++) {
			this.pesos.add(0);
		}
	}

	public Vector<Integer> getEntradas() {
		return entradas;
	}

	public void setEntradas(Vector<Integer> entradas) {
		this.entradas = entradas;
	}

	public Vector<Integer> getPesos() {
		return pesos;
	}

	public void setPesos(Vector<Integer> pesos) {
		this.pesos = pesos;
	}

	public Integer getSaidaDesejada() {
		return saidaDesejada;
	}

	public void setSaidaDesejada(Integer saidaDesejada) {
		this.saidaDesejada = saidaDesejada;
	}

	public Integer getSaidaEncontrada() {
		return saidaEncontrada;
	}

	public void setSaidaEncontrada(Integer saidaEncontrada) {
		this.saidaEncontrada = saidaEncontrada;
	}

}
