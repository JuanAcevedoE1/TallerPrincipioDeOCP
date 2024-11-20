package TallerPrincipioDeOCP.OCP1;

public class DescuentoFijo extends Descuento {
    private double cantidad;

    public DescuentoFijo(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - cantidad;
    }
}
