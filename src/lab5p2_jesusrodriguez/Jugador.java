
package lab5p2_jesusrodriguez;


public class Jugador {
    private String Nombre;
    private int edad;
    private String Nacionalidad;
    private String pie;
    private int rating;
    private Equipo equipo;

    public Jugador(String Nombre, int edad, String Nacionalidad, String pie) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.Nacionalidad = Nacionalidad;
        this.pie = pie;
    }
    
    
    
    
    

    public Jugador(String Nombre, int edad, String Nacionalidad, String pie, int rating, Equipo equipo) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.Nacionalidad = Nacionalidad;
        this.pie = pie;
        this.rating = rating;
        this.equipo = equipo;
    }

    public Jugador() {
    }

    
    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getPie() {
        return pie;
    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + ", edad=" + edad + ", Nacionalidad=" + Nacionalidad + ", pie=" + pie + ", rating=" + rating + ", equipo=" + equipo ;
    }
    
    
    
    
    
}
