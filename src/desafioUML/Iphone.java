package desafioUML;

public class Iphone {

    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        NavegadorInternet navegador = new NavegadorInternet();
        AparelhoTelefonico telefone = new AparelhoTelefonico();

        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("tonico e tinoco as melhores");

        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
        navegador.exibirPagina("google");

        telefone.atender();
        telefone.ligar("(12) 99999-9999");
        telefone.iniciarCorreioVoz();
    }
}
