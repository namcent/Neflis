import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


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

        Serie breakingBad = new Serie( "breaking bad", (List<Temporada>)temporadas, "drama");
        Pelicula titanic= new Pelicula(240, "actor4", "romance");

        List<Contenido>contenidoVisto=new ArrayList<>(  );
        contenidoVisto.add(breakingBad);
        contenidoVisto.add(titanic);

        breakingBad.setGenero("drama");
        titanic.setGenero( "romance" );

        List<String>generosqueVio=new ArrayList<>();
        generosqueVio.add(breakingBad.genero());
        generosqueVio.add(titanic.genero());


        /** ejercicio 1**/

        System.out.println(cap1A.fueVistoCompletaX( yaz )+ " vio cont completo capitulo");
        System.out.println( yaz.vioContenidoCompleto( titanic ) + " vio cont completo de titanic" );
        System.out.println(yaz.vioContenidoCompleto( breakingBad )+ " vio cont completo de bb");

        /** ejercicio 2**/
        breakingBad.duracion();
        titanic.duracion();
        System.out.println( temporadaA.duracion()+" duracion una temporada" );
        System.out.println(breakingBad.duracion()+ " duracion de cap Breaking bad");
        System.out.println(titanic.duracion()+" duracion titanic");

        /** ejercicio 3**/
        breakingBad.ultimoCapituloSerie();
        System.out.println( breakingBad.ultimoCapituloSerie().numeroCap+ " Ultimo capitulo de la serie" );

        /** ejercicio 4**/
        System.out.println(yaz.generosqueVio()+ " generos que vio");
    }}
