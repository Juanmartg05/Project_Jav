
package proyecto;

import java.util.ArrayList;
import java.util.Scanner;


public class Pet{
    

    
    
    Scanner s = new Scanner(System.in);
    // Declaracion de variables
    private static ArrayList <Pet> Pet1 = new ArrayList<>(); //decir por que utilizamos static
    
    private String Name;
    private int Code;
    private int Year;
    private String Race;
    private String Color;
    private String Status;
    
    //constructores

    //(01,2005,bulldog,cafe,vivo)
    public Pet(int Code, int Year, String Race, String Color, String Status, String Name) {
        this.Code = Code;
        this.Year = Year;
        this.Race = Race;
        this.Color = Color;
        this.Status = Status;
        this.Name = Name;
    }

    public Pet() {
    }
    


    //Metodos
    public void Add_pet(){          //Permite añadir una mascota
        
        System.out.println("A continuacion ingresa los datos del cliente");
        
        System.out.println("Ingrese el nombre de su mascota");
        String name = s.nextLine();
        
        System.out.println("Ingrese el codigo de la mascota:");
        int code = s.nextInt();

        System.out.println("Ingrese el anio de nacimiento de la mascota:");
        int year = s.nextInt();

        s.nextLine(); // Limpiar el buffer del scanner

        System.out.println("Ingrese la raza de la mascota:");
        String race = s.nextLine();

        System.out.println("Ingrese el color de la mascota:");
        String color = s.nextLine();

        System.out.println("Ingrese el estado de la mascota:");
        String status = s.nextLine();
        
        
        Pet pet = new Pet(code,year,race,color,status,name);
        
        Pet1.add(pet);
    }
    
    
    public void Search_pet(){       //Permite buscar una Mascota
        System.out.println("Digite la identificacion de la mascota que desea buscar");
        int id=s.nextInt();
        boolean encontrado= false;
        
        
         for (Pet pet : Pet1) 
        {
            if (pet.getCode() == id) 
            {
                encontrado = true;
                System.out.println("Mascota encontrada:");
                System.out.println("Codigo: " + pet.getCode());
                System.out.println("Anio de nacimiento: " + pet.getYear());
                System.out.println("Raza: " + pet.getRace());
                System.out.println("Color: " + pet.getColor());
                System.out.println("Estado: " + pet.getStatus());
                break;
            }
        }
        if(!encontrado){
            System.out.println("No se encontro ninguna mascota con ese codigo");
        }
    }
    
    public void Quit_pet(){         //Permite quitar una mascota
        System.out.println("Digite la identificacion de la mascota que desea quitar");
        int id=s.nextInt();
        boolean encontrado = false;
        
        Pet petdelete = new Pet();
        
        for (Pet pet: Pet1){
            
            if(pet.getCode() == id){
                encontrado=true;
                petdelete=pet;
            }
        }
        
        if(encontrado){
            Pet1.remove(petdelete);
            System.out.println("La mascota con el codigo que digito ha sido borrada");
        }
        else{
            System.out.println("No se encontro mascota con ese codigo");
        }
        
    }
    
    public void Change_pet(){
        System.out.println("Digite la identificacion de la mascota a la que desea cambiar");
        int id = s.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < Pet1.size(); i++) { // se utilizo un for normal por que el for each no se puede utilizar para ir iterando
            Pet pet = Pet1.get(i);
            if (pet.getCode() == id) {
                
                encontrado = true;
            
                System.out.println("Ingrese el nuevo anioo de nacimiento de la mascota:");
                int year = s.nextInt();
                s.nextLine(); 

                System.out.println("Ingrese la nueva raza de la mascota:");
                String race = s.nextLine();

                System.out.println("Ingrese el nuevo color de la mascota:");
                String color = s.nextLine();

                System.out.println("Ingrese el nuevo estado de la mascota:");
                String status = s.nextLine();

            // Modificar los atributos de la mascota
                pet.setYear(year);
                pet.setRace(race);
                pet.setColor(color);
                pet.setStatus(status);

                System.out.println("Mascota modificada");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ninguna mascota con ese código");
        }
    }
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //getters y setters
    
    

    
    


    /**
     * @param Pet1 the Pet1 to set
     */
    public void setPet1(ArrayList <Pet> Pet1) {
        this.Pet1 = Pet1;
    }

    /**
     * @return the Code
     */
    public int getCode() {
        return Code;
    }

    /**
     * @param Code the Code to set
     */
    public void setCode(int Code) {
        this.Code = Code;
    }

    /**
     * @return the Year
     */
    public int getYear() {
        return Year;
    }

    /**
     * @param Year the Year to set
     */
    public void setYear(int Year) {
        this.Year = Year;
    }

    /**
     * @return the Race
     */
    public String getRace() {
        return Race;
    }

    /**
     * @param Race the Race to set
     */
    public void setRace(String Race) {
        this.Race = Race;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }
    
    public static ArrayList<Pet> getPetList() {
        return Pet1;
    }
    
    
    
    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }
    
    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }
    
    
    

    
    
    
    
    
    
    
}
