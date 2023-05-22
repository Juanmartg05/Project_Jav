
package proyecto;


public class Cita {
    
    private int Date;
    private int Hour;
    private String Motive;
    private String Veterinario;
    private String Observations;
    private String Pet;

    public Cita(int Date, int Hour, String Motive, String Veterinario, String Observations, String Pet) {
        this.Date = Date;
        this.Hour = Hour;
        this.Motive = Motive;
        this.Veterinario = Veterinario;
        this.Observations = Observations;
        this.Pet = Pet;
    }

    
    public void Add_cita(){          //Permite añadir una cita
        
    }
    
    public void Quit_cita(){         //Permite quitar una cita
        
    }
    
    
    
    
    
    
    
    
    
    
    //Getters y setters
    
    /**
     * @return the Date
     */
    public int getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(int Date) {
        this.Date = Date;
    }

    /**
     * @return the Hour
     */
    public int getHour() {
        return Hour;
    }

    /**
     * @param Hour the Hour to set
     */
    public void setHour(int Hour) {
        this.Hour = Hour;
    }

    /**
     * @return the Motive
     */
    public String getMotive() {
        return Motive;
    }

    /**
     * @param Motive the Motive to set
     */
    public void setMotive(String Motive) {
        this.Motive = Motive;
    }

    /**
     * @return the Veterinario
     */
    public String getVeterinario() {
        return Veterinario;
    }

    /**
     * @param Veterinario the Veterinario to set
     */
    public void setVeterinario(String Veterinario) {
        this.Veterinario = Veterinario;
    }

    /**
     * @return the Observations
     */
    public String getObservations() {
        return Observations;
    }

    /**
     * @param Observations the Observations to set
     */
    public void setObservations(String Observations) {
        this.Observations = Observations;
    }

    /**
     * @return the Pet
     */
    public String getPet() {
        return Pet;
    }

    /**
     * @param Pet the Pet to set
     */
    public void setPet(String Pet) {
        this.Pet = Pet;
    }
    
    
    
    
}
