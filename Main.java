public class Main {
    public static void main(String[] args) {
        Juego producto1 = new Juego();
        Juego producto2 = new Juego();
        Juego producto3 = new Juego();
        Juego producto4 = new Juego();





    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TiendaMascotas tienda = new TiendaMascotas();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de la Tienda de Mascotas Exóticas ---");
            System.out.println("1. Ver información de las especies disponibles");
            System.out.println("2. Vender mascota");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // limpiar buffer

            switch (opcion) {
                case 1:
                    tienda.mostrarInventario();
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la especie: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la cantidad a vender: ");
                    int cantidad = scanner.nextInt();
                    tienda.venderMascota(nombre, cantidad);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}


public class Mascota {
    private String nombre;
    private int vidaPromedio;
    private String claseAnimal;
    private double precioVenta;
    private int cantidadDisponible;
    private int totalVendidas;

    public Mascota(String nombre, int vidaPromedio, String claseAnimal, double precioVenta, int cantidadDisponible) {
        this.nombre = nombre;
        this.vidaPromedio = vidaPromedio;
        this.claseAnimal = claseAnimal;
        this.precioVenta = precioVenta;
        this.cantidadDisponible = cantidadDisponible;
        this.totalVendidas = 0;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida promedio: " + vidaPromedio + " años");
        System.out.println("Clase de animal: " + claseAnimal);
        System.out.println("Precio de venta: $" + precioVenta);
        System.out.println("Cantidad disponible: " + cantidadDisponible);
        System.out.println("Cantidad total vendidas: " + totalVendidas);
        System.out.println("--------------------------------");
    }

    public boolean vender(int cantidad) {
        if (cantidad <= cantidadDisponible) {
            cantidadDisponible -= cantidad;
            totalVendidas += cantidad;
            System.out.println("Venta realizada con éxito: " + cantidad + " " + nombre);
            return true;
        } else {
            System.out.println("No hay suficientes " + nombre + " disponibles para la venta.");
            return false;
        }
    }
}



