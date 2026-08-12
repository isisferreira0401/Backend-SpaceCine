import enums.TipoSala;

public class Sala {
    private int id;
    private String assentos;
    private String infoSala;
    private TipoSala tipoSala;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAssentos() {
        return assentos;
    }

    public void setAssentos(String assentos) {
        this.assentos = assentos;
    }

    public String getInfoSala() {
        return infoSala;
    }

    public void setInfoSala(String infoSala) {
        this.infoSala = infoSala;
    }

    public TipoSala getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(TipoSala tipoSala) {
        this.tipoSala = tipoSala;
    }

    public Sala(int id, String assentos, String infoSala, TipoSala tipoSala) {
        this.id = id;
        this.assentos = assentos;
        this.infoSala = infoSala;
        this.tipoSala = tipoSala;
    }



}
