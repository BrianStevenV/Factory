public class FacturacionAnoCurso implements Facturacion{
    @Override
    public void imprimirMensaje(String factura) {
        System.out.println("Tengo una facturacion de 19% de IVA." + factura);
    }
}
