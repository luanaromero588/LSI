import java.util.*;

public class GestionEventos {
    public static void main(String[] args) {
        // Crear atletas del primer equipo
        Atleta unAtletaAdvanced = new Advanced( 1, "Juan" , 40.00 , 10);
        Atleta unAtletaScaled = new Scaled( 2, "Lisa" , 50.00 , 10); 
        Atleta unAtletaRx = new Rx(3, "Pedro", 50, 12);
        
        Equipo unEquipo = new Equipo("La Banda", "Nuñez", unAtletaRx);
        unEquipo.añadirAtleta(unAtletaAdvanced);
        unEquipo.añadirAtleta(unAtletaScaled);
        
        
        
        /*creo una lista de atletas
        ArrayList<Atleta> unaListaAtletas = new ArrayList<>();
        //añado los atletas creados
        unaListaAtletas.add(unAtletaAdvanced);
        unaListaAtletas.add(unAtletaScaled);
        unaListaAtletas.add(unAtletaRx);
        //Creo un equipo y le paso la lista
        */
        
        // Crear atletas del segundo equipo
        Atleta secondAtletaAdvanced = new Advanced( 4, "Juanita" , 20.00 , 10);
        Atleta secondAtletaScaled = new Scaled( 5, "Bart" , 10.00 , 10); 
        Atleta secondAtletaRx = new Rx(6, "Paola", 100, 8);
        
        Equipo secondEquipo = new Equipo(" La Banda ", " Nuñez ", secondAtletaRx);
        secondEquipo.añadirAtleta(secondAtletaAdvanced);
        secondEquipo.añadirAtleta(secondAtletaScaled);        
        /*creo una lista de atletas
        ArrayList<Atleta> secondListaAtletas = new ArrayList<>();
        //añado los atletas creados
        secondListaAtletas.add(secondAtletaAdvanced);
        secondListaAtletas.add(secondAtletaScaled);
        secondListaAtletas.add(secondAtletaRx);
        */ //Creo un equipo y le paso la lista
        
        
        //informe de un equipo
        System.out.println("\n***Informe de un equipo***\n");
        unEquipo.mostrar();
        secondEquipo.mostrar();
        
        /*creo lista de equipos
        ArrayList<Equipo> listaEquipos = new ArrayList<>();
        listaEquipos.add(unEquipo);
        listaEquipos.add(secondEquipo); */
        //creo el campeonato, añado la lista de equipos creada
        Campeonato unCampeonato = new Campeonato(" XV Torneo Nacional de Crossfit", unEquipo); 
        unCampeonato.agregarEquipo(secondEquipo);
        /* esto nuevo se puede implemetar asi?
         * Campeonato unCampeonato = new Campeonato(" XV Torneo Nacional de Crossfit",unEquipo); 
            unCampeonato.AgregarEquipo(secondEquipo);
         */
        //finalmente informo el ganador de campeonato
        unCampeonato.determinarGanador();
        
    }
}
