import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
    private Contenido contenido;
    private List<Contenido> contenidoVisto;
    //private List <Contenido> contenidoVistoSegunGenero;

    public Boolean vioContenidoCompleto(Contenido contenido) {
        return contenido.fueVistoCompletoPor(this);
    }

    public String contenidoVistoSegunGenero(Contenido contenido) {
        return contenidoVistoSegunGenero.stream().map(C -> contenido.genero()).distint().collect(Collectors.toSet());
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

}





