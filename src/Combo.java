public class Combo {
    private int preco;
    private String tipo_combo;

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getTipo_combo() {
        return tipo_combo;
    }

    public void setTipo_combo(String tipo_combo) {
        this.tipo_combo = tipo_combo;
    }

    public String getBrindes() {
        return brindes;
    }

    public void setBrindes(String brindes) {
        this.brindes = brindes;
    }

    public Combo(int preco, String tipo_combo, String brindes) {
        this.preco = preco;
        this.tipo_combo = tipo_combo;
        this.brindes = brindes;
    }

    private String brindes;

}
