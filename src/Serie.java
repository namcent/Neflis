import java.util.List;

public class Serie implements Contenido{
    String nombreSerie;
    Integer numTemporada;
    Integer capxTemporada;
    String[] actoresSerie;
    String[] actoresInvitadoSerie;
    Integer minxCap;
    Integer estaCompleto;

    public Series(String nombreSerie, String[] actoresSerie,
                  String[] actoresInvitadoSerie, Integer numTemporada,
                  Integer capxTemporada, Integer minxCap) {
        this.nombreSerie = nombreSerie;
        this.actoresSerie = actoresSerie;
        this.actoresInvitadoSerie = actoresInvitadoSerie;
        this.numTemporada = numTemporada;
        this.capxTemporada = capxTemporada;
        this.minxCap = minxCap;
    }
    private String genero;


    private List<Temporada> temporada;

    public Boolean fueVistoCompletaX(Usuario usuario) {
        return this.temporada.stream().
                allMatch( T -> T.fueVistoCompletaX( usuario ) );
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;

    }
}
