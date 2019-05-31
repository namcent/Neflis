import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main( String []Args){
        Usuario roma=new Usuario();
        Pelicula rocky = new Pelicula("rocky");
        roma.vioContenidoCompleto(rocky);

        List<Serie> series= new ArrayList<>();
        series.add(new Serie("Breaking bad", 5));
        series.add(new Serie ("Vis a Vis", 4));
        List<Temporada> temporadas= new ArrayList<>();
        temporadas.add(new Temporada(10, 1, 45));
        temporadas.add(new Temporada (10, 2, 50));
    roma.setContenidosVistos();
    }}
