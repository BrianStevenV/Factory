public class FabricaFacturacion {
    public static Facturacion obtenerFacturacion(String input){
        switch (input){
            case "Año Curso":
                return new FacturacionAnoCurso();
            case "Especial":
                return new FacturacionEspecial();
            default:
                return new FacturacionEspecial();
        }
    }
}
