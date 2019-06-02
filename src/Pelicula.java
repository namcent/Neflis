public class Pelicula extends ContenidoUnitario {

    public Pelicula(String actores, Integer duracion) {
        super(actores, duracion);
    }

    @Override
    public String genero(Contenido contenido) {
        return null;
    }

    @Override
    public Boolean fueVistoCompletoPor(Usuario usuario) {
        return null;
    }


    @Override
    protected Boolean generoMasVisto() {
        return null;
    }
}

/*public class Pelicula implements Contenido{
    String nombrePelicula;
    Integer minPelicula;
    String genero;

    public String genero(Contenido contenido) { return genero;}

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public Pelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }
}*/

