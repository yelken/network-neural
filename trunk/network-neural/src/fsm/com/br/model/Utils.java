package fsm.com.br.model;


public class Utils {
	public static final byte taxaAprendizagem = 1;

	public static final byte bia = 1;	

	public static final Integer[] A = { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1,
			0, 0, 1, 1, 0, 0, 1 };
	public static final Integer[] sdA = { 0, 0, 0, 0 };

	public static final Integer[] S = { 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0,
			0, 0, 1, 1, 1, 1, 1 };
	public static final Integer[] sdS = { 0, 0, 0, 1 };

	public static final Integer[] D = { 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1,
			0, 0, 1, 1, 1, 1, 0 };
	public static final Integer[] sdD = { 0, 0, 1, 0 };

	public static final Integer[] F = { 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1,
			0, 0, 0, 1, 0, 0, 0 };
	public static final Integer[] sdF = { 0, 0, 1, 1 };

	public static final Integer[] G = { 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1,
			0, 0, 1, 1, 1, 1, 1 };
	public static final Integer[] sdG = { 0, 1, 0, 0 };

	public static final Integer[] H = { 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1,
			0, 0, 1, 1, 0, 0, 1 };
	public static final Integer[] sdH = { 0, 1, 0, 1 };

	public static final Integer[] J = { 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1,
			0, 1, 0, 1, 1, 1, 0 };
	public static final Integer[] sdJ = { 0, 1, 1, 0 };

	public static final Integer[] K = { 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1,
			0, 1, 0, 1, 0, 0, 1 };
	public static final Integer[] sdK = { 0, 1, 1, 1 };

	public static final Integer[] L = { 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1,
			0, 0, 0, 1, 1, 1, 1 };
	public static final Integer[] sdL = { 1, 0, 0, 0 };

	public static final Integer[] P = { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1,
			0, 0, 0, 1, 0, 0, 0 };
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
			for (int x = 0; x < neuronio.getPesos().size(); x++) {
				Integer pesoNovo = neuronio.getPesos().get(x)
						+ (taxaAprendizagem * calcularErro(neuronio) * neuronio
								.getEntradas().get(i));
				neuronio.getPesos().set(x, pesoNovo);
			}
		}

		return neuronio;
	}
	
	public static Integer calcularResultado(Neuronio neuronio) {
		Integer resultado = 0;
		
		for (int i = 0; i < neuronio.getEntradas().size(); i++) {
			for (int x = 0; x < neuronio.getPesos().size(); x++) {
				 resultado = (neuronio.getEntradas().get(i)*neuronio.getPesos().get(x)) + resultado;
			}
		}
		
		return resultado;
	}
	
}
