import java.util.List;

public class Serie implements Contenido{
    String nombreSerie;

    public Serie( String nombreSerie, List<Temporada> temporadas) {
        this.nombreSerie = nombreSerie;
        this.temporadas = temporadas;

    }
    private List<Temporada> temporadas;

    public Boolean fueVistoCompletaX(Usuario usuario) {
        return this.temporadas.stream().
                allMatch( temporadas -> temporadas.fueVistoCompletaX( usuario ) );}

    public String genero;
    public Integer duracion;



    public String genero(Contenido contenido) {
        return genero;
    }
    //public Integer duracion(){return duracion;}

    public Integer duracion(){
        return temporadas.stream().map(t-> t.duracion()).reduce(0, Integer :: sum);
    }
    /** 3ejercicio**/
    public Capitulo ultimoCapituloSerie(){
        return temporadas.get(temporadas.size()-1).ultimoCapituloSerie();
    }

}

