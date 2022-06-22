
package javalinkedlist;

public class Paciente implements Comparable<Paciente> {
    private String nome;
    private int idade;
    private int tempo;
    private int cartaoSUS;

    public void setCartaoSUS(int cartaoSUS) {
        this.cartaoSUS = cartaoSUS;
    }

    public int getCartaoSUS() {
        return cartaoSUS;
    }
    



    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the prioridade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the prioridade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the tempo
     */
    public int getTempo() {
        return tempo;
    }

    /**
     * @param tempo the tempo to set
     */
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    public int compareTo(Paciente outraAtividade){
        return getNome().compareTo(outraAtividade.getNome());
    }
            
        @Override
    public String toString(){
        return getNome() + ":" + getIdade() + " - " + getTempo() ;
    }// fim toString
    
}
