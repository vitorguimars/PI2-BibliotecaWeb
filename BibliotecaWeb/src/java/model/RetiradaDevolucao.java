package model;

import java.text.SimpleDateFormat;

public class RetiradaDevolucao {

    private String dataRetirada;
    private String dataParaDevolucao;
    private Livro livro;
    private Usuario usuario;

    public RetiradaDevolucao(Usuario usuario, Livro livro, String dataRetirada, String dataParaDevolucao) {
        this.dataRetirada = dataRetirada;
        this.dataParaDevolucao = dataParaDevolucao;
        this.usuario = usuario;
        this.livro = livro;
    }

    RetiradaDevolucao() {
    }

    public void setDataRetirada(String dataRetirada) {

        this.dataRetirada = dataRetirada;
    }

    public String getDataRetirada() {
        return dataRetirada;
    }

    public void setDataParaDevolucao(String dataDevolucao) {

        this.dataParaDevolucao = dataDevolucao;
    }

    public String getDataParaDevolucao() {
        return dataParaDevolucao;
    }

    public void setUsuario(Usuario usuario) {

        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setLivro(Livro livro) {

        this.livro = livro;
    }

    public Livro getLivro() {
        return livro;
    }

}
