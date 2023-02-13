public class FacturacionEspecial implements Facturacion{
    @Override
    public void imprimirMensaje(String factura) {
        System.out.println("Tengo una facturacion reducida del 8%" + factura);
    }
}
