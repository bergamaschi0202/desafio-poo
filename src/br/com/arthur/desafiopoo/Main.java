package br.com.arthur.desafiopoo;

import br.com.arthur.desafiopoo.Entity.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso de Js");
        curso1.setDescricao("descrição curso Js");
        curso1.setCargahoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        //Teste métodos

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devArthur = new Dev();
        devArthur.setNome("Arthur");
        devArthur.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Arthur:" + devArthur.getConteudosInscritos());
        devArthur.progredir();
        devArthur.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Arthur:" + devArthur.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Arthur:" + devArthur.getConteudosConcluidos());
        System.out.println("XP:" + devArthur.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}