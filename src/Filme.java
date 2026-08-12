import enums.GeneroFilme;

import java.sql.Blob;
import java.time.LocalDate;

public class Filme {
    private int id;
    private String nome;
    private GeneroFilme genero;
    private double duracao;
    private String idioma;
    private Blob sinopse;
    private LocalDate dtEstreia;

    //CONSTRUTOR VAZIO
    public Filme() {
    }

    //CONSTRUTOR COM ARGUMENTOS
    public Filme(int id, String nome, GeneroFilme genero, double duracao, String idioma, Blob sinopse, LocalDate dtEstreia) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
        this.idioma = idioma;
        this.sinopse = sinopse;
        this.dtEstreia = dtEstreia;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public GeneroFilme getGenero() {
        return genero;
    }

    public void setGenero(GeneroFilme genero){
        this.genero = genero;
    }

    public double getDuracao(){
        return duracao;
    }
    public void setDuracao(double duracao){
        if (duracao < 0){
            IO.println("A duração não pode ser negativa");
        }
        else {
            this.duracao = duracao;
        }
    }

    public String getIdioma(){
        return idioma;
    }
    public void setIdioma(String idioma){
        this.idioma = idioma;
    }

    public Blob getSinopse(){
        return sinopse;
    }
    public void setSinopse(Blob sinopse){
        this.sinopse = sinopse;
    }

    public LocalDate getDtEstreia(){
        return dtEstreia;
    }
    public void setDtEstreia(LocalDate dtEstreia){
        this.dtEstreia = dtEstreia;
    }


}
