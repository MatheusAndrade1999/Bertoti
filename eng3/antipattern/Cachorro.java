public class Cachorro extends Animal {
    public Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    @Override
    public void andar() {
        System.out.println(nome + " (um " + raca + ") está correndo e abanando o rabo!");
    }
}