package aparelho;

import aparelho.funcionalidades.AparelhoTelefonico;
import aparelho.funcionalidades.NavegadorDeInternet;
import aparelho.funcionalidades.ReprodutorMusical;

public class Smartphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet{

	
	public void exibirPagina() {
		System.out.println("PAGINA EXIBIDA");
	}

	
	public void adicionarNovaAba() {
		System.out.println("NOVA ABA ADICIONADA");
	}

	public void atualizarPagina() {
		System.out.println("ATUALIZADA A PAGINA");
		
	}

	public void ligar() {
		System.out.println("LIGANDO PARA ALGUEM");
	}

	public void atender() {
		System.out.println("ATENDENDO CHAMADA TELEFONICA");
	}

	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}

	public void tocar() {
		System.out.println("O TELEFONE ESTÁ TOCANDO");
	}

	
	public void pausar() {
		System.out.println("PAUSAR MÚSICA");
	}

	
	public void selecionarMusica() {
		System.out.println("MÚSICA SELECIONADA");
	}
	
}