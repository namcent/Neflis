import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Main {
    public static void main(String []Args) {

        Pelicula titanic = new Pelicula( "Titanic", 120, "Di Caprio" );
        Usuario yaz = new Usuario();


        //List<Contenido> series= new ArrayList();
        //series.add(new Serie("Breaking Bad",(List<Temporada>) new Temporada(1, (List<Capitulo>) new Capitulo(5,60))));

       // yaz.setContenidoVisto( );
        titanic.fueVistoCompletaX( yaz );


        System.out.println( titanic.fueVistoCompletaX( yaz ) );
    }}
