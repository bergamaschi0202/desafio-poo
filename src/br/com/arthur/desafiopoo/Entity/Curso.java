package br.com.arthur.desafiopoo.Entity;

public class Curso extends Conteudo{

    private int cargahoraria;

    public Curso(){

    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargahoraria;
    }

    //==============================================================
    // Geters e Seters

    public int getCargahoraria() {
        return cargahoraria;
    }
    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }


}
