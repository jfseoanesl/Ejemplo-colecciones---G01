package modelo;

import java.util.Comparator;

public class OrdenPorSueldo implements Comparator<Empleado> {

    @Override
    public int compare(Empleado t, Empleado t1) {
        if(t.getSalario()>t1.getSalario()){ return 1;}
        else if(t.getSalario()<t1.getSalario()){ return -1;}
        else return 0;
    }
    
}
