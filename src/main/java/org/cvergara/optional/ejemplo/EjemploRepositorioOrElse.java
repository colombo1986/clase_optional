package org.cvergara.optional.ejemplo;

import org.cvergara.optional.ejemplo.models.Computador;
import org.cvergara.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.cvergara.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio() ;
        repositorio.filtrar("asus").ifPresentOrElse(System.out::println ,
                () -> System.out.println("No se encontro el objeto")) ;

        //Optional<Computador> pc = repositorio.filtrar("Rog") ;
        /*if(pc.isPresent()){
            System.out.println(pc.get().getNombre());
        }else{
            System.out.println("no se encontro");
        }
         */


    }
}
