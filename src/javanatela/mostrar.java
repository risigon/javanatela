package javanatela;

import java.util.ArrayList;


public class mostrar extends mensagem {

	public static void main(String[] args) {
	int conta=0;
	ArrayList<String> nomes = new ArrayList<String>();
	
	nomes.add("Raimundo");
	nomes.add("Maria");
	nomes.add("José");
	
	ver();
	
	conta = calcular(2,3,2);
	
	System.out.println("Resultado = "+conta);

	}

}
