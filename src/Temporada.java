import java.util.List;
public class Temporada {
    private List<Capitulo> capitulo;

    public Boolean fueVistoCompletoPor(Usuario usuario) {
        return this.capitulo.stream().
                allMatch(Capitulo -> Capitulo.fueVistoCompletoPor(usuario));
    }


}
