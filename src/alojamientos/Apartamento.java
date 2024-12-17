package src.alojamientos;

import src.habitaciones.Habitacion;
import src.reservas.Reserva;

public class Apartamento extends Alojamiento {


    public Apartamento(String nombre, String ciudad, double calificacion, String tipo) {
        this.nombre = nombre;
        this.ciudad =ciudad;
        this.calificacion=calificacion;
        this.tipo="apartamento";
        this.habitaciones = new Habitacion[5];
        this.reservas = new Reserva[99];
    }

    @Override
    public double calcularPrecioBase() {
        return 0;
    }

    @Override
    public double calcularDescuentoOAumento() {
        return 0;
    }

    @Override
    public void mostrarInformacionAlojamiento() {
        System.out.println("Alojamiento: " + this.nombre);
        System.out.println("Calificación: " + this.calificacion);
        System.out.println("Tipo: " + this.tipo);
        //System.out.println("Precio por noche: " + preciosTotales[0]);
        //System.out.println("Precio total (días): " + preciosTotales[1]);
        System.out.println("-------------------");
    }

    @Override
    public void mostrarInformacionHabitaciones() {

    }
}
