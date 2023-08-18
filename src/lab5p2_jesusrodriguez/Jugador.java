
package lab5p2_jesusrodriguez;


public class Jugador {
    private String Nombre;
    private int edad;
    private String Nacionalidad;
    private String pie;
    private String pos;
    private int rating;
    private Equipo equipo;
     private int agarre;
      private int lanz;
       private int fisico;
        private int ritmo;
         private int entrada;
         private int vision;
          private int Pass;
           private int regat;
            private int shoot;
          
    public Jugador(String Nombre, int edad, String Nacionalidad, String pie, Equipo equipo, String pos) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.Nacionalidad = Nacionalidad;
        this.pie = pie;
        this.pos=pos;
        this.rating = 0;
        this.equipo = equipo;
        this.agarre = 0;
        this.lanz = 0;
        this.fisico = 0;
        this.ritmo = 0;
        this.entrada = 0;
        this.vision = 0;
        this.Pass = 0;
        this.regat = 0;
        this.shoot = 0;
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

    private int getRating() {
        return rating;
    }

    private void setRating(int rating) {
        this.rating = rating;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getAgarre() {
        return agarre;
    }

    public void setAgarre(int agarre) {
        this.agarre = agarre;
    }

    public int getLanz() {
        return lanz;
    }

    public void setLanz(int lanz) {
        this.lanz = lanz;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        this.ritmo = ritmo;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public int getPass() {
        return Pass;
    }

    public void setPass(int Pass) {
        this.Pass = Pass;
    }

    public int getRegat() {
        return regat;
    }

    public void setRegat(int regat) {
        this.regat = regat;
    }

    public int getShoot() {
        return shoot;
    }

    public void setShoot(int shoot) {
        this.shoot = shoot;
    }
    
    
    
    

    @Override
    public String toString() {
        return "Nombre=" + Nombre + ", edad=" + edad  ;
    }
    
    
    
    
    
}
