import java.util.List;
public class Temporada {


    private List<Capitulo> capitulo;
    Integer numTemporada;
    Capitulo cap;

    public Boolean fueVistoCompletoPor(Usuario usuario) {
        return this.capitulo.stream().
                allMatch(Capitulo -> Capitulo.fueVistoCompletoPor(usuario));
    }
    public Temporada(Integer numTemporada, Capitulo cap) {
        this.numTemporada= numTemporada;
        this.cap= cap;
    }

    public Integer duracion(Contenido contenido){ return capitulo.stream()
            .map(Capitulo -> Capitulo.getDuracionXCap(). sum());
}
}
