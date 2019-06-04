public class Capitulo extends ContenidoUnitario{
    protected Integer duracion;
    protected String genero;
    protected String numeroCap;

    protected Capitulo (String numeroCap, String actores, Integer duracion) {
        this.actores=actores;
        this.duracion=duracion;
        this.numeroCap=numeroCap;}


    public Boolean fueVistoCompletaX(Usuario usuario){
        return usuario.getContenido().contains( usuario );}


    public void setGenero(String genero) {
        this.genero = genero;}
    public String genero() {
     return genero;}

     /**tengo duracion de un capitulo**/
    public void setDuracion(Integer minutos) {
        duracion = duracion;
    }
    public Integer duracion() {
        return this.duracion;
    }
}

    //protected Boolean generoMasVisto(){return generoMasVisto();}}



