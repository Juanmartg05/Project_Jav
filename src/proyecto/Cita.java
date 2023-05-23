
package proyecto;

import java.util.ArrayList;
import java.util.Scanner;


public class Cita {
    
    Scanner s = new Scanner (System.in);
    private String Date;
    private int Hour;
    private String Motive;
    private String Observations;
    private String Pet;
    
    private static ArrayList <Cita> Cita1 = new ArrayList<>();
    
    
    public Cita(String Date, int Hour, String Motive, String Observations, String Pet) {
        this.Date = Date;
        this.Hour = Hour;
        this.Motive = Motive;
        this.Observations = Observations;
        this.Pet = Pet;
    }

    public Cita() {
    }
    
    
    
    public void Add_cita(){          //Permite añadir una cita
        
        System.out.println("A continuacion ingrese los datos de la cita");
        
        System.out.println("Ingrese el dia de la cita (ejemplo: 23 de febrero de 2002)");
        String date = s.nextLine();

        System.out.println("Ingrese la hora de la cita en horario militar(ej: 13 -> para decir que es la 1pm )");
        int hour = s.nextInt();

        s.nextLine(); // Limpiar el buffer del scanner

        System.out.println("Ingrese el motivo de la cita");
        String motive = s.nextLine();

        String observations = null;

        System.out.println("Ingrese el nombre de la mascota");  //para poder unir tanto al cliente, como a la mascota y a la cita se usara el nombre de la mascota
        String pet = s.nextLine();
        
        
        Cita cita = new Cita(date,hour,motive,observations,pet);
        
        Cita1.add(cita);
        
    }
    
    public void Search_cita(){
        
        System.out.println("Digite el nombre de la mascota para buscar la cita");
        String name=s.nextLine();
        boolean encontrado= false;
        
        
         for (Cita cita : Cita1)
        {
            if (cita.getPet().equalsIgnoreCase(name)) 
            {
                encontrado = true;
                System.out.println("Cita encontrada:");
                System.out.println("Dia: " + cita.getDate());
                System.out.println("Hora: " + cita.getHour());
                System.out.println("Motivo: " + cita.getMotive());
                System.out.println("Observaciones: " + cita.getObservations());
                System.out.println("Mascota: " + cita.getPet());
                break;
            }
        }
        if(!encontrado){
            System.out.println("No se encontro ninguna cita con el nombre de esa mascota");
        }
        
    }
    
    public void Quit_cita(){         //Permite quitar una cita
        
        System.out.println("Digite el nombre de la mascota para quitar las citas");
        String pet=s.nextLine();
        boolean encontrado = false;
        
        Cita citadelete = new Cita();
        
        for (Cita cita: Cita1){
            
            if(cita.getPet().equalsIgnoreCase(pet)){
                encontrado=true;
                citadelete=cita;
            }
        }
        
        if(encontrado){
            Cita1.remove(citadelete);
            System.out.println("La cita se ha borrado");
        }
        else{
            System.out.println("No se encontro una mascota con ese nombre");
        }
        
        
        
    }
    
    public void Observation(){
        System.out.println("Por favor digite el nombre de la mascota para buscar la cita");
        Pet=s.nextLine();
        
        boolean encontrado = false;

        for (int i = 0; i < Cita1.size(); i++) { // se utilizo un for normal por que el for each no se puede utilizar para ir iterando
            Cita cita = Cita1.get(i);
            if (cita.getPet().equalsIgnoreCase(Pet)) {
                
                encontrado = true;


                System.out.println("Por favor ingrese la observacion");
                String observation = s.nextLine();

            // Modificar los atributos de la mascota

                cita.setObservations(observation);

                System.out.println("Se agrego la observacion de su cita");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ninguna mascota con esa cita");
        }
    }
    
    
    
    
    
    
    
    
    
    //Getters y setters
    
    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
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
