import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
    private List<Contenido> contenidoVisto;
    private List <Contenido> contenidoVistoSegunGenero;



    public Boolean vioContenidoCompleto(Contenido contenido) {
        return contenido.fueVistoCompletoPor(this);
    }

    public String contenidoVistoSegunGenero(Contenido contenido) {
        return contenidoVistoSegunGenero.stream().map(c -> contenido.genero()).distint().collect(Collectors.toSet());
    }

    public List<Contenido> getContenidoVisto() {
        return contenidoVisto;
    }
    public Boolean vio (Contenido contenido){
        return contenidoVisto.contains(contenido);
    }
    public void setContenidoVisto() {
        this.contenidoVisto = contenidoVisto;

    }
    public List<Contenido> getContenidoVistoSegunGenero(){
        return contenidoVistoSegunGenero;
    }

    public void setContenidoVistoSegunGenero(List<Contenido> contenidoVistoSegunGenero) {
        this.contenidoVistoSegunGenero = contenidoVistoSegunGenero;
    }

    public String genero(Contenido contenidoVisto) {
        return null;
    }


    public Boolean fueVistoCompletoPor(Usuario usuario) {
        return null;
    }
}
    /*. Saber los géneros que vio un usuario, sin repetición.
        b. Saber el género preferido de un usuario, que es aquel género
        del cual se vieron más minutos.*/




