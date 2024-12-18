package src.alojamientos;

import src.habitaciones.Habitacion;
import src.reservas.Reserva;

public class Hotel extends Alojamiento {

    public Hotel(String nombre, String ciudad, double calificacion, String tipo) {
        this.nombre = nombre;
        this.ciudad =ciudad;
        this.calificacion=calificacion;
        this.tipo="hotel";
        this.habitaciones = new Habitacion[5];
        this.reservas = new Reserva[99];
        this.cantHabitaciones = new int[5];
    }

    public Hotel(String nombre, String ciudad, double calificacion, String tipo, Habitacion[] habitaciones, Reserva[] reservas, int[] cantHabitaciones) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.calificacion = calificacion;
        this.tipo = "hotel";
        this.habitaciones =  habitaciones;
        this.reservas =  reservas;
        this.cantHabitaciones =  cantHabitaciones ;
    }


    public Hotel() {
    }

    @Override
    public double calcularPrecioBase(int numHabitaciones) {
        this.precio = this.obtenerPrecioHabitacionMasBarata()*numHabitaciones;
        return precio;
    }


    @Override
    public double calcularDescuentoOAumento( int diaInicio, int diaFinalizacion) {
        double descuentoOAumento = 0.0;

        // Verificar si se ha calculado el precio base
        if (this.precio == 0.0) {
            System.out.println("Primero debe calcular el precio base.");
            return 0.0;
        }

        // Aplicar lógica de descuento/aumento
        if (diaInicio >= 26 && diaFinalizacion <= 31) {
            descuentoOAumento = this.precio * 0.15; // Aumento del 15%
            this.precioTotal = this.precio + descuentoOAumento;
        } else if (diaInicio >= 10 && diaFinalizacion <= 15) {
            descuentoOAumento = this.precio * 0.10; // Aumento del 10%
            this.precioTotal = this.precio + descuentoOAumento;
        } else if (diaInicio >= 5 && diaFinalizacion <= 10) {
            descuentoOAumento = this.precio * 0.08; // Descuento del 8%
            this.precioTotal = this.precio - descuentoOAumento;
        } else {
            // Sin descuento ni aumento
            this.precioTotal = this.precio;
        }

        return this.precioTotal;
    }


    @Override
    public void mostrarInformacionAlojamiento(int numHabitaciones, int diaInicio, int diaFinalizacion){
        System.out.println("Alojamiento: " + this.nombre);
        System.out.println("Calificación: " + this.calificacion);
        System.out.println("precio: " + calcularPrecioBase(numHabitaciones));
        System.out.println("Precio Total: " + calcularDescuentoOAumento(diaInicio,diaFinalizacion));
        System.out.println("-------------------");
    }

    @Override
    public void mostrarInformacionHabitaciones(int cantHabitacionesParametro) {
        System.out.println("=== Información de Habitaciones ===");
        for (int i = 0; i < this.habitaciones.length; i++) {
            if (this.cantHabitaciones[i] > cantHabitacionesParametro && this.habitaciones[i] != null) {
                System.out.println("Habitación " + (i + 1) + ":");
                habitaciones[i].mostrarInfoHabatiacion();
            }
        }
        System.out.println("===================================");
    }

}
