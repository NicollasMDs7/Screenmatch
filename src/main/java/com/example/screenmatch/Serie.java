package com.example.screenmatch;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporadas;
    private int duracaoEmMinutos;

    public Serie(int anoDeLancamento, String nome) {
        super(anoDeLancamento, nome);
    }

    //para declarar os get e set com valore e necessario declarar parametros como (int i).
    public int getTemporadas(int temporadas) {
        return temporadas;
    }

    public int setTemporadas(int temporadas) {
        return temporadas;
    }

    public boolean getAtiva(boolean ativa) {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        return episodiosPorTemporadas;
    }

    public int setEpisodiosPorTemporada(int episodiosPorTemporadas) {
        return episodiosPorTemporadas;
    }

    public int getDuracaoEmMinutos(int duracaoEmMinutos) {
        return duracaoEmMinutos;
    }

    public int setDuracaoEmMinutos(int duracaoEmMinutos) {
        return duracaoEmMinutos;
    }

    @Override
    // A anotacao @override possibilita a sobrescrita de um metodo.
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporadas * duracaoEmMinutos;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}




