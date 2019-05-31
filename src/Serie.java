import java.util.List;


public class Serie implements Contenido{
    String nombreSerie;Integer numTemporadaTotal;Integer numTemporadaActual;
    Integer capxTemporadaTotal;Integer capxTemporadaActual;
    //String[] actoresSerie;
    //String[] actoresInvitadoSerie;
    Integer minxCap;
    Integer duracionxCap;

    public Serie( String nombreSerie, List<Temporada> temporadas) {
        this.nombreSerie = nombreSerie;
        this.temporada = temporada;
    }

    public String genero;

    private List<Temporada> temporada;

    public Boolean fueVistoCompletaX(Usuario usuario) {
        return this.temporada.stream().
                allMatch( T -> T.fueVistoCompletaX( usuario ) );}

    public String genero(Contenido contenido) {
        return genero;
    }
    //public Integer duracion() {return temporada.stream().map( )}


    public void setGenero(String genero) {
        this.genero = genero;

    }
}

