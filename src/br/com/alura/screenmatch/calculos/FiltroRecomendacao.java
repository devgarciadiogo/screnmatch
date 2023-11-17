package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao { //Criando um classe Recomendação para vermos a Classificação criada em Filme e em Episódio

    public void filtra(Classificavel classificavel){ //metodo filtra utilizando o método implementado na interface Classificavel
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento");
        }else if (classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado no momento!");
        }else{
            System.out.println("Coloque na sua lista para assistir depois");
        }

    }
}
