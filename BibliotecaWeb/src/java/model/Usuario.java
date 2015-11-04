package model;

/**
 *
 * @author vitor
 */
public class Usuario {

    private int matricula;
    private String nome;
    private String telefone;
    private int livrosPegos;
    private String login;
    private String senha;
    private boolean admin;

    public Usuario() {
    }

    public Usuario(String login, String senha) {
        this.nome = login;
        this.login = login;
        this.senha = senha;
        this.admin = true;

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getLivrosPegos() {
        return livrosPegos;
    }

    public void setLivrosPegos(int livrosPegos) {
        this.livrosPegos = livrosPegos;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getAdminString() {
        if (admin) {
            return "SIM";
        } else {
            return "NAO";
        }
    }

    public boolean verificaLogin(String login, String senha) {
        return (this.login.equals(login) && this.senha.equals(senha));
    }

}
