package desafioUML;

public class ReprodutorMusical {
     protected void tocar() {
        System.out.println("Reprodutor músical em execução");
    }

    protected void pausar() {
        System.out.println("Reprodutor músical pausado. ");
    }

    protected void selecionarMusica(String musica) {
        System.out.println("Nova música selecionada: " + musica);
    }
}
