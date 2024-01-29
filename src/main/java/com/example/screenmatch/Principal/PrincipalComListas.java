package com.example.screenmatch.Principal;

import com.example.screenmatch.Filme;
import com.example.screenmatch.Serie;
import com.example.screenmatch.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefao", 1970);
        meuFilme.avalia(7);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(7);
        Serie lost = new Serie(2000, "Lost");
        lost.avalia(8);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeDoPaulo);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(lost);
        for (Titulo item : listaDeAssistidos) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificacao " + filme.getClasssificacao());

            }
        }
        //ArrayLista == List;
        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Adam Sandler");
        buscaPorArtistas.add("Paulo");
        buscaPorArtistas.add("Jacqueline");
        System.out.println(buscaPorArtistas);
//Interface comparable
        Collections.sort(buscaPorArtistas);
        System.out.println("Depois da ordenacao");
        System.out.println(buscaPorArtistas);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);

        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        //Comparator interface
        System.out.println("Ordenando pelo anos" + listaDeAssistidos);

    }
}
