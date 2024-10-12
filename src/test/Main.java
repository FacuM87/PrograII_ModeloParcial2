
package test;

import model.HabitacionDeluxe;
import model.HabitacionEstandar;
import model.Hotel;


public class Main {


    public static void main(String[] args) {
        try{
            System.out.println("1-1");
            HabitacionEstandar nuevaHabitacionEstandar = new HabitacionEstandar("1001", 80, true,0);
            System.out.println(nuevaHabitacionEstandar);
            
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
       
        try{
            System.out.println("1-2");
            HabitacionEstandar nuevaHabitacionEstandar = new HabitacionEstandar("10021", 90, false,15);
            System.out.println(nuevaHabitacionEstandar);
        
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        try{
            System.out.println("1-3");
            HabitacionEstandar nuevaHabitacionEstandar1 = new HabitacionEstandar("10011", 80, true,15);
            
            System.out.println("3 dias en nuevaHabitacionEstandar1: $"+nuevaHabitacionEstandar1.calcularPrecioEstadia(3));
        
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        try{
            System.out.println("1-4");
            HabitacionEstandar nuevaHabitacionEstandar2 = new HabitacionEstandar("10022", 90, false,0);
            
            System.out.println("4 dias en nuevaHabitacionEstandar2: $"+nuevaHabitacionEstandar2.calcularPrecioEstadia(4));
        
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        try{
            System.out.println("2-1");
            HabitacionDeluxe nuevaHabitacionDeluxe1 = new HabitacionDeluxe(true, 25, 2, "20021", 250);
            System.out.println(nuevaHabitacionDeluxe1);
        
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
               
        
        try{
            System.out.println("2-2");
            HabitacionDeluxe nuevaHabitacionDeluxe2 = new HabitacionDeluxe(false, 30, 1, "20022", 250);
            System.out.println(nuevaHabitacionDeluxe2);
        
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        try{
            System.out.println("2-3");
            HabitacionDeluxe nuevaHabitacionDeluxe3 = new HabitacionDeluxe(true, 25, 2, "20022", 200);
            System.out.println("8 dias en nuevaHabitacionDeluxe3: $"+nuevaHabitacionDeluxe3.calcularPrecioEstadia(8));
        
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        try{
            System.out.println("2-4");
            HabitacionDeluxe nuevaHabitacionDeluxe4 = new HabitacionDeluxe(true, 25, 2, "20023", 200);
            System.out.println("8 dias en nuevaHabitacionDeluxe4: $"+nuevaHabitacionDeluxe4.calcularPrecioEstadia(5));
 
        
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        try{
            System.out.println("2-5");
            HabitacionDeluxe nuevaHabitacionDeluxe5 = new HabitacionDeluxe(true, 25, 4, "20024", 200);
            System.out.println("8 dias en nuevaHabitacionDeluxe5: $"+nuevaHabitacionDeluxe5.calcularPrecioEstadia(3));
        
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        try{
            System.out.println("3-1");
            HabitacionEstandar nuevaHabitacionEstandar3 = new HabitacionEstandar("10026", 90, false,15);
            Hotel nuevoHotel = new Hotel("Hotel California");
            nuevoHotel.agregarHabitacion(nuevaHabitacionEstandar3);
            
            if (nuevoHotel.reservarHabitacion("10026", 3)){
                System.out.println("La habitacion "+nuevaHabitacionEstandar3.getCodHabitacion()+" fue reservada exitosamente");
            }
            
            if (nuevoHotel.liberarHabitacion("10026")){
                System.out.println("La habitacion "+nuevaHabitacionEstandar3.getCodHabitacion()+" fue liberada exitosamente");
            }
            
            
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        try{
            System.out.println("3-2");
            HabitacionEstandar nuevaHabitacionEstandar4 = new HabitacionEstandar("10027", 90, false,15);
            Hotel nuevoHotel = new Hotel("Hotel California");
            nuevoHotel.agregarHabitacion(nuevaHabitacionEstandar4);
            nuevoHotel.reservarHabitacion("10027", 5);
            nuevoHotel.reservarHabitacion("10027", 2);
            
        
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        try{
            System.out.println("3-3");
            HabitacionDeluxe nuevaHabitacionDeluxe6 = new HabitacionDeluxe(true, 30, 3, "20032", 250);
            double presupuesto = nuevaHabitacionDeluxe6.calcularPrecioEstadia(5);
            System.out.println("El presupuesto en la habitacion deluxe por 5 dias con desayuno incluido es de $"+presupuesto);
            
            
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        try{
            System.out.println("3-4");
            HabitacionEstandar nuevaHabitacionEstandar6 = new HabitacionEstandar("10029", 90, false,15);            
            Hotel nuevoHotel = new Hotel("Hotel California");
            nuevoHotel.agregarHabitacion(nuevaHabitacionEstandar6);
            
            HabitacionEstandar nuevaHabitacionEstandar7 = new HabitacionEstandar("10029", 90, false,15);
            nuevoHotel.agregarHabitacion(nuevaHabitacionEstandar7);
            
        
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
          
    }
    
}
