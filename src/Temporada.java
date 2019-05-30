import java.util.List;
public class Temporada {


    private List<Capitulo> capitulo;

    public Boolean fueVistoCompletaX(Usuario usuario) {
        return this.capitulo.stream().
                allMatch(Capitulo -> Capitulo.fueVistoCompletaX(usuario));
    }
}
