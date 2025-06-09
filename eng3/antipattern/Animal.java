public class Animal {
    public String nome;  
    public String raca;  

    public void voar() {
        System.out.println(nome + " tentou voar, mas animais terrestres não voam!");
    }

    public void comer() {
        System.out.println(nome + " está comendo...");
    }

    public void nadar() {
        System.out.println(nome + " está nadando...");
    }

    public void andar() {
        System.out.println(nome + " está andando...");
    }
}