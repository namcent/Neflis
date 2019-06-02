import java.util.List;

public class Usuario {
    private List<Contenido> contenidoVisto;
    public Contenido contenido;
    //Aca se le dice al usuario que contenido vio completo

    public Boolean vioContenidoCompleto(Contenido contenido) {return contenido.fueVistoCompletaX(this);
    }
    //public Usuario();


    public List<Contenido> getContenidoVisto() {
        return contenidoVisto;
    }
    public void setContenidoVisto(List<Contenido> contenido) {
        this.contenidoVisto = contenidoVisto;
    }

}
