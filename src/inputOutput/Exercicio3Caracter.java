package inputOutput;

import java.io.*;

public class Exercicio3Caracter {
    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }

    public static void copiarArquivo() throws IOException {
        File f = new File("recomendacoes.txt");
        String nomeArquivo = f.getName();

//        FileReader r = new FileReader(nomeArquivo);
//        BufferedReader br = new BufferedReader(r);

        //usando decorator:

        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
        String line = br.readLine();

        //criando a copia:

        String nomeArquivoCopia = nomeArquivo.substring(0,nomeArquivo.indexOf(".")).concat("-copia.txt");
        File copia = new File(nomeArquivoCopia);

        BufferedWriter bw = new BufferedWriter(new FileWriter(copia.getName()));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
            bw.flush();
        } while (!(line == null));

        System.out.printf("Arquivo \"%s\" copiado com sucesso! Com o tamanho '%d' bytes.\n", f.getName(), f.length());
        System.out.printf("Arquivo \"%s\" copiado com sucesso! Com o tamanho '%d' bytes.\n", copia.getName(), copia.length());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomende 3 livros: ");
        pw.flush();

        adicionarInfoNoArquivo(copia.getName());

        pw.printf("Ok! tudo certo. Tamanho do arquivo %d bytes", copia.length());

        br.close();
        bw.close();
        pw.close();
    }

    public static void adicionarInfoNoArquivo(String arquivo) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));

        do {

            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!(line.equalsIgnoreCase("fim")));
        br.close();
        bw.close();
    }
}
