public class Pelicula implements Contenido{
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

    public Boolean fueVistoCompletoPor(Usuario usuario) {
        return true;

    }
    public Pelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }
}

