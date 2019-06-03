
import java.util.List;

public class Serie implements Contenido{

    String nombreSerie;
    private List<Temporada> temporadas;
    public String genero;
    public Integer duracion;


    public Serie(String nombreSerie,List<Temporada>temporadas,String genero) {
        this.nombreSerie = nombreSerie;
        this.temporadas= temporadas;
        this.genero=genero;
    }

    public Boolean fueVistoCompletoPor(Usuario usuario) {
        return this.temporadas.stream().
                allMatch( temporadas -> temporadas.fueVistoCompletoPor( usuario));
    }


    public String genero(Contenido contenido) { return genero;}

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer duracion(){
        return temporadas.stream().map(t -> t.duracion()).reduce(0, Integer::sum);
    }
    public Capitulo ultimoCapituloSerie(){
        return temporadas.get(temporadas.size()-1).ultimoCapituloSerie();
    }
}
