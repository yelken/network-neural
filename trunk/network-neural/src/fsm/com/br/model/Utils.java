package fsm.com.br.model;

public class Utils {
	public static final byte taxaAprendizagem = 1;

	public static final byte bia = 1;

	public static final Integer entradas = 20 + bia;

	public static final Integer[] A = { bia, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1,
			1, 1, 0, 0, 1, 1, 0, 0, 1 };
	public static final Integer[] sdA = { 0, 0, 0, 0 };
	public static final String saidaA = "0000";

	public static final Integer[] S = { bia, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1,
			1, 0, 0, 0, 1, 1, 1, 1, 1 };
	public static final Integer[] sdS = { 0, 0, 0, 1 };
	public static final String saidaS = "0001";

	public static final Integer[] D = { bia, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0,
			1, 1, 0, 0, 1, 1, 1, 1, 0 };
	public static final Integer[] sdD = { 0, 0, 1, 0 };
	public static final String saidaD = "0010";

	public static final Integer[] F = { bia, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1,
			0, 1, 0, 0, 0, 1, 0, 0, 0 };
	public static final Integer[] sdF = { 0, 0, 1, 1 };
	public static final String saidaF = "0011";

	public static final Integer[] G = { bia, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1,
			1, 1, 0, 0, 1, 1, 1, 1, 1 };
	public static final Integer[] sdG = { 0, 1, 0, 0 };
	public static final String saidaG = "0100";

	public static final Integer[] H = { bia, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1,
			1, 1, 0, 0, 1, 1, 0, 0, 1 };
	public static final Integer[] sdH = { 0, 1, 0, 1 };
	public static final String saidaH = "0101";

	public static final Integer[] J = { bia, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1,
			0, 1, 0, 1, 0, 1, 1, 1, 0 };
	public static final Integer[] sdJ = { 0, 1, 1, 0 };
	public static final String saidaJ = "0110";

	public static final Integer[] K = { bia, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0,
			0, 1, 0, 1, 0, 1, 0, 0, 1 };
	public static final Integer[] sdK = { 0, 1, 1, 1 };
	public static final String saidaK = "0111";

	public static final Integer[] L = { bia, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0,
			0, 1, 0, 0, 0, 1, 1, 1, 1 };
	public static final Integer[] sdL = { 1, 0, 0, 0 };
	public static final String saidaL = "1000";

	public static final Integer[] P = { bia, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1,
			1, 1, 0, 0, 0, 1, 0, 0, 0 };
	public static final Integer[] sdP = { 1, 0, 0, 1 };
	public static final String saidaP = "1001";

	public static Integer calcularTeta(Integer v) {
		if (v >= 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public static Integer calcularErro(Neuronio neuronio) {
		Integer resultado = neuronio.getSaidaDesejada()
				- neuronio.getSaidaEncontrada();
		System.err.println("Erro");
		System.out.println("Erro = " + neuronio.getSaidaDesejada() + " - "
				+ neuronio.getSaidaEncontrada() + " => " + resultado);
		return resultado;
	}

	public static Neuronio calcularNovosPesos(Neuronio neuronio) {
		System.out.println("Calculo dos novos pesos");
		
		Integer erro = calcularErro(neuronio);
		
		for (int i = 0; i < neuronio.getEntradas().size(); i++) {
			
			
			Integer pesoNovo = neuronio.getPesos().get(i)
					+ (taxaAprendizagem * erro * neuronio
							.getEntradas().get(i));
			neuronio.getPesos().set(i, pesoNovo);
			
			String expressaoNumerica = "W" + i + "n = "
			+ neuronio.getPesos().get(i) + "+" + "(" + taxaAprendizagem
			+ "*" + erro + "*"
			+ neuronio.getEntradas().get(i) + ")" + " => " + pesoNovo;
			
			
			System.out.println(expressaoNumerica);
		}

		return neuronio;
	}

	public static Integer calcularResultado(Neuronio neuronio) {
		Integer resultado = 0;

		String expressaoNumerica = "";

		for (int i = 0; i < neuronio.getEntradas().size(); i++) {
			resultado = (neuronio.getPesos().get(i) * neuronio.getEntradas()
					.get(i)) + resultado;
			expressaoNumerica = expressaoNumerica + "+" + "("
					+ neuronio.getPesos().get(i) + "*"
					+ neuronio.getEntradas().get(i) + ")";
		}

		String v = "v = ";

		System.out.println(v
				+ expressaoNumerica.substring(1, expressaoNumerica.length()));

		return resultado;
	}

}
