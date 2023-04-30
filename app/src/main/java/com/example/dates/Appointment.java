package com.example.dates;

public class Appointment {
    private String nombre;
    private String identificacion;
    private String doctor;
    private String especialidad;
    private String fecha;
    private String hora;

    public Appointment(String nombre, String identificacion, String doctor, String especialidad, String fecha, String hora) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.doctor = doctor;
        this.especialidad = especialidad;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
}

