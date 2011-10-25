package fsm.com.br.model;

public class Utils {
	public static final byte taxaAprendizagem = 1;

	public static final byte bia = 1;

	public static final Integer entradas = 20 + bia;

	public static final Integer[] A = { bia, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1,
			1, 1, 0, 0, 1, 1, 0, 0, 1 };
	public static final Integer[] sdA = { 0, 0, 0, 0 };

	public static final Integer[] S = { bia, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1,
			1, 0, 0, 0, 1, 1, 1, 1, 1 };
	public static final Integer[] sdS = { 0, 0, 0, 1 };

	public static final Integer[] D = { bia, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0,
			1, 1, 0, 0, 1, 1, 1, 1, 0 };
	public static final Integer[] sdD = { 0, 0, 1, 0 };

	public static final Integer[] F = { bia, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1,
			0, 1, 0, 0, 0, 1, 0, 0, 0 };
	public static final Integer[] sdF = { 0, 0, 1, 1 };

	public static final Integer[] G = { bia, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1,
			1, 1, 0, 0, 1, 1, 1, 1, 1 };
	public static final Integer[] sdG = { 0, 1, 0, 0 };

	public static final Integer[] H = { bia, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1,
			1, 1, 0, 0, 1, 1, 0, 0, 1 };
	public static final Integer[] sdH = { 0, 1, 0, 1 };

	public static final Integer[] J = { bia, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1,
			0, 1, 0, 1, 0, 1, 1, 1, 0 };
	public static final Integer[] sdJ = { 0, 1, 1, 0 };

	public static final Integer[] K = { bia, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0,
			0, 1, 0, 1, 0, 1, 0, 0, 1 };
	public static final Integer[] sdK = { 0, 1, 1, 1 };

	public static final Integer[] L = { bia, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0,
			0, 1, 0, 0, 0, 1, 1, 1, 1 };
	public static final Integer[] sdL = { 1, 0, 0, 0 };

	public static final Integer[] P = { bia, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1,
			1, 1, 0, 0, 0, 1, 0, 0, 0 };
	public static final Integer[] sdP = { 1, 0, 0, 1 };
	
	
	

	public static Integer calcularTeta(Integer v) {
		if (v >= 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public static Integer calcularErro(Neuronio neuronio) {
		return neuronio.getSaidaDesejada() - neuronio.getSaidaEncontrada();
	}

	public static Neuronio calcularNovosPesos(Neuronio neuronio) {
		for (int i = 0; i < neuronio.getEntradas().size(); i++) {
			Integer pesoNovo = neuronio.getPesos().get(i)
					+ (taxaAprendizagem * calcularErro(neuronio) * neuronio
							.getEntradas().get(i));
			neuronio.getPesos().set(i, pesoNovo);
		}

		return neuronio;
	}

	public static Integer calcularResultado(Neuronio neuronio) {
		Integer resultado = 0;

		for (int i = 0; i < neuronio.getEntradas().size(); i++) {
			resultado = (neuronio.getEntradas().get(i) * neuronio.getPesos()
					.get(i)) + resultado;
		}

		return resultado;
	}

}
