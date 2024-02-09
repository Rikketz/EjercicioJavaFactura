import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Precio del producto 1");
        double producto1 = scanner.nextDouble();

        System.out.println("Precio del producto 2");
        double producto2 = scanner.nextDouble();

        double sumaTotal = producto1 + producto2;

        double valorImpuesto = 0.19;

        System.out.println("La factura " + nombre + " tiene un total bruto de " + sumaTotal + ", con un impuesto de " + (sumaTotal * valorImpuesto) + " y la cantidad después del impuesto es de " + (sumaTotal+(sumaTotal * valorImpuesto)));
    }
}
