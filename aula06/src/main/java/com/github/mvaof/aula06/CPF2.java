/**
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.mvaof.aula06;
	
	/**
	 *  @author Marcus
	 * Implementa a verificação dos digitos verificadores do CPF de outra maneira
	 */



	public class CPF2 {
		/**
		 *  @author Marcus
		 * Implementa a verificação dos digitos verificadores do CPF
		 */

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

			int c = 8;
			int p = d[9];
			int s = d[9];
			while (c >= 1) {
				p = p + d[c];
				s = s + p;
				c = c - 1;
			}

			int j = ((s % 11) % 10);
			int k = (((s - p + (9 * j)) % 11) % 10);

			return (j == d[10] && k == d[11]);
		}

	}



