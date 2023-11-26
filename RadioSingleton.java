public class RadioSingleton {
    private static Radio radio;

    private RadioSingleton() {
        // Constructor privado para evitar instanciación externa
    }

    public static Radio getInstance(String marca) {
        if (radio == null) {
            radio = new Radio(marca);
        }
        return radio;
    }
}
