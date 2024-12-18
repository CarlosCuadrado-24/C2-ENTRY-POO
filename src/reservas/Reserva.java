package src.reservas;

import src.clientes.Cliente;
import src.habitaciones.Habitacion;

import java.time.LocalDate;

public class Reserva {

    private Cliente cliente;
    private Habitacion habitacion;
    private int cantHabitaciones;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;


    public Reserva(Cliente cliente, Habitacion habitacion, int cantHabitaciones, LocalDate fechaInicio, LocalDate fechaFin) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.cantHabitaciones = cantHabitaciones;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void mostrarInfoReserva(){
        System.out.println("Reserva encontrada:");
        System.out.println("Cliente: " + this.cliente.getNombre() +" "+ this.cliente.getApellido());
        System.out.println("Habitacion: " + habitacion.getNombre());
        System.out.println("Cantidad de habitaciones: " + this.cantHabitaciones);
        System.out.println("Hora de llegada: " + this.cliente.getHoraLlegada());
        System.out.println("Fecha de inicio: " + this.fechaInicio);
        System.out.println("Fecha de fin: " + this.fechaFin);
        System.out.println("-------------------");
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}
