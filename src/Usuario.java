import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Usuario {
    private List<Contenido> contenidoVisto=new ArrayList<>(  );
    private List<String> generosqueVio =new ArrayList<>(  );


    /**Aca se le dice al usuario que contenido vio completo**/

    public Boolean vioContenidoCompleto(Contenido contenido) {
        return this.contenidoVisto.contains( contenido );
    }
    public List<Contenido> getContenido() {
        return contenidoVisto;
    }
    public void setContenido(List<Contenido> contenido) {
        this.contenidoVisto = contenido;
    }

    public List<String> generosqueVio() {
       return contenidoVisto.stream().map( contenido -> contenido.genero())
     .distinct().collect( Collectors.toList());}


    public Integer minVistosxGenero(String genero){return
                contenidoVisto.stream().filter( contenido->contenido.genero()
                        .equals( genero ) ).mapToInt( contenido->contenido.duracion() )
                        .sum();}




           /* contenidoVisto.stream()
            .map( contenidoVisto->contenidoVisto.genero())
            .distinct().collect( Collectors.toList() );}*/

    }

