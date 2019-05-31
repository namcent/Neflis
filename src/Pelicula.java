public class Pelicula implements Contenido{
    String nombrePeli;
    Integer duracionPeli;
    String actoresPeli;
    String genero;

    public Pelicula(String nombrePeli, Integer duracionPeli, String actoresPeli) {
        this.nombrePeli = nombrePeli;
        this.duracionPeli = duracionPeli;
        this.actoresPeli = actoresPeli;}

    public Boolean fueVistoCompletaX(Usuario usuario) {return true;}

    public void setGenero(String genero) {
        this.genero = genero;}

    public String genero(Contenido contenido) {
        return genero;
    }
    public Integer duracion(Contenido contenido) {
        return duracionPeli;
    }

    }


