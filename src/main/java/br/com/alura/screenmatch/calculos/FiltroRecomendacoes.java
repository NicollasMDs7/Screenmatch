package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacoes {
    private String recpmendacao;

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClasssificacao() >= 4) {
            System.out.println("Esta entre os preferidos do momento.");
        } else if (classificavel.getClasssificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento.");
        } else {
            System.out.println("Coloque o filme na sua lista para ver outra hora.");
        }
    }
}
