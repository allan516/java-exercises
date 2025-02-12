package desafioUML;

public class AparelhoTelefonico {

    protected void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    protected void atender() {
        System.out.println("ligação em andamento");
    }

    protected void iniciarCorreioVoz() {
        System.out.println("Correio de voz ativo, grave sua mensagem. ");
    }
}
