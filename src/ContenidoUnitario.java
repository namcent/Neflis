public abstract class ContenidoUnitario implements Contenido {
    private String genero;

    protected abstract Boolean generoMasVisto();

    String genero(Contenido contenidoVisto) {
        return genero;
    }


    String actores;
    Integer duracion;

    public ContenidoUnitario(String actores, Integer duracion) {
        this.actores = actores;
        this.duracion = duracion;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
}
