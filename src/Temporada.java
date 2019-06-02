

import java.util.List;


public class Temporada implements Contenido {
    private List<Capitulo> capitulo;

    Integer numTemp;
    private Integer duracion;

    public Temporada(Integer numTemp, List<Capitulo>capitulo){
        this.capitulo=capitulo;
        this.numTemp=numTemp;
    }

    public String genero;

    // public Integer duracion(Contenido contenido){return capitulo.stream().map( Capitulo::getDuracionxCap()) ;}
    public Boolean fueVistoCompletaX(Usuario usuario) {
        return this.capitulo.stream().
                allMatch( Capitulo -> Capitulo.fueVistoCompletaX( usuario ) );
    }
    public String genero(Contenido contenido) {
        return genero;
    }

    public Integer duracion(){
        return capitulo.stream().map( c -> c.duracion() ).reduce( 0, Integer::sum );

    }}

