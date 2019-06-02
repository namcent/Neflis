import java.util.Collection;

public class Capitulo extends ContenidoUnitario {
    private Collection<Object> minutos;

    public Capitulo(String actores, Integer duracion) {
        super(actores, duracion);
    }


    @Override
    public String genero(Contenido contenido) {
        return null;
    }

    @Override
    protected Boolean generoMasVisto() {
        return null;
    }
    public Boolean fueVistoCompletoPor(Usuario usuario) {
        return true;

    }

}




    /*public Boolean fueVistoCompletaX(Usuario usuario) {
        return this.capitulo.stream().
                allMatch(Capitulo -> Capitulo.fueVistoCompletaX(usuario));*/