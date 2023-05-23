
package proyecto;

import java.util.ArrayList;
import java.util.Scanner;


public class Customer extends Veterinaria {
    
    Scanner s = new Scanner(System.in);
    
    
    //atributos
    
    private static ArrayList <Customer> Customer1 = new ArrayList<>();
    private String Email;
    private String Pet;

    public Customer(String Email, String Pet, String Name, String Address, int Phone) {
        super(Name, Address, Phone);
        this.Email = Email;
        this.Pet = Pet;
    }
    
    public Customer() {
    }
    
    
    
    public void Add_custom(){          //Permite añadir un cliente
        System.out.println("A continuacion ingresa los datos del cliente");
        
        System.out.println("Ingrese el nombre del cliente:");
        String name = s.nextLine();

        System.out.println("Ingrese la direccion del cliente");
        String address = s.nextLine();

        System.out.println("Ingrese el telefono del cliente");
        int phone = s.nextInt();
        
        s.nextLine();
        
        System.out.println("Ingrese el email del cliente:");
        String email = s.nextLine();

        System.out.println("Ingrese el nombre de su mascota");
        String pet = s.nextLine();
        
        
        Customer customer = new Customer(email,pet,name,address,phone);
        
        Customer1.add(customer);
    }
    
    public void Search_custom(){       //Permite buscar un cliente
        System.out.println("Digite el nombre del usuario que desea buscar");
        String name=s.nextLine();
        boolean encontrado= false;
        
        
         for (Customer custom : Customer1) 
        {
            if (custom.getName().equalsIgnoreCase(name)) 
            {
                encontrado = true;
                System.out.println("Usuario encontrado:");
                System.out.println("Nombre: " + custom.getName());
                System.out.println("Direccion: " + custom.getAddress());
                System.out.println("Telefono: " + custom.getPhone());
                System.out.println("Email: " + custom.getEmail());
                System.out.println("Mascota: " + custom.getPet());
                break;
            }
        }
        if(!encontrado){
            System.out.println("No se encontro ningun usuario con ese codigo");
        }
    }
    
    public void Quit_custom(){         //Permite quitar un cliente
        System.out.println("Digite el nombre del cliente que desea quitar");
        String name=s.nextLine();
        boolean encontrado = false;
        
        Customer customdelete = new Customer();
        
        for (Customer customer: Customer1){
            
            if(customer.getName().equalsIgnoreCase(name)){
                encontrado=true;
                customdelete=customer;
            }
        }
        
        if(encontrado){
            Customer1.remove(customdelete);
            System.out.println("El cliente con ese nombre ha sido borrado");
        }
        else{
            System.out.println("No se encontro un clinete con ese nombre");
        }
    }
    
    public void Change_custom(){       //Permite Cambiar un cliente
        
        System.out.println("Digite el nombre del usuario a cambiar");
        String name = s.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < Customer1.size(); i++) { // se utilizo un for normal por que el for each no se puede utilizar para ir iterando
            Customer customer = Customer1.get(i);
            if (customer.getName().equalsIgnoreCase(name)) {
                
                encontrado = true;
            
                System.out.println("Ingrese el nombre del cliente:");
                String Name = s.nextLine();

                System.out.println("Ingrese la direccion del cliente");
                String address = s.nextLine();

                System.out.println("Ingrese el telefono del cliente");
                int phone = s.nextInt();
        
                s.nextLine();
            
                System.out.println("Ingrese el email del cliente:");
                String email = s.nextLine();

                System.out.println("Ingrese el nombre de su mascota");
                String pet = s.nextLine();

            // Modificar los atributos de la mascota
                customer.setName(Name);
                customer.setAddress(address);
                customer.setPhone(phone);
                customer.setEmail(email);
                customer.setPet(pet);

                System.out.println("Usuario modificado");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningun usuario con ese nombre");
        }
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
