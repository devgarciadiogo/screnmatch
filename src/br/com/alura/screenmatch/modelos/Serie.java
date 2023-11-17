package br.com.alura.screenmatch.modelos;

//Criando a SubClasse Serie fazendo uma herança a SuperClasse Titulo
//Adicionando atributos de uma série na SubClasse Série
//Tudo que um filme tem, uma série vai ter mas os seus atributos adicionais criados na sua SubClasse.
// Serie é um Titulo assim como Filme também é um Titulo

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio(int i) {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpidsodio) {
        this.minutosPorEpisodio = minutosPorEpidsodio;
    }

    @Override //Possibilita a sobrescrita de um método
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio ; //Valor que vai ser retornado quando exibir esse método na classe principal
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
