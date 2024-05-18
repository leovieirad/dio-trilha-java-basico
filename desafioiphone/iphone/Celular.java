package iphone;


import aparelho.Smartphone;

public class Celular {
	public static void main(String[] args) {
		Smartphone novoAparelho = new Smartphone();

		novoAparelho.ligar();
		novoAparelho.atender();
		novoAparelho.iniciarCorreioVoz();

		novoAparelho.exibirPagina();
		novoAparelho.adicionarNovaAba();
		novoAparelho.atualizarPagina();

		novoAparelho.tocar();
		novoAparelho.pausar();
		novoAparelho.selecionarMusica();
	}
}