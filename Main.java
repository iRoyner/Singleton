import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("args = " + args);

        int opc = 0;

        do {
            System.out.println("----------------------------------- \n" +
                    "Fabrica de carros" +
                    " \nIngrese un la operación que quiere realizar: " +
                    " \n -----------------------------------" +
                    " \n 1. Crear un carro " +
                    " \n 2. Salir" +
                    " \n -----------------------------------");
            Scanner sc = new Scanner(System.in);
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nombre del carro");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese la marca del carro");
                    String marca = sc.nextLine();
                    System.out.println("Ingrese el modelo del carro");
                    String modelo = sc.nextLine();
                    System.out.println("Ingrese el color del carro");
                    String color = sc.nextLine();
                    System.out.println("Ingrese la marca del radio carro");
                    String radio = sc.nextLine();
                    System.out.println("Ingrese la marca de llantas del carro");
                    String llantas = sc.nextLine();
                    Automovil automovil = AutomovilSingleton.getInstance(nombre, marca, modelo, color, llantas);
                    Radio radiom = RadioSingleton.getInstance(radio);
                    
                    System.out.println("----------------------------------- \n " +
                            "El carro fabricado es: \n Nombre: " + nombre + " \n Marca: " + marca + "\n Modelo: " + modelo +
                            "\n color: " + color + "\n Radio: " + radio + "\n Llantas: " + llantas + "\n----------------------------------- \n");

                    int opc1 = 0;
                    do {
                        System.out.println("----------------------------------- \n " +
                                "Seleccione una funcion a realizar" +
                                "\n -----------------------------------" +
                                "\n 1. Encender " +
                                "\n 2. Arrancar " +
                                "\n 3. detener " +
                                "\n 4. Apagar " +
                                "\n 5. Salir" +
                                "\n -----------------------------------");

                        opc1 = Integer.parseInt(sc.nextLine());
                        switch (opc1) {
                            case 1:
                                automovil.encender();
                                break;
                            case 2:
                                automovil.arrancar();
                                break;
                            case 3:
                                automovil.detener();
                                break;
                            case 4:
                                automovil.apagar();
                                break;
                            case 5:
                                System.out.println("Salir");
                                opc = 0;
                                break;
                            default:
                                System.out.println("Opcion Invalida");
                        }
                    } while (opc1 < 5);
                    break;
            }
        } while (opc < 2);
    }
}
