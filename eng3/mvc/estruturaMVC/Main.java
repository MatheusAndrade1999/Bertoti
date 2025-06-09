package estruturaMVC;

public class Main {
    public static void main(String[] argumentos) {
        ShapeModel modelo = new ShapeModel();
        ShapeView visao = new ShapeView(modelo);

        modelo.changeState();  // Notifica a visão sobre a alteração
    }
}
