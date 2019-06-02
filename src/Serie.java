import java.util.List;

public class Serie implements Contenido{
    String nombreSerie;Integer numTemporadaTotal;Integer numTemporadaActual;
    Integer capxTemporadaTotal;Integer capxTemporadaActual;
    Integer minxCap;
    Integer duracionxCap;

    public Serie( String nombreSerie, List<Temporada> temporadas) {
        this.nombreSerie = nombreSerie;
        this.temporadas = temporadas;
    }
    public String genero;
    public Integer duracion;

    private List<Temporada> temporadas;

    public Boolean fueVistoCompletaX(Usuario usuario) {
        return this.temporadas.stream().
                allMatch( T -> T.fueVistoCompletaX( usuario ) );}

    public String genero(Contenido contenido) {
        return genero;
    }
    //public Integer duracion(){return duracion;}

    public Integer duracion(){
        return temporadas.stream().map(t-> t.duracion()).reduce(0, Integer :: sum);
    }}

