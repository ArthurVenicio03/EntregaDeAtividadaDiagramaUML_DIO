package Desafio;

public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica();

        AparelhoTelefônico telefone = new AparelhoTelefônico();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
