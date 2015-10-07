
package model;


public class Livro {
    
    private int isbn;
    private String nomeLivro;
    private String autor;
    private String editora;
    private int ano;
    private int qtde;
    
    public Livro(){
    }
    
    public Livro(int isbn, String nomeLivro, String autor, String editora, int ano, int qtde){
        
        this.isbn = isbn;
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.qtde = qtde;
    }

    public int getIsbn(){
        
        return isbn;
    }
    
    public void setIsbn(int isbn){
        
        this.isbn = isbn;
    }
    
    public String getNomeLivro(){
        
        return nomeLivro;
    }
    
    public void setNomeLivro(String nomeLivro){
        
        this.nomeLivro = nomeLivro;
    }
    
    public String getAutor(){
        
        return autor;
    }
    
    public void setAutor(String autor){
        
        this.autor = autor;
    }
    
    public String getEditora(){
        
        return editora;
    }
    
    public void setEditora(String editora){
        
        this.editora = editora;
    }
    
    public int getAno(){
        
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }

    public int getQtde(){
        
        return qtde;
    }
    
    public void setQtde(int qtde){
        
        this.qtde = qtde;
    }
    
}
