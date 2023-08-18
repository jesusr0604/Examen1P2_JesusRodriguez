
package lab5p2_jesusrodriguez;


public class Estadio {
    private String Nombre;
    private int capacidad;
    private String ciudad;
    private Equipo equipo;

    public Estadio() {
    }

    public Estadio(String Nombre, int capacidad, String ciudad) {
        this.Nombre = Nombre;
        this.capacidad = capacidad;
        this.ciudad = ciudad;
    }

    
    
    
    public Estadio(String Nombre, int capacidad, String ciudad, Equipo equipo) {
        this.Nombre = Nombre;
        this.capacidad = capacidad;
        this.ciudad = ciudad;
        this.equipo = equipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + ", capacidad=" + capacidad + ", ciudad=" + ciudad + ", equipo=" + equipo ;
    }

    
    
    
    
    
}
