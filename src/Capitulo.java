public class Capitulo extends ContenidoUnitario {
    protected String genero;
    protected Integer duracion;
    protected String numeroCapitulo;
    protected String actores;


    public String genero(Contenido contenido){
        return genero;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }

    protected Boolean generoMasVisto() {
        return generoMasVisto(); }

    public Integer duracion (Contenido contenido){
        return this.duracion;
    }
    public void setDuracion(Integer minutos){
        duracion= duracion;
    }

    protected Capitulo (String numeroCapitulo, String actores, Integer duracion){
        this.duracion=duracion;
        this.actores=actores;
        this.numeroCapitulo= numeroCapitulo;
    }
    public Boolean fueVistoCompletoPor(Usuario usuario){
        return usuario.getContenidosVistos().contains( usuario);
    }


}
