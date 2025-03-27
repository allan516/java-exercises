package inputOutput.ExercicioIOobject;

import java.io.*;

public class ExercicioIOObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //serealizacao();
        desserializacao("gato");
    }

    public static void serealizacao() throws IOException {
        Gato gato = new Gato ("half",  5, "Amarelo", true, false);

        File f = new File("gato");

//        OutputStream os = new FileOutputStream(f.getName());
//        ObjectOutputStream oos = new ObjectOutputStream(os);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));
        oos.writeObject(gato);

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo \"%s\" criado com sucesso! Tamanho '%d' bytes", f.getName(), f.length());
        oos.close();
        ps.close();
    }

    public static void desserializacao(String arquivo) throws IOException, ClassNotFoundException {
//        InputStream is = new FileInputStream(arquivo);
//        ObjectInputStream ois = new ObjectInputStream(is);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
        Gato objetoGato = (Gato) ois.readObject();

        System.out.printf("\nNome: %s\n", objetoGato.getNome());
        System.out.printf("Idade: %d\n", objetoGato.getIdade());
        System.out.printf("Cor: %s\n", objetoGato.getCor());
        System.out.printf("Castrado: ", objetoGato.isCastrado());
        System.out.printf("Ronrona: ", objetoGato.isRonrona());
        System.out.println(objetoGato);

        ois.close();
    }

}
