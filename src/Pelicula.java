public class Pelicula extends ContenidoUnitario{
    Integer duracion;
    String genero;
    String actores;


    protected Pelicula(Integer duracion, String actores, String genero){
        this.duracion=duracion;
        this.actores=actores;
        this.genero=genero;
    }

    public void setGenero(String genero){
        this.genero=genero;
    }
    public String genero(Contenido contenido){
        return genero;
    }

    public void setDuracion(Integer minutos){
        duracion=duracion;
    }
    public Integer duracion(){
        return duracion;
    }
    public Boolean fueVistoCompletoPor(Usuario usuario){
        return usuario.getContenidosVistos().contains(usuario);
    }


}

