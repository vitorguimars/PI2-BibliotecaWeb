package bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import model.Livro;

/**
 *
 * @author vitor
 */
@ManagedBean(eager = true)
@ApplicationScoped //Application, pois os usuários cadastrados deverão permanecer mesmo se fizer logout.
public class LivroMB {

    //CRUD
    private List<Livro> listaLivros;
    private Livro livroSelecionado;
    
    private Livro livro = new Livro();

    public LivroMB() {
        livroSelecionado = new Livro();
        listaLivros = new ArrayList<Livro>();
        listaLivros.add(new Livro(1111, "Brida", "Paulo Coelho", "Abril", 1994, 5));
    }

    public Livro getLivroSelecionado() {
        return livroSelecionado;
    }

    public void setLivroSelecionado(Livro livroSelecionado) {
        this.livroSelecionado = livroSelecionado;
    }

    public List<Livro> getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(List<Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }

    public String novoLivro() {
        livroSelecionado = new Livro();
        return ("/livro3/index?faces-redirect=true");
    }

    public String adicionarLivro() {
        listaLivros.add(livroSelecionado);
        return (this.novoLivro());

    }

    public String editarLivro(Livro u) {
        livroSelecionado = u;
        return ("/livro3/edicao?faces-redirect=true");
    }

    public String atualizarLivro() {
        livroSelecionado = new Livro();
        return ("/livro3/index?faces-redirect=true");
    }

    public void removerLivro(Livro livro) {
        listaLivros.remove(livro);
    }

}
