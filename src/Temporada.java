import java.util.List;
public class Temporada {


    private List<Capitulo> capitulo;
    Integer cantidadCapitulos;
    Integer numCapitulo;
    Integer minutosXCapitulo;

    public Boolean fueVistoCompletoPor(Usuario usuario) {
        return this.capitulo.stream().
                allMatch(Capitulo -> Capitulo.fueVistoCompletoPor(usuario));
    }
    public Temporada(Integer cantidadCapitulos,Integer numCapitulo, Integer minutosXCapitulo) {
        this.cantidadCapitulos = cantidadCapitulos;
        this.numCapitulo = numCapitulo;
        this.minutosXCapitulo= minutosXCapitulo;
    }
}
