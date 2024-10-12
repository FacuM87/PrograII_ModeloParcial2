/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author facun
 */
public class HabitacionDeluxe extends Habitacion {

    private boolean incluyeDesayuno;
    private double tarifaDesayuno;
    private int numeroNochesMinimas;

    public HabitacionDeluxe(boolean incluyeDesayuno, double tarifaDesayuno, int numeroNochesMinimas, String codHabitacion, double precioPorNoche) {
        super(codHabitacion, precioPorNoche);
        this.incluyeDesayuno = incluyeDesayuno;
        this.tarifaDesayuno = tarifaDesayuno;
        this.numeroNochesMinimas = numeroNochesMinimas;
    }


    @Override
    public double calcularPrecioEstadia(int dias) {
        double precioTotal;
        double precioEstadia = this.precioPorNoche * dias; 
        
        if (dias>7){
            if (this.incluyeDesayuno){
                precioTotal = (this.precioPorNoche + this.getTarifaDesayuno()) * dias *0.9;
            } else {
                precioTotal = precioEstadia *0.9;
            }
            
        } else if(dias < this.numeroNochesMinimas) {
           
            if (this.incluyeDesayuno){
                precioTotal = (this.precioPorNoche + this.getTarifaDesayuno()) * dias * 1.2;
            }else{
                precioTotal = precioEstadia * 1.2;
            }
            
        } else{
            if (this.incluyeDesayuno){
                precioTotal = (this.precioPorNoche + this.getTarifaDesayuno()) * dias;
            }else{
                precioTotal = precioEstadia;
            }
            
            
        }      
        
        
    return precioTotal;
    }

    @Override
    public String toString() {
        return "HabitacionDeluxe{" + "incluyeDesayuno=" + incluyeDesayuno + ", tarifaDesayuno=" + tarifaDesayuno + ", numeroNochesMinimas=" + numeroNochesMinimas + '}';
    }
        

    public boolean isIncluyeDesayuno() {
        return incluyeDesayuno;
    }

    public void setIncluyeDesayuno(boolean incluyeDesayuno) {
        this.incluyeDesayuno = incluyeDesayuno;
    }

    public double getTarifaDesayuno() {
        return tarifaDesayuno;
    }

    public void setTarifaDesayuno(double tarifaDesayuno) {
        this.tarifaDesayuno = tarifaDesayuno;
    }

    public int getNumeroNochesMinimas() {
        return numeroNochesMinimas;
    }

    public void setNumeroNochesMinimas(int numeroNochesMinimas) {
        this.numeroNochesMinimas = numeroNochesMinimas;
    }

    
    
}
