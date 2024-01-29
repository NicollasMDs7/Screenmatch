package com.example.screenmatch.Principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacoes;
import com.example.screenmatch.Episodio;
import com.example.screenmatch.Filme;
import com.example.screenmatch.Serie;
import com.example.screenmatch.Titulo;

import java.util.ArrayList;

public class PrincipalJava {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefao", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("duracao do filme" + meuFilme.getDuracaoEmMinutos());
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie(2000, "lost");
        lost.setTemporadas(7);
        lost.setEpisodiosPorTemporada(10);
        lost.setDuracaoEmMinutos(5000);
        System.out.println("Duracao para maratonar a serie " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("o tempo necessario para assistir tudo. " + calculadora.getTempoTotal());


        FiltroRecomendacoes filtro = new FiltroRecomendacoes();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie("lost");
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        // no lugar de Arraylist poderia ter sido usado o var.
        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeDoPaulo);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(lost);
        System.out.println("Tamanho da lista " + listaDeAssistidos.size());
        System.out.println("Primeiro filme" + listaDeAssistidos.get(0).getNome());
        System.out.println(listaDeAssistidos);
        System.out.println("toString do filme" + listaDeAssistidos.get(0).toString());


    }
}
