package com.example.screenmatch;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    //extends quando quer usar uma outra classse como ela tem tudo que o titulo tem.
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(anoDeLancamento, nome);
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClasssificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}