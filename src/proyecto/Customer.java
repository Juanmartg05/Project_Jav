
package proyecto;


public class Customer extends Veterinaria {
    
    private String Email;
    private String Pet;
    
    
    public Customer(String Email, String Pet, String Name, String Address, int Phone) {
        super(Name, Address, Phone);
        this.Email = Email;
        this.Pet = Pet;
    }

    public void Add_custom(){          //Permite añadir un cliente
        
    }
    
    public void Quit_custom(){         //Permite quitar un cliente
        
    }
    
    public void Change_custom(){       //Permite Cambiar un cliente
        
    }
    
    public void Search_custom(){       //Permite buscar un cliente
        
    }
    
    
    
    
    
    //getters y setters
    public String getEmail() {
        return Email;
    }


    public void setEmail(String Email) {
        this.Email = Email;
    }


    public String getPet() {
        return Pet;
    }


    public void setPet(String Pet) {
        this.Pet = Pet;
    }
    
    
    
}
