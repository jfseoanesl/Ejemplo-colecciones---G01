package modelo;

public class Empleado implements Comparable<Empleado> {

    private String nombre, apellido, area;
    private int id;
    private double salario;

    public Empleado() {
    }

    public Empleado(int id) {
        this.id = id;
    }

    public Empleado(String nombre, String apellido, String area, int id, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.area = area;
        this.id = id;
        this.salario = salario;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", area=" + area + ", id=" + id + ", salario=" + salario + '}';
    }

    @Override
    public int compareTo(Empleado t) {
        if (this.id > t.id) {
            return 1;
        } else if (this.id < t.id) {
            return -1;
        } else {
            return 0;
        }

    }

}
