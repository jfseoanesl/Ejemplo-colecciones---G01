package modelo;

import java.util.Comparator;

public class OrdenPorApellido implements Comparator<Empleado> {

    @Override
    public int compare(Empleado t, Empleado t1) {
        return t.getApellido().compareTo(t1.getApellido());
    }
    
}
