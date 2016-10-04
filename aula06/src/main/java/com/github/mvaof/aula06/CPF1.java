/**
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.mvaof.aula06;

/**
 * @author Marcus Implementa a verificação dos digitos verificadores do CPF
 */

public class CPF1 {

	/**
	 * Serviço que verifica a validade do cpf.
	 * 
	 * @param d vetor com númeor do cpf.
	 * @throws IllegalArgumentException para a.length diferente de 12.
	 * @return True se o cpf for válido e False pra cpf invalido.
	 */

	public static boolean Cpf(int[] d) {
		if (d.length != 12) {
			throw new IllegalArgumentException("O cpf deve ter 11 dígitos");
		}
		int sj = d[1] + 2*d[2] + 3*d[3]+ 4*d[4] + 5*d[5] + 6*d[6] + 7*d[7] + 8*d[8] + 9*d[9];
		int sk = d[2] + 2*d[3] + 3*d[4]+ 4*d[5] + 5*d[6] + 6*d[7] + 7*d[8] + 8*d[9] + 9*d[10];
		
		

	int j = ((sj % 11) % 10);
	int k = ((sk % 11) % 10);

	return(j==d[10]&&k==d[11]);
}

}
