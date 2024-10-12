package model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String nombreHotel;
    private List<Habitacion> inventarioHabitaciones;

    public Hotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
        this.inventarioHabitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) throws Exception {
        for (Habitacion h : inventarioHabitaciones) {
            if (h.getCodHabitacion().equals(habitacion.getCodHabitacion())) {
                throw new Exception("El código de la habitación ya se encuentra ingresado.");
            }
        }
        inventarioHabitaciones.add(habitacion);
    }

    public boolean reservarHabitacion(String codigoHabitacion, int dias) throws Exception {
        for (Habitacion habitacion : inventarioHabitaciones) {
            if (habitacion.getCodHabitacion().equals(codigoHabitacion) && habitacion.isOcupada()) {
                throw new Exception("La habitacion esta ocupada");
            } else if(habitacion.getCodHabitacion().equals(codigoHabitacion)){
                if (habitacion instanceof HabitacionDeluxe habitacionDeluxe) {
                    if (habitacionDeluxe.getNumeroNochesMinimas() > dias) {
                        throw new Exception("No se alcanza el minimo de noches para Habitacion Deluxe");
                    } else {
                        habitacionDeluxe.setOcupada(true);
                        return true;
                    }
                } else {
                    habitacion.setOcupada(true);
                    return true;
                }
            }
        }
        throw new Exception("El codigo de habitacion es inexistente");

    }

    public boolean liberarHabitacion(String codigoHabitacion) throws Exception {
        for (Habitacion habitacion : inventarioHabitaciones) {
            if (habitacion.getCodHabitacion().equals(codigoHabitacion)) {
                if (habitacion.isOcupada()) {
                    habitacion.setOcupada(false);
                    return true;
                } else {
                    throw new Exception("La habitacion no se encontraba ocupada");
                }
            }
        }
        throw new Exception("El codigo de habitacion es inexistente");
    }

    public double calcularCostoEstadia(String codigoHabitacion, int dias) throws Exception {
        for (Habitacion habitacion : inventarioHabitaciones) {
            if (habitacion.getCodHabitacion().equals(codigoHabitacion)) {
                if (habitacion.isOcupada()) {
                    return habitacion.calcularPrecioEstadia(dias);
                } else {
                    throw new Exception("La habitacion esta desocupada");
                }
            }
        }
        throw new Exception("El codigo de habitacion no existe");

    }
}
