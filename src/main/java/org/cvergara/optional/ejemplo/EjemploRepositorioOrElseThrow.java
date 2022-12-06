package org.cvergara.optional.ejemplo;

import org.cvergara.optional.ejemplo.models.Computador;
import org.cvergara.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.cvergara.optional.ejemplo.repositorio.Repositorio;
/*or else siempre crea el objeto por defecto , orelseget solo lo crea si el valor buscado no existe */
public class EjemploRepositorioOrElse {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio() ;
        Computador defecto = new Computador("Hp Omen" , "LA001") ;

        Computador pc = repositorio.filtrar("Asus").orElse(defecto) ;
        System.out.println(pc);
        
        pc = repositorio.filtrar("Mac").orElseGet(() -> defecto);
        System.out.println("pc = " + pc);




    }
}
