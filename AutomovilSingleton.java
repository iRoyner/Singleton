public class AutomovilSingleton {
    private static Automovil automovil;

    private AutomovilSingleton() {
        // Constructor privado para evitar instanciación externa
    }

    public static Automovil getInstance(String nombre, String marca, String modelo, String color, String llantas) {
        if (automovil == null) {
            automovil = new Automovil(nombre, marca, modelo, color, llantas);
        }
        return automovil;
    }
}