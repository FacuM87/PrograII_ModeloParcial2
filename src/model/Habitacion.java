
package model;


public abstract class Habitacion {
    protected String codHabitacion;
    protected boolean ocupada = false;
    protected double precioPorNoche;

    public Habitacion(String codHabitacion, double precioPorNoche) {
        if(codHabitacion.length() == 5){
            this.codHabitacion = codHabitacion;
        }else{
            throw new IllegalArgumentException("codHabitacion debe tener 5 caracteres");
        }
        
        this.precioPorNoche = precioPorNoche;
    }

    public String getCodHabitacion() {
        return codHabitacion;
    }

    public void setCodHabitacion(String codHabitacion) {
        this.codHabitacion = codHabitacion;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }
    
    
    public abstract double calcularPrecioEstadia(int dias);
}
