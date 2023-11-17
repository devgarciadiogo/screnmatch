package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo { //Criando uma calculadora para informar quanto tempo será necessário para maratonar tudo
    private int tempoTotal;

    public int getTempoTotal() { //Utilizando apenas o getter pois só quero que a calculadora some, e não que eu altere um valor
        return this.tempoTotal;
    }

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos(); //Somando a duração de cada filme que eu chamar o metódo no objeto
//    }
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos(); //Somando a duração de cada série que eu chamar o metódo no objeto
//    }

    public void inclui(Titulo titulo){ //Importei a classe Titulo pois tanto filme quanto série são titulos
        System.out.println("Adicionando duração em minutos de: " + titulo); //Será exibido onde está sendo adicionado o duração em minutos que no caso é em um titulo(Filme ou Série)
        this.tempoTotal += titulo.getDuracaoEmMinutos(); //Polimorfismo
    }

}
