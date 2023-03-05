import entities.Singleton;

public class TesteSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.mostrarMensagem();
    }

}
