import java.util.List;
public class Temporada {
    String genero;
    private List<Capitulo> capitulo;
    Integer numTemporada;
    private Integer duracion;

    public Boolean fueVistoCompletoPor(Usuario usuario) {
        return this.capitulo.stream().
                allMatch(Capitulo -> Capitulo.fueVistoCompletoPor(usuario));
    }
    public Temporada(Integer numTemporada, List<Capitulo> capitulo) {
        this.numTemporada= numTemporada;
        this.capitulo=capitulo;
    }

    public Integer duracion(){ return capitulo.stream()
            .map(Capitulo -> Capitulo.duracion()).reduce(0,Integer::sum);
    }
    public Capitulo ultimoCapituloSerie(){
        return capitulo.get(capitulo.size()-1);
    }

    public String genero(Contenido contenido){
        return genero;
    }
}
