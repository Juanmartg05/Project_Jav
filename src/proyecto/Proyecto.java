
package proyecto;


import java.util.Scanner;


public class Proyecto {


    public static void main(String[] args) {
        
        int opc=0;
        Scanner s = new Scanner(System.in);
        boolean exit;
        
        Veterinaria veterinaria = new Veterinaria("Veterinaria Naturalia", "Cra 27", 6673993);
        
        
        
        do{
            try{
                exit=false;
                System.out.println("Hola bienvenido a la veterinaria Naturalia");
                System.out.println("Por favor seleccione una de las siguientes opciones");
                System.out.println("1.Ingresar como veterinario");
                System.out.println("2.Ingresar como cliente");
                opc=s.nextInt();
            
            
                switch(opc){
                    case 1:
                        veterinaria.Sign_veterinary();
                    break;
                    case 2:
                        veterinaria.Sign_customer();
                    
                    break;
                }
            
            
            }
            catch(Exception x){
                exit=true;
                System.out.println("tiene que digitar numeros en vez de letras o viceversa");
                s.nextLine();
            }
        }while(opc!=5);
        
    }   
}