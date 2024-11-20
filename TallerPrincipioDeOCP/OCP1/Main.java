package TallerPrincipioDeOCP.OCP1;

public class Main {
    public static void main(String[] args) {
        double precioOriginal = 100.0;

        Descuento descuentoPorcentaje = new DescuentoPorcentaje(10); // 10%
        double precioConDescuentoPorcentaje = descuentoPorcentaje.aplicarDescuento(precioOriginal);
        System.out.println("Precio con descuento por porcentaje: $" + precioConDescuentoPorcentaje);

        Descuento descuentoFijo = new DescuentoFijo(15); // $15
        double precioConDescuentoFijo = descuentoFijo.aplicarDescuento(precioOriginal);
        System.out.println("Precio con descuento fijo: $" + precioConDescuentoFijo);
    }
}
