package br.com.gabriel.cm.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private int minhas;

	private final List<Campo> campos = new ArrayList<>();

	public Tabuleiro(int linhas, int colunas, int minhas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minhas = minhas;

		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}

	private void gerarCampos() {
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < linhas; coluna++) {
				campos.add(new Campo(linha, coluna));

			}
		}
	}

	private void associarVizinhos() {
		for(Campo c1: campos) {
			for(Campo c2: campos) {
				c1.adicionarVizinho(c2);
			}
		}
	}

	private void sortearMinas() {

	}

}
