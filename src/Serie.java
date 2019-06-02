import java.util.List;

public class Serie implements Contenido{
    Temporada temporada;
    Capitulo capitulo;
    String nombreSerie;
    Integer numTemporada;
   /* Integer capxTemporada;
    String actoresSerie;
    String actoresInvitadoSerie;
    Integer minxCap;*/
    Integer estaCompleto;

    public Serie(/* String actoresSerie,String actoresInvitadoSerie,*/ Integer numTemporada,
                  Integer capxTemporada, Integer minxCap) {
        /*this.actoresSerie = actoresSerie;
        this.actoresInvitadoSerie = actoresInvitadoSerie;*/
        this.numTemporada = numTemporada;
       /* this.capxTemporada = capxTemporada;
        this.minxCap = minxCap;*/
    }
    private String genero;


    private List<Temporada> temporada1;

    public Boolean fueVistoCompletoPor(Usuario usuario) {
        return this.temporada1.stream().
                allMatch( T -> T.fueVistoCompletoPor( usuario ) );
    }


    public String genero(Contenido contenido) {
        return genero;
    }

    public Integer duracion(Contenido contenido) {
        return null;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;

    }

}