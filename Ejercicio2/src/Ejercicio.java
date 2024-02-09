import java.io.Writer;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        System.out.println("Escribe el nombre del cliente:");
        Scanner scanner = new Scanner(System.in);
        String nombreCliente = scanner.nextLine();
        /*System.out.println("Nombre del cliente = " + nombreCliente);*/

        System.out.println("Escribe el nombre de producto: ");
        scanner = new Scanner(System.in);
        String nombreProducto = scanner.nextLine();

        System.out.println("Escribe el precio del producto: ");
        scanner = new Scanner(System.in);
        var precioProducto = scanner.nextLine();
        int precioLong = Integer.parseInt(precioProducto);
        System.out.println("precioLong = " + precioLong);

        System.out.println("El IVA es del 21 %");

        System.out.println("Factura:\nNombre: " + nombreCliente + ".\nProducto: " + nombreProducto + ".\nPrecio: " + precioProducto + ".\nIVA: 21% \nTotal Factura: " + (precioLong * 21 / 100));







    }
}
