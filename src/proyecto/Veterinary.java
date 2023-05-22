
package proyecto;


public class Veterinary extends Veterinaria {
    
    //atributos
    private String email;
    private String identification;
    private Pet pet; // permite almacenar una instancia de la clase Pet y utilizarla en los métodos de la clase Veterinaria.
    
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
    
    
    
    
    
    //metodos
    
    public void Pets(){
        pet = new Pet();
        System.out.println("""
                           Has ingresado al apartado de mascotas, lo que puedes hacer como veterinario es: 
                           1.Ingresar Mascotas
                           2.Buscar Mascotas
                           3.Quitar Mascotas
                           4.Cambiar las caracteristicas de tu mascota""");
        int opc=s.nextInt();
        
        switch(opc){
            
            case 1:
                pet.Add_pet();
            break;
            
            case 2:
                pet.Search_pet();
            break;
            
            case 3:
                pet.Quit_pet();
            break;
            
            case 4:
                pet.Change_pet();
            break;
        }
        
        
        
    }
    
    
    public void Customer(){
        
        
        
        
        
        
        
    }
    
    public void Citas(){
        
        
        
        
        
        
        
        
        
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
