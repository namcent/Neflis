public class Capitulo implements Contenido{

    public Integer duracion;
    public String genero;
    Integer numCap;
    Integer duracionxCap;

    public Capitulo(Integer numCap, Integer duracionxCap){
        this.numCap=numCap;
        this.duracionxCap=duracionxCap;
    }

    public Boolean fueVistoCompletaX(Usuario usuario){return true;}



    public String genero(Contenido contenido) {
        return genero;
    }
    public Integer getDuracionxCap(){return duracionxCap;}
    public Integer duracion(Contenido contenido){return duracionxCap;}
}

