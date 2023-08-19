
package lab5p2_jesusrodriguez;

import java.util.ArrayList;


public class Equipo {
    private String Nombre;
    private int rating;
    private String pais;
    private ArrayList<Jugador> plantilla;

    public Equipo() {
    }

    public Equipo(String Nombre, String pais) {
        this.Nombre = Nombre;
        this.pais = pais;
    }
    
    
    
    

    public Equipo(String Nombre,  String pais, ArrayList<Jugador> plantilla) {
        this.Nombre = Nombre;
      
        this.pais = pais;
        this.plantilla = plantilla;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> plantilla) {
        this.plantilla = plantilla;
    }

    @Override
    public String toString() {
        return  Nombre;
    }

    
    
    
    
    
    
}
