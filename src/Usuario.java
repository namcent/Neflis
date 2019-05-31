import java.util.List;

public class Usuario {
    private List<Contenido> contenidoVisto;
    public Contenido contenido;
    //Aca se le dice al usuario que contenido vio completo

    public Boolean vioContenidoCompleto(List<Contenido> contenido) {return contenido.fueVistoCompletaX();
      //  return getContenidoVisto().contains(contenido);
    }

    /*public Boolean contQueVioXGenero(Contenido contenido){
        return contQueVio.stream().map(Contenido->Contenido.getGenero()).
        distinct().collect( Collectors.toSet());}/*/

    public List<Contenido> getContenidoVisto() {
        return contenidoVisto;
    }
    public void setContenidoVisto(Contenido contenido) {
        this.contenidoVisto = contenidoVisto;
    }

}
