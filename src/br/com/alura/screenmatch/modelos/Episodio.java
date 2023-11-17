package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel { //Class episódio implementando a interface Classificavel
    private int numero;
    private String nome; //Atributos criado pra classe episódio
    private Serie serie;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() { //implementando o metodo da interface Classificavel
        if (totalVisualizacoes > 100){ //Se tivermos mais de 100 vizu retornaremos 4 estrelas senão apenas 2
            return 4;
        }else{
            return 2;
        }

    }
}
