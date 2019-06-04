

import java.util.List;
import java.util.stream.Collectors;


public class Temporada implements Contenido {
    private List<Capitulo> capitulo;
    Integer numTemp;
    private Integer duracion;

    public Temporada(Integer numTemp, List<Capitulo>capitulo){
        this.capitulo=capitulo;
        this.numTemp=numTemp;
    }

    public String genero;


    public Boolean fueVistoCompletaX(Usuario usuario) {
        return this.capitulo.stream().
                allMatch( capitulo -> capitulo.fueVistoCompletaX( usuario ) );
    }
    public String genero() {
        return genero;
    }

    /**obtengo duracion de cada capitulo sumado**/
    public Integer duracion(){
        return capitulo.stream().map( c -> c.duracion() ).reduce( 0, Integer::sum );

    }
    /**Obtengo ultimo cap de la serie**/
    public Capitulo ultimoCapituloSerie() {
        return capitulo.get(capitulo.size()-1); }

}

