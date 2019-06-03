import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] Args) {
        Usuario yaz = new Usuario();
        Usuario roma = new Usuario();
        Usuario nadia = new Usuario();
        Usuario natalia = new Usuario();
        Pelicula frozen = new Pelicula("Kristen Bell", 102);
        Serie theGoodPlace = new Serie(3,13,33);
        Temporada temporada1 = new Temporada();
        Temporada temporada2 = new Temporada();
        Capitulo capitulo1 = new Capitulo("kristen bell", 33);
        Capitulo capitulo2 = new Capitulo("kristen bell", 33);
        Capitulo capitulo3 = new Capitulo("kristen bell", 33);
        Capitulo capitulo4 = new Capitulo("kristen bell", 33);
        Capitulo capitulo5 = new Capitulo("kristen bell", 33);
        Capitulo capitulo6 = new Capitulo("kristen bell", 33);
        Actor kristenBell = new Actor();

        List<Capitulo> capitulos = new ArrayList<>();
        capitulos.add(capitulo1);
        capitulos.add(capitulo2);




        yaz.vioContenidoCompleto(frozen);
        yaz.vioContenidoCompleto(theGoodPlace);
        System.out.println("Yaz vio"+ yaz.getContenidoVisto());

        List<Serie> series= new ArrayList<>();
        series.add(new Serie(3,3,33));
        series.add(new Serie ());
        List<Temporada> temporadas= new ArrayList<>();
        temporadas.add(new Temporada());
        temporadas.add(new Temporada ());
        roma.setContenidoVisto();
    }}


