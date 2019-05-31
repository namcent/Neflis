
import java.util.List;

public class Serie implements Contenido{

    String nombreSerie;
    Integer numTemporada;
    private List<Temporada> temporada;
    private String genero;


    public String genero(Contenido contenido) { return genero;}

    public Serie(String nombreSerie,Integer numTemporada) {
        this.nombreSerie = nombreSerie;
        this.numTemporada = numTemporada;
    }

    public Boolean fueVistoCompletoPor(Usuario usuario) {
        return this.temporada.stream().
                allMatch( T -> T.fueVistoCompletoPor( usuario ) );
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;

    }
}
