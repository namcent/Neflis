import java.util.ArrayList;
import java.util.List;

public class Usuario {
    public List <Contenido> contenidosVistos;
    public Contenido contenido;

    private List<Contenido> contenidoVisto=new ArrayList<>();
    private List <String> generosQueVio=new ArrayList<>();


    public Boolean vioContenidoCompleto(Contenido contenido){
        return this.contenidoVisto.contains(contenido);
    }
    public void setContenidosVistos(List<Contenido> contenidosVistos) {
        this.contenidosVistos = this.contenidosVistos;

    }

}
