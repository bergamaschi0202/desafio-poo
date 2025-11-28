package br.com.arthur.desafiopoo;

import br.com.arthur.desafiopoo.Entity.Conteudo;
import br.com.arthur.desafiopoo.Entity.Curso;
import br.com.arthur.desafiopoo.Entity.Mentoria;

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

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}