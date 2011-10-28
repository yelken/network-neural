package fsm.com.br;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

import fsm.com.br.controller.Sinapse;
import fsm.com.br.model.Neuronio;

public class Main {

	public static void main(String[] args) throws IOException {
		Sinapse sinapse = new Sinapse();

		Vector<Neuronio> aux = sinapse.treinarRede();
		
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));  
		String valor = buf.readLine(); 
		
		char[] arrayValores = valor.toCharArray();  
        Integer[] testeEntrada = new Integer[arrayValores.length];  
  
        for (int i = 0; i < arrayValores.length; i++)   
        {  
            testeEntrada[i] = Integer  
                    .parseInt(String.valueOf(arrayValores[i]));  
        }  

		System.out.println(sinapse.calcularResultado(testeEntrada, aux));
		//System.out.println(sinapse.calcularResultado(Utils.P, aux));
		//System.out.println("\n");
		//System.out.println(sinapse.calcularResultado(Utils.A, aux));
	}
}
