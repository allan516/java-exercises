package br.com.dio.desafio.dominio;

import javax.crypto.spec.PSource;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAllan = new Dev();
        devAllan.setNome("Allan");
        devAllan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devAllan.getConteudosInscritos());
        devAllan.progredir();
        devAllan.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos: " + devAllan.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devAllan.getConteudosConcluidos());
        System.out.println("XP: " + devAllan.calcularXp());

        System.out.println("___________________________________________________________");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularXp());

    }
}
