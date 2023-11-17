package br.com.alura.screenmatch.modelos; //Pacote criado chamado modelos contendo a classe "Filme"

import br.com.alura.screenmatch.calculos.Classificavel; //Import da interface Classificavel

public class Filme extends Titulo implements Classificavel { // SubClasse Filme com herança da Classe Titulo ("Filme é um titulo") //Importei a interface Classificavel
    private String diretor; //Atributo criado na SubClasse Filme

    public Filme(String nome, int anoDeLancamento) {
       super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() { //Metódo implementado da interface Classificavel
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")"; //toString sobrescrevendo a arraylist
    }
}
