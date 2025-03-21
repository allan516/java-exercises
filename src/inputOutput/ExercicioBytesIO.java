package inputOutput;

import java.io.*;

public class ExercicioBytesIO {
    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }

    public static void copiarArquivo() throws IOException {
        File f = new File("recomendacoes-copia.txt");
        String nomeArquivo = f.getName();

//        InputStream is = new FileInputStream(f.getName());
//        BufferedInputStream bis = new BufferedInputStream(is);

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f.getName()));

        String nomeArquivoCopia = nomeArquivo.substring(0, nomeArquivo.indexOf("-")).concat("copia2.txt");
        File copia = new File(nomeArquivoCopia);

//        OutputStream os = new FileOutputStream(nomeArquivoCopia);
//        BufferedOutputStream bos = new BufferedOutputStream(os);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nomeArquivoCopia));
        int line = 0;
        while ((line = bis.read()) != -1) {
            bos.write((char) line);
            bos.flush();
        }

        bis.close();
        bos.close();

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo %s copiado com sucesso e está no diretório %s com %d bytes. ", copia.getName(), copia.getPath(), copia.length());
    }

}
