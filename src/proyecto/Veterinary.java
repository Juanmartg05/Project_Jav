
package proyecto;


public class Veterinary extends Veterinaria {
    
    //atributos
    private String email;
    private String identification;
    private Pet pet; // permite almacenar una instancia de la clase Pet y utilizarla en los métodos de la clase Veterinaria.
    private Customer customer;
    private Cita cita;
    
    //constructores

    public Veterinary(String email, String identification, String Name, String Address, int Phone) {
        super(Name, Address, Phone);
        this.email = email;
        this.identification = identification;
    }
    
    public Veterinary(Pet pet) {
        this.pet = pet;
    }

    public Veterinary() {
    }

    public Veterinary(Customer customer) {
        this.customer = customer;
    }

    public Veterinary(Cita cita) {
        this.cita = cita;
    }
    
    
    
    
    
    //metodos
    
    public void Pets(){
        pet = new Pet();
        System.out.println("""
                           Has ingresado al apartado de mascotas, lo que puedes hacer como veterinario es: 
                           1.Ingresar Mascotas
                           2.Buscar Mascotas
                           3.Quitar Mascotas
                           4.Cambiar las caracteristicas de tu mascota
                           0.Para volver al menu principal""");
        int opc=s.nextInt();
        
        switch(opc){
            
            case 1 -> pet.Add_pet();
            
            case 2 -> pet.Search_pet();
            
            case 3 -> pet.Quit_pet();
            
            case 4 -> pet.Change_pet();
        }
        
        
        
    }
    
    
    public void Customer(){
        customer = new Customer();
        System.out.println("""
                           Has ingresado al apartado de usuario, como veterinario puedes:
                           1.Ingresar usuario
                           2.Buscar usuario
                           3.Quitar usuario
                           4.Cambiar las caracteristicas de tu usuario
                           0.Para volver al menu principal
                           """);
        int opc=s.nextInt();
        switch(opc){
            
            case 1 -> customer.Add_custom();
            
            case 2 -> customer.Search_custom();
            
            case 3 -> customer.Quit_custom();
            
            case 4 -> customer.Change_custom();
        }
    }
    
    public void Citas(){
        
        cita = new Cita();
        System.out.println("""
                           Has ingresado al apartado de citas, como veterinario puedes:
                           1.Ingresar cita
                           2.Buscar cita
                           3.Quitar cita
                           4. Agregar la observacion a la cita(solo si ya termino la cita).
                           0.Para volver al menu principal
                           """);
        int opc=s.nextInt();
        switch(opc){
            
            case 1 -> cita.Add_cita();
            
            case 2 -> cita.Search_cita();
            
            case 3 -> cita.Quit_cita();
            
            case 4 -> cita.Observation();

        }
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //getters y setters

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the identification
     */
    public String getIdentification() {
        return identification;
    }

    /**
     * @param identification the identification to set
     */
    public void setIdentification(String identification) {
        this.identification = identification;
    }
}
