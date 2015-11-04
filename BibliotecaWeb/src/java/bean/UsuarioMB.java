package bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import model.Usuario;

/**
 *
 * @author vitor
 */
@ManagedBean(eager = true)
@ApplicationScoped //Application, pois os usuários cadastrados deverão permanecer mesmo se fizer logout.
public class UsuarioMB {

    //CRUD
    private List<Usuario> listaUsuarios;
    private Usuario usuarioSelecionado;
    
    private Usuario usuario =new Usuario();

    public UsuarioMB() {
        usuarioSelecionado = new Usuario();
        listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios.add(new Usuario("admin", "admin"));
    }

    public Usuario getUsuarioSelecionado() {
        return usuarioSelecionado;
    }

    public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
        this.usuarioSelecionado = usuarioSelecionado;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public String novoUsuario() {
        usuarioSelecionado = new Usuario();
        return ("/admin2/index?faces-redirect=true");
    }

    public String adicionarUsuario() {
        listaUsuarios.add(usuarioSelecionado);
        return (this.novoUsuario());
    }

    public String editarUsuario(Usuario u) {
        usuarioSelecionado = u;
        return ("/admin2/edicao?faces-redirect=true");
    }

    public String atualizarUsuario() {
        usuarioSelecionado = new Usuario();
        return ("/admin2/index?faces-redirect=true");
    }

    public void removerUsuario(Usuario usuario) {
        listaUsuarios.remove(usuario);
    }

}
