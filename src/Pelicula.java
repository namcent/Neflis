public class Pelicula extends ContenidoUnitario{
    String nombrePelicula;
    Integer duracionDePelicula;
    String genero;


    public String genero(Contenido contenido) { return genero;}
    public Integer duracion( Contenido contenido) {return duracionDePelicula;}


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Pelicula(String nombrePelicula, Integer duracionDePelicula) {
        this.duracionDePelicula= duracionDePelicula;
        this.nombrePelicula = nombrePelicula;
    }
}

