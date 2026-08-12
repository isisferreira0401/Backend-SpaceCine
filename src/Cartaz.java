public class Cartaz {
    private String titulo;
    private String classificacaoIndicativa;
    private String dtEstreia;
    private String genero;
    private String duracao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(String classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public String getDtEstreia() {
        return dtEstreia;
    }

    public void setDtEstreia(String dtEstreia) {
        this.dtEstreia = dtEstreia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Cartaz(String titulo, String classificacaoIndicativa, String dtEstreia, String genero, String duracao) {
        this.titulo = titulo;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.dtEstreia = dtEstreia;
        this.genero = genero;
        this.duracao = duracao;
    }

}
