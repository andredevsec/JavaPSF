
package javalinkedlist;
//import java.lang.Comparable;
public class PSF implements Comparable<PSF>{
    private String nome;
    private int prioridade;
    private int idade;
    private int cartaosus;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCartaosus(int cartaosus) {
        this.cartaosus = cartaosus;
    }
   

    public int getIdade() {
        return idade;
    }

    public int getCartaosus() {
        return cartaosus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getTempo() {
        return idade;
    }

    public void setTempo(int tempo) {
        this.idade = tempo;
    }
    
    public int compareTo(PSF outraAtividade){
      return this.getNome().
              compareTo(outraAtividade.getNome());
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PSF outraAtividade = (PSF) o;

        return this.nome != null ? (outraAtividade.nome).equals(this.nome) : outraAtividade.nome == null;
    }

    
     @Override
    public String toString(){
        return getNome() + " : " + getPrioridade() + " - " + getTempo() ;
    }// fim toString
    
}
