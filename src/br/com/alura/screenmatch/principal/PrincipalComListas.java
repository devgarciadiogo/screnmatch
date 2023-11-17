package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas { //Criando uma classe nova para
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDaAlice =  new Filme("It - A Coisa", 2017);
        filmeDaAlice.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDaAlice;

        List<Titulo> lista = new LinkedList<>(); //Criando uma ArrayList e aprendendo suas funcionalidades
        lista.add(filmeDaAlice);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) { //Fazendo um for pra iterar a lista
            System.out.println(item.getNome()); //Printando os nomes dos Titulos  = (Serie e FIlme)
            if(item instanceof Filme filme && filme.getClassificacao() > 2) { //Criando um if para verificar se o item é um Filme ou uma Serie
                System.out.println("Classificação " + filme.getClassificacao());
            }
            
        }

        ArrayList<String> buscaPorArtista =  new ArrayList<>(); //Array de busca de artistas
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista); //Função para colocar a lista de artistas em ordem alfabetica
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista); // Função para colocar a lista de filmes em ordem alfabetica
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); //Ordenando pelo ano de lançamento dos titulos
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
