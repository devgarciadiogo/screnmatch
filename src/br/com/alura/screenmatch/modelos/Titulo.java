package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable <Titulo> { //implementando um Comparable, para comparar
    private String nome;
    private int anoDeLancamento;
    private boolean inclusoNoPlano; //Atributos que compõem a classe filme que vão ser utilizados no objetos
    private double somaDasAvaliacoes; //Utilizando modificadores de acesso, privando o atributo
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //Só podemos utilizar um atributo privado na propria classe onde ele foi criado
    //Criando um METÓDO ACESSOR (aprendendo sobre conceitos de modificadores de acesso)
    //Get = Obter valor, Set = Atribuir valor


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isInclusoNoPlano() {
        return inclusoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){ //Obtendo valor do "totalDeAvaliacoes" atrávés do get
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) { //Concedendo permissão de acesso do atributo privado "nome" através do set
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano) {
        this.inclusoNoPlano = inclusoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //Criando um MÉTODO (quando ele não tem um retorno declaramos ele como void = vazio)

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome); //Acessando os atributos da classe Titulo
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    //Criando um MÉTODO COM ARGUMENTOS

    public void avalia(double nota){
        somaDasAvaliacoes += nota; //Ideia do código é ir somando cada nota que foi obtida
        totalDeAvaliacoes++; //Atributo vai ser incrementando cada vez que uma avaliação for adicionada
    }

    //Criando um MÉTODO QUE RETORNA VALOR (Nesse caso vou criar um que retorne a média das avaliações)

    public double pegaMedia(){ //Usando double pois é média e média e feita com números reais
        return somaDasAvaliacoes / totalDeAvaliacoes; // retornar a soma das avaliações dividido pelo total de avaliações

    }

    @Override
    public int compareTo(Titulo outroTitulo) { //Criando o método de CompareTo, aqui quero comparar um titulo com outro titulo
        return this.getNome().compareTo(outroTitulo.getNome()); //Aqui eu quero comparar um nome de um titulo com outro nome de titulo
    }
}
