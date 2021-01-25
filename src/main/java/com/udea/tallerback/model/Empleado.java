package com.udea.tallerback.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEmpleado;
    @NotNull
    private int cedulaEmpleado;
    private String nombreEmpleado;
    private int telefonoEmpleado;
    private String correoEmpleado;
    private Date fechaInicioEmpleado;
    private Date fechaFinEmpleado;
    private String apellidoEmpleado;
    private String usuarioInicioEmpleado;
    private String usuarioFinEmpleado;

    public Empleado(int idEmpleado, int cedulaEmpleado, String nombreEmpleado, int telefonoEmpleado, String correoEmpleado, Date fechaInicioEmpleado, Date fechaFinEmpleado, String apellidoEmpleado, String usuarioInicioEmpleado, String usuarioFinEmpleado) {
        this.idEmpleado = idEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.fechaInicioEmpleado = fechaInicioEmpleado;
        this.fechaFinEmpleado = fechaFinEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.usuarioInicioEmpleado = usuarioInicioEmpleado;
        this.usuarioFinEmpleado = usuarioFinEmpleado;
    }

    public Empleado() {
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(int cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(int telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public Date getFechaInicioEmpleado() {
        return fechaInicioEmpleado;
    }

    public void setFechaInicioEmpleado(Date fechaInicioEmpleado) {
        this.fechaInicioEmpleado = fechaInicioEmpleado;
    }

    public Date getFechaFinEmpleado() {
        return fechaFinEmpleado;
    }

    public void setFechaFinEmpleado(Date fechaFinEmpleado) {
        this.fechaFinEmpleado = fechaFinEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getUsuarioInicioEmpleado() {
        return usuarioInicioEmpleado;
    }

    public void setUsuarioInicioEmpleado(String usuarioInicioEmpleado) {
        this.usuarioInicioEmpleado = usuarioInicioEmpleado;
    }

    public String getUsuarioFinEmpleado() {
        return usuarioFinEmpleado;
    }

    public void setUsuarioFinEmpleado(String usuarioFinEmpleado) {
        this.usuarioFinEmpleado = usuarioFinEmpleado;
    }
}
