public class Avaliacao {

    private String usuario;
    private String resenhaCritica;
    private String dtResenha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getResenhaCritica() {
        return resenhaCritica;
    }

    public void setResenhaCritica(String resenhaCritica) {
        this.resenhaCritica = resenhaCritica;
    }

    public String getDtResenha() {
        return dtResenha;
    }

    public void setDtResenha(String dtResenha) {
        this.dtResenha = dtResenha;
    }

    public Avaliacao(String usuario, String resenhaCritica, String dtResenha) {
        this.usuario = usuario;
        this.resenhaCritica = resenhaCritica;
        this.dtResenha = dtResenha;
    }
}
