package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo; //Importando a classe CalculadoraDeTempo criada em um pacote para calculos
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme; //importando classes dentro de um pacote nesse caso "Filme"
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {  //Classe (br.com.alura.screenmatch.principal.Principal) main onde vamos manipular os objetos da classe Filme
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970); //Chamando a classe br.com.alura.screenmatch.modelos.Filme e criando uma variavel para guardar o objeto
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos()); //Pegando o valor "setado" de DuracaoEmMinutos e obtendo pelo get para ser mostrado na nossa tela

        meuFilme.exibeFichaTecnica(); //Chamando o método na classe br.com.alura.screenmatch.principal.Principal, o objeto vai executar essa ação
        meuFilme.avalia(8);
        meuFilme.avalia(5); //Registrando as avaliações atráves do método com argumentos .avalia
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes()); //Fornecendo acesso ao atributo privado na classe principal
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1; ***LINHA 14, 15 E 16 NÃO FUNCIONA POIS ATRIBUTOS SÃO PRIVADOS***
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023); //Criando outro objeto Filme para fazer o teste da calculadora de tempo
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo(); //Criando objeto da calculadora
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme); //Acionando o método em outro objeto chamado "OutroFilme"
        calculadora.inclui(lost); //Método no objeto Lost da subclasse Serie
        System.out.println(calculadora.getTempoTotal()); //Tempo total de quanto será o tempo para assistir todos os titulos

        FiltroRecomendacao filtro = new FiltroRecomendacao(); //Criando objeto "filtro" da classe "FiltroRecomendacao" que utilizou o metótodo da interface Classificavel
        filtro.filtra(meuFilme); //Utilizando o método filtra criado na classe "FiltroRecomendacao" referenciado a subclasse Filme

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio); //Chamando o método filtra novamente através do objeto criado "filtro"

        var filmeDaAlice =  new Filme("It - A Coisa", 2017);
        filmeDaAlice.setDuracaoEmMinutos(300);
        filmeDaAlice.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>(); //Criando uma ArrayList e aprendendo suas funcionalidades
        listaDeFilmes.add(filmeDaAlice);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());



    }
}
