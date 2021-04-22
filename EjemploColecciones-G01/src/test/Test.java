package test;

import java.util.*;
import modelo.*;

public class Test {
    public static void main(String[] args) {
        
        // Creacion de la coleccion
        List<Empleado> listaEmpleado = new ArrayList();
        
        Empleado jairo = new Empleado("Jairo", "Seoanes", "Sistemas", 2, 500);
        Empleado alvarez = new Empleado("Mario", "Alvarez", "Admon", 3, 1500);
        Empleado guerra = new Empleado("Javier", "Guerra", "Direccion", 1, 2000);
        
        // adiciona elementos a la coleccion
        GestionColeccion.addEmpleado(listaEmpleado, jairo);
        GestionColeccion.addEmpleado(listaEmpleado, alvarez);
        GestionColeccion.addEmpleado(listaEmpleado, guerra);
        
        //Imprime la coleccion
        GestionColeccion.imprimirColeccion(listaEmpleado);
        
        //ordena la coleccion por codigo
        GestionColeccion.OrdenarLista(listaEmpleado);
        
        //ordena la coleccion por Apellido
        GestionColeccion.OrdenarLista(listaEmpleado, new OrdenPorApellido());
        
        //ordena la coleccion por salario
        GestionColeccion.OrdenarLista(listaEmpleado, new OrdenPorSueldo());
        
        //buscar un elemento por id
        GestionColeccion.buscarElemento(listaEmpleado, 2);
        
        // eliminar elemento
        GestionColeccion.eliminarElemento(listaEmpleado, 2);
        GestionColeccion.imprimirColeccion(listaEmpleado);
        
    }
}
