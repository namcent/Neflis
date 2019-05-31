import java.util.List;

public class Usuario {
    private Contenido contenido;
    private List <Contenido> contenidosVistos;
    public Boolean vioContenidoCompleto(Contenido contenido){
        return contenido.fueVistoCompletoPor(this);
    }
    public Boolean vio (Contenido contenido){
        return contenidosVistos.contains(contenido);
    }
    public List<Contenido> getContenidosVistos(){
        return contenidosVistos;
    }
    public void setContenidosVistos() {
        this.contenidosVistos = contenidosVistos;

    }

}
