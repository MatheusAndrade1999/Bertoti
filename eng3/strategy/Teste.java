public class Teste {
    
    public static void main(String[] args) {

        
        Animal baleia = new Animal("Baleia");

        baleia.setMovimento(new Nadar());

        baleia.mover();
    
    }

}