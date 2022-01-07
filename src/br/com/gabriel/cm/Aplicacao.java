package br.com.gabriel.cm;

import br.com.gabriel.cm.modelo.Tabuleiro;
import br.com.gabriel.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro (10, 10, 3);
		
		new TabuleiroConsole(tabuleiro);

	}

}
