
package Model;

import java.text.SimpleDateFormat;

public class RetiradaDevolucao {
    
    private String dataRetirada;
    private String dataParaDevolucao;
    private Livro livro;
    private Cliente cliente;
    private SimpleDateFormat formatador = new SimpleDateFormat("'Data Devolução: 'dd/MM/yyyy");
    
    public RetiradaDevolucao(Cliente cliente, Livro livro, String dataRetirada, String dataParaDevolucao){
        this.dataRetirada = dataRetirada; 
        this.dataParaDevolucao = dataParaDevolucao;
        this.cliente = cliente;
        this.livro = livro;
    }

    RetiradaDevolucao() {
    }
    
    public void setDataRetirada(String dataRetirada){
        
        this.dataRetirada = dataRetirada;
    }
    
    public String getDataRetirada(){
        return dataRetirada;
    }
    
    public void setDataParaDevolucao(String dataDevolucao){
        
        this.dataParaDevolucao = dataDevolucao;
    }
    
    public String getDataParaDevolucao(){
        return dataParaDevolucao;
    }
    
    public void setCliente(Cliente cliente){
        
        this.cliente = cliente;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setLivro(Livro livro){
        
        this.livro = livro;
    }
    
    public Livro getLivro(){
        return livro;
    }
   
}

