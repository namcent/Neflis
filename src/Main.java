import java.util.ArrayList;
import java.util.List;


public class Main {


    public static void main(String []Args) {

        Usuario yaz = new Usuario();

        Capitulo cap1A = new Capitulo( "cap1A", "actor1", 60 );
        Capitulo cap1B = new Capitulo( "cap1B", "actor2", 58 );
        Capitulo cap2B = new Capitulo( "cap2B", "actor3", 57 );

        List<Capitulo> capA = new ArrayList<>();
        capA.add( cap1A );
        List<Capitulo> capB = new ArrayList<>();
        capB.add( cap1B );
        capB.add( cap2B );

        Temporada temporadaA = new Temporada( 1, (List<Capitulo>) capA);
        Temporada temporadaB = new Temporada( 2, (List<Capitulo>) capB );


        List<Temporada> temporadas = new ArrayList<>();
        temporadas.add( temporadaA );
        temporadas.add( temporadaB );

        Serie breakingBad = new Serie( "breaking bad", (List<Temporada>)temporadas);
        Pelicula titanic= new Pelicula(240, "actor4");

        List<Contenido>contenidoVisto=new ArrayList<>(  );
        contenidoVisto.add(breakingBad);
        contenidoVisto.add(titanic);
        //breakingBad.fueVistoCompletaX( yaz );
        yaz.setContenidoVisto(contenidoVisto);
        yaz.getContenidoVisto();
        //yaz.vioContenidoCompleto( breakingBad );

        /** ejercicio 2**/
        breakingBad.duracion();
        titanic.duracion();

        //System.out.println(yaz.vioContenidoCompleto( breakingBad )+ " vio cont completo de bb");
        System.out.println(breakingBad.duracion()+ " duracion de cap Breaking bad");
        System.out.println(titanic.duracion()+" duracion titanic");

        breakingBad.ultimoCapituloSerie();
        System.out.println( breakingBad.ultimoCapituloSerie().numeroCap+ " Ultimo capitulo de la serie" );
    }}
