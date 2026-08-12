void main() {

    Filme filme = new Filme ();
    IO.println(filme.getNome());
    filme.setNome("Harry Potter");
    filme.setDuracao(200);

    filme.setdataEstreia(LocalDate.off(2026,8,12));



}
