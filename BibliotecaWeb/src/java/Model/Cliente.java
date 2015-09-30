
package Model;


public class Cliente {
    
    private int matricula;
    private String nomeCliente;
    private String telefone;
    private int livrosPegos;
    
    
    public Cliente(int matricula, String nomeCliente, String telefone, int livrosPegos){
        
        this.matricula = matricula;
        this.nomeCliente = nomeCliente;
        this.telefone = telefone;
        this.livrosPegos = livrosPegos;
    }
    
    public Cliente(){
        
    }

    public int getMatricula(){
        
        return matricula;
    }
    
    public void setMatricula(int matricula){
        
        this.matricula = matricula;
    }
    
    public String getNomeCliente(){
        
        return nomeCliente;
    }
    
    public void setNomeCliente(String nomeCliente){
        
        this.nomeCliente = nomeCliente;
    }
    
    public String getTelefone(){
        
        return telefone;
    }
    
    public void setTelefone(String telefone){
        
        this.telefone = telefone;
        
    }
    
    public int getLivrosPegos(){
        
        return livrosPegos;
    }
    
    public void setLivrosPegos(int livrosPegos){
        
        this.livrosPegos = livrosPegos;
        
    }
    
}
