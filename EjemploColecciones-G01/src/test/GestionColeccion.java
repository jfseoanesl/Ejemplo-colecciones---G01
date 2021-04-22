package test;

import java.util.*;
import modelo.*;

public class GestionColeccion {

    public static void addEmpleado(List<Empleado> lista, Empleado e) {

        lista.add(e);

    }

    public static void buscarElemento(List<Empleado> lista, int id) {
        System.out.println("Busqueda de elementos: ");
        System.out.println("Id: " + id);
        Empleado encontrado = null;
        for (Empleado e : lista) {
            if (e.getId() == id) {
                encontrado = e;
                break;
            }
        }
        if (encontrado == null) {
            System.out.println("Empleado No registrado");
        } else {
            System.out.println("Empleado encontrado: ");
            System.out.println(encontrado);
        }
    }

    public static void eliminarElemento(List<Empleado> lista, int id) {
        System.out.println("Eliminacion de elementos: ");
        System.out.println("Id: " + id);
        Empleado eliminado = null;

        Iterator<Empleado> it = lista.iterator();
        while (it.hasNext()) {
            Empleado e = it.next();
            if (e.getId() == id) {
                it.remove();
                eliminado = e;
                break;
            }
        }
        if (eliminado == null) {
            System.out.println("Empleado No registrado");
        } else {
            System.out.println("Empleado eliminado: ");
            System.out.println(eliminado);
        }

    }

    public static void OrdenarLista(List<Empleado> lista, Comparator orden){
        List<Empleado> listaOrdenada = new ArrayList(lista);
        if(orden==null){
            Collections.sort(listaOrdenada);
        }
        else{
            Collections.sort(listaOrdenada, orden);
        }
        imprimirColeccion(listaOrdenada);;
    }
    public static void OrdenarLista(List<Empleado> lista){
        
        OrdenarLista(lista, null);
        
    }
    
    public static void imprimirColeccion(List<Empleado> lista) {
        System.out.println("Lista de empleados: " + lista.size() + " registrados");
        System.out.println("----------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %s%n", "Codigo", "Apellido",
                "Nombre", "Area", "Salario");
        System.out.println("----------------------------------");
        for (Empleado e : lista) {
            System.out.printf("%-10s %-10s %-10s %-10s %.2f%n",
                    "" + e.getId(),
                    e.getApellido(),
                    e.getNombre(),
                    e.getArea(),
                    e.getSalario());
        }
        System.out.println("----------------------------------\n");
    }
}
