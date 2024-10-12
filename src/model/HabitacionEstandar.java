package model;


public class HabitacionEstandar extends Habitacion {
    private boolean limpiezaIncluida;
    private double costoLimpieza;

    public HabitacionEstandar(String codHabitacion, double precioPorNoche, boolean limpiezaIncluida, double costoLimpieza) {
        super(codHabitacion, precioPorNoche);
        this.limpiezaIncluida = limpiezaIncluida;
        this.costoLimpieza = costoLimpieza;
    }

    @Override
    public String toString() {
        return "HabitacionEstandar{" + "limpiezaIncluida=" + limpiezaIncluida + ", costoLimpieza=" + costoLimpieza + '}';
    }

    public boolean isLimpiezaIncluida() {
        return limpiezaIncluida;
    }

    public void setLimpiezaIncluida(boolean limpiezaIncluida) {
        this.limpiezaIncluida = limpiezaIncluida;
    }

    public double getCostoLimpieza() {
        return costoLimpieza;
    }

    public void setCostoLimpieza(double costoLimpieza) {
        this.costoLimpieza = costoLimpieza;
    }

    
   
    @Override
    public double calcularPrecioEstadia(int dias) throws Exception {
        if(dias<1){ throw new Exception("El numero de dias debe ser mayor a 0"); }
        
        double retorno;
        double precioTotalSinLimpieza = this.precioPorNoche * dias;
        if(this.limpiezaIncluida){            
            retorno = precioTotalSinLimpieza + this.costoLimpieza; 
        }else{
            retorno = precioTotalSinLimpieza;
        }
        
        return retorno;

    }
        
    
}
