

import java.util.List;
import java.util.stream.Collector;


public class Temporada implements Contenido {
    private List<Capitulo> capitulo;

    Integer numTemp;
    public Temporada(Integer numTemp, List<Capitulo> capitulo){
        this.capitulo=capitulo;
        this.numTemp=numTemp;
    }

    public String genero;

    private static Object apply(Capitulo Capitulo) {
        return Capitulo.getDuracionxCap();
    }

   // public Integer duracion(Contenido contenido){return capitulo.stream().map( Capitulo::getDuracionxCap()) ;}
    public Boolean fueVistoCompletaX(Usuario usuario) {
        return this.capitulo.stream().
                allMatch( Capitulo -> Capitulo.fueVistoCompletaX( usuario ) );
    }

    public String genero(Contenido contenido) {
        return genero;
    }

}

