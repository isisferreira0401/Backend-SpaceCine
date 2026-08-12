import java.time.LocalDate;

public class Sessao {
    public String informacoes_ingressos;
    public String sala;
    public LocalDate horarios;

    public String getInformacoes_ingressos() {
        return informacoes_ingressos;
    }

    public void setInformacoes_ingressos(String informacoes_ingressos) {
        this.informacoes_ingressos = informacoes_ingressos;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public LocalDate getHorarios() {
        return horarios;
    }

    public void setHorarios(LocalDate horarios) {
        this.horarios = horarios;
    }

    public LocalDate getLocal() {
        return local;
    }

    public void setLocal(LocalDate local) {
        this.local = local;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public String getTipo_sessao() {
        return tipo_sessao;
    }

    public void setTipo_sessao(String tipo_sessao) {
        this.tipo_sessao = tipo_sessao;
    }

    public Sessao(String informacoes_ingressos, String sala, LocalDate horarios, LocalDate local, String tipo_sessao, LocalDate dia) {
        this.informacoes_ingressos = informacoes_ingressos;
        this.sala = sala;
        this.horarios = horarios;
        this.local = local;
        this.tipo_sessao = tipo_sessao;
        this.dia = dia;
    }

    public LocalDate local;
    public LocalDate dia;
    public String tipo_sessao;
}
