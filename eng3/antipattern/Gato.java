public class Gato extends Animal {
    public Gato(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    @Override
    public void comer() {
        System.out.println(nome + " (um gato " + raca + ") está comendo atum!");
    }
}