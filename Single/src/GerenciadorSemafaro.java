import java.lang.reflect.InvocationTargetException;

public class GerenciadorSemafaro {
    private Semafaro semafaro;

    public GerenciadorSemafaro(String tipoSemafaro) {
        try {
            Class<?> classeSemafaro = Class.forName(tipoSemafaro);
            this.semafaro = (Semafaro) classeSemafaro.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void exibirCor() {
        semafaro.exibirCor();
    }
}
