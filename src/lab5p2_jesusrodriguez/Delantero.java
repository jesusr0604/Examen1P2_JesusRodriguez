/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5p2_jesusrodriguez;
import java.util.Random;

public  class Delantero extends Jugador{
 static Random ran = new Random();
    public Delantero(String Nombre, int edad, String Nacionalidad, String pie, Equipo equipo,String Pos) {
        super(Nombre, edad, Nacionalidad, pie, equipo,Pos);
    }
    
    
   public void setcal(){
        this.agarre =  (ran.nextInt(5)+1)*13;
        this.lanz =  (ran.nextInt(5)+1)*13;
        this.fisico =  (ran.nextInt(5)+1)*13;
        this.ritmo = (ran.nextInt(12)+1)*12;
        this.entrada =  (ran.nextInt(5)+1)*13;
        this.vision = (ran.nextInt(5)+1)*13;
        this.Pass =  (ran.nextInt(5)+1)*13;
        this.regat = (ran.nextInt(12)+1)*12;
        this.shoot = (ran.nextInt(12)+1)*12;
        this.rating=(fisico+ritmo+entrada+vision+Pass+regat+shoot+rating)/7;
    }
}
