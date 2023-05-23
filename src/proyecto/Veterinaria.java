
package proyecto;

import java.util.Scanner;

public class Veterinaria {
    
    Scanner s = new Scanner (System.in);
    

    //atributos
    private String Name;
    private String Address;
    private int Phone;
    private Veterinary veterinary;
    private Customer customer;
    private Cita cita;

    
    
    
    
    
    

    //Constructores
    public Veterinaria() {
    }

    public Veterinaria(String Name) {
        this.Name = Name;
    }


    public Veterinaria(String Name, String Address, int Phone) {
        this.Name = Name;
        this.Address = Address;
        this.Phone = Phone;
    }

    public Veterinaria(Customer customer) {
        this.customer = customer;
    }

    public Veterinaria(Cita cita) {
        this.cita = cita;
    }
    
    
    
    
    
    
    
    

    //Metodos
    
    public void Sign_customer(){                        //Ingresa como cliente, solo permite ver estado la mascota correspondiente al cliente
        customer = new Customer();
        cita = new Cita();
        System.out.println("Has ingresado como cliente");
        System.out.println("""
                           1.Ver mascota
                           2.Ver proxima cita o observacion de una cita
                           0.Si desea vovler al menu principal""");
        int opc=s.nextInt();
        switch(opc){
            case 1 -> {
                System.out.println("Has ingresado en la primera opcion para ver tu mascota");
                customer.See_mascot();
            }
            
            case 2 -> {
                System.out.println("Has ingresado para ver la cita de tu mascota");
                cita.See_cita();
            }
        }
        
    }
    public void Sign_veterinary(){
        veterinary = new Veterinary();
        System.out.println("Has ingresado como veterinario");       //Ingresa como veterinario, podra ver la informacion del cliente y de la mascota.
        System.out.println("Seleccione lo que desea hacer a continuacion");
        System.out.println("1. Ver mascotas");
        System.out.println("2. Ver clientes");
        System.out.println("3. Ver citas");
        System.out.println("0. Si desea volver al menu principal");
        int opc=s.nextInt();
        switch(opc){
            case 1 -> {
                System.out.println("Has ingresado al apartado de mascotas");
                veterinary.Pets();
            }
            case 2 -> {
                System.out.println("Has ingresado al apartado de clientes");
                veterinary.Customer();
            }
            case 3 -> {
                System.out.println("Has ingresado al apartado de citas");
                veterinary.Citas();
            }
        }

    }
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //getters y setters
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }


    
    public String getAddress() {
        return Address;
    }
    
    public void setAddress(String Address) {
        this.Address = Address;
    }


    
    
    
    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }
    
    

}
