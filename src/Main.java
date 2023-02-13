public class Main {
    public static void main(String[] args) {

        Facturacion facturacion = FabricaFacturacion.obtenerFacturacion("Especial");
        facturacion.imprimirMensaje(" ,es una factura de tipo Especial");

        Facturacion facturacion2 = FabricaFacturacion.obtenerFacturacion("Año Curso");
        facturacion2.imprimirMensaje(" ,es una factura de tipo Año Curso");
    }
}