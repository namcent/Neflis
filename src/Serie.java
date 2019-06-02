
import java.util.List;

public class Serie implements Contenido{

    String nombreSerie;
    Integer cantidadTemporadas;
    private List<Temporada> temporada;
    private String genero;

    public String genero(Contenido contenido) { return genero;}

    public Serie(String nombreSerie,Integer cantidadTemporadas) {
        this.nombreSerie = nombreSerie;
        this.cantidadTemporadas = cantidadTemporadas;
    }

    public Boolean fueVistoCompletoPor(Usuario usuario) {
        return this.temporada.stream().
                allMatch( T -> T.fueVistoCompletoPor( usuario));
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;

    }
}
