
package lab5p2_jesusrodriguez;

import java.util.Random;



public class Portero extends Jugador {
static Random ran = new Random();
    public Portero(String Nombre, int edad, String Nacionalidad, String pie, Equipo equipo, String Pos) {
        super(Nombre, edad, Nacionalidad, pie, equipo, Pos);
    }
    
     
    public void setcal(){
        this.agarre = (ran.nextInt(12)+1)*12;
        this.lanz = (ran.nextInt(12)+1)*12;;
        this.fisico = (ran.nextInt(5)+1)*13;
        this.ritmo = (ran.nextInt(5)+1)*13;
        this.entrada = (ran.nextInt(5)+1)*13;
        this.vision = (ran.nextInt(5)+1)*13;
        this.Pass = (ran.nextInt(12)+1)*12;
        this.regat = (ran.nextInt(5)+1)*13;
        this.shoot = (ran.nextInt(5)+1)*13;
        this.rating=(agarre+lanz+Pass)/3;
    }
    
    
    
    
}
