package br.com.gabriel.cm;

import br.com.gabriel.cm.modelo.Tabuleiro;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro (6, 6, 5);

		tabuleiro.abrir(3, 3);
		tabuleiro.alternarMarcacao(4, 4);
		tabuleiro.alternarMarcacao(4, 5);
		
		System.out.println(tabuleiro);
	}

}
